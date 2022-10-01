package begin;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter (x1, y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter (x2, y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double a = Math.abs(x1 - x2);
        double b = Math.abs(y1 - y2);

        double perimeter = 2 * (a + b);
        double area = a * b;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
