package OJ;

import java.util.Scanner;

public class o1092 {
    //TODO
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                int min = arr[0];
                int zhi = 0;
                for (int b = 1; b < n; b++) {
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                    zhi++;
                }
            }
            //补个输出就行
        }
    }
}