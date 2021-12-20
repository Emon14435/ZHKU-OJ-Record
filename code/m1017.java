package OJ;

import java.util.Scanner;

public class m1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(sc.hasNextInt()) {
            n = sc.nextInt();
            for (int i = n; i >= 1; i--) {
                for (int j = 0; j < i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println("*");
            }
        }
    }
}
