package Lesson4;

public class TriangleArea {
    public static Double triangleArea(int a, int b, int c) throws Exception {
        double a1 = a;
        double b1 = b;
        double c1 = c;
        if ((a1 <= b1 + c1) &
                (b1 <= a1 + c1) &
                (c1 <= a1 + b1)) {
            double p = (a1 + b1 + c1) / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("У треугольника со сторонами: " + a + ", " + b + ", " + c + " площадь равна: " + s);
            return s;
        } else throw new Exception("Треугольник не существует!");
    }
}
