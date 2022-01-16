package OJ;

import java.util.Scanner;

public class m1020 {
    public static void main(String[] args) {
        //Accepted
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int b = in.nextInt();
            int v = 0;
            for (int a = 0; a < b; a++) {
                for (int c = 0; c < b; c++) {
                    v++;
                    if (c == b - 1) {
                        System.out.print(v);
                    }else System.out.print(v+" ");
                }
                System.out.println();

            }
        }
    }
}
