package OJ;

import java.util.Scanner;

public class m1015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int tmp1 = in.nextInt();
            int tmp2 = in.nextInt();
            int tmp3 = in.nextInt();
            if (tmp1 == -1 && tmp2 == -1 && tmp3 == -1) break;
            int max1 = Math.max(tmp1, tmp2);
            int max2 = Math.max(tmp2, tmp3);
            int max0 = Math.max(max1, max2);
            System.out.println(max0);
        }
    }
}
