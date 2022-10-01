package integer;

import java.util.Scanner;

public class Integer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter L in centimeters: ");
        int l = sc.nextInt();

        double meters = l / 100.0;

        System.out.println(l + " centimeters is " + meters + " meters");
    }
}
