package OJ;

import java.util.Scanner;

public class m1019 {
    public static void main(String[] args) {
        //Accepted
        int n;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = n; i < j; j--) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                for (int j = 1; j < i; j++) {
                    if(j == 1){
                        System.out.print("*");
                    }else System.out.print(" *");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
