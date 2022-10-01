package integer;

import java.util.Scanner;

public class Integer25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter K (1 <= K <= 365): ");
        int k = sc.nextInt();

        int weekDay = (k + 3) % 7;

        System.out.println("Yilning " + k + " chi kuni haftaning " + weekDay + " chi kuniga to'gri keladi");
    }
}
