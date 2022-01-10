package OJ;

import java.util.Scanner;

public class m1092 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = 0;
        int f = 0;
        int c = Integer.MAX_VALUE;
        if (in.hasNextLine()) {
            String[] o = in.nextLine().split(" ");
            for (String i : o) {
                p++;
                int t = Integer.parseInt(i);
                if (t < c) {
                    f = p;
                    c = t;
                }
            }
            System.out.println(c);
            System.out.println(f);
        }
    }
}