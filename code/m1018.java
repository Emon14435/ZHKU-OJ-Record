package OJ;

import java.util.Scanner;

public class m1018 {
    //Accepted
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");//题目是两个空格，大概就是（行数-1）*2，这里用两个空格代替
                }
                for (int k = 0; k < n - 1; k++) {
                    System.out.print("* ");
                }
                System.out.println("*");
            }
        }
    }
}
