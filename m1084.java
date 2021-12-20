package OJ;

import java.util.Scanner;

public class m1084 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;
        int num = 0;
        while(sc.hasNextInt()){
            n = sc.nextInt();
            num++;
            sum += n;
        }
        System.out.printf("%.3f\n",sum);
        System.out.printf("%.3f\n",sum/num);
    }
}
