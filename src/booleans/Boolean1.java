package booleans;

import java.util.Scanner;

public class Boolean1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();

        boolean isPositive = a > 0;

        System.out.println("A soni musbatmi? " + isPositive);
    }
}
