package org.example.Lesson6;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChoosePhoneTest {
    WebDriver driver;
    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();
    }
    @Test
    @Feature("Отбор товаров")
    @Issue("123")
    @TmsLink("12345")
    void choosePhoneTest() {
        driver.get("https://www.21vek.by");
        new MainPage(driver).inputSearch();
        new MainPage(driver).searchList();
        new PhonePage(driver).searchPhone();
        new SuccessBlock(driver).verificationSuccessSelection();
    }
    @AfterEach
    void killBrowser() {
        driver.quit();
    }
}
