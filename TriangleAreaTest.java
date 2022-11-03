package Lesson4;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class TriangleAreaTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleAreaTest.class);
    @BeforeAll
    static void beforeAll() {
        logger.debug("DEBUG");
    }
    @ParameterizedTest
    @CsvSource({"-1,-1,-1",
                "-1,1,1",
                "1,1,3"})
    @DisplayName("Тест несуществования треугольника")
    void triangleFalse(int a, int b, int c) {
        Assertions.assertAll(() -> Assertions.assertThrows(Exception.class, () -> TriangleArea.triangleArea(a, b, c)));
    }
    @ParameterizedTest
    @CsvSource({"0.0,0,0,0,0.1",
                "0.43301, 1, 1, 1, 0.00001",
                "433012.70189, 1000, 1000, 1000, 0.00001",
                "0,-333, 666, 999, 0.1",
                "0, 333, 666, 999, 0.1",
                "0, 2000000000, 1000000000, 1000000000, 0.1"})
    @DisplayName("Тест вычисления площади")
    void calcArea(double expectedArea, int a, int b, int c, double accuracy) throws Exception {
        Assertions.assertAll(() -> Assertions.assertEquals(expectedArea, TriangleArea.triangleArea(a, b, c), accuracy));
    }
}
