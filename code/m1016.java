package OJ;

import java.util.Scanner;

public class m1016 {
    /*
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()){
            int n = in.nextInt();
            int sum = 0;
            for(int i = 1; i<n; ++i){
                sum +=i;
            }
            System.out.println(sum);
        }
    }
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
           int a = sc.nextInt();
           int sum = 0;
           for (int i = 0; i < a; i++) {
               if (i % 2 != 0) {
                   sum = sum + i;
               }
        }
        System.out.println(sum);
       }
    }

    
}
