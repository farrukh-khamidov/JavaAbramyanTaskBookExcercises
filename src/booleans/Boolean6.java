package booleans;

import java.util.Scanner;

public class Boolean6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();

        System.out.print("Enter C: ");
        int c = sc.nextInt();
        System.out.println("is A greater or equal B and less or equal C ?: " + (a <= b && b <= c));
    }
}
