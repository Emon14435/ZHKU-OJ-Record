package OJ;

import java.util.Scanner;

public class m1018 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            n = sc.nextInt();
            for(int i = n; i <= n; i--) {
                System.out.printf("* ");
            }
            System.out.println("*");
            for(int j = 0; j<=n-1;j++) {
                System.out.print(" ");
            }
        }
    }
}
