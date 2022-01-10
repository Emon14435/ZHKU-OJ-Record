package OJ;

import java.util.Scanner;

public class m1018 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            for (int z = 0; z < n; z++) {
                for (int i = 0; i <= n; i++) {
                    System.out.print("* ");
                }
                System.out.println("*");
                for (int j = 0; j <= n - 1; j++) {
                    System.out.print(" ");
                    //WARNING:这里没完工
                }
            }
        }
    }
}
