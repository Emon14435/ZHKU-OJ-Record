package OJ;

import java.util.Scanner;

public class m1015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int[] array = new int[3];
            int x[] = {-1,-1,-1};
            int max = 0;
            for(int i = 0;i<3;i++){
                array[i] = in.nextInt();
                if (array[i] > max) {
                     max = array[i];
                }
            }
            if(array != x) System.out.println(max);
        }
    }
}
