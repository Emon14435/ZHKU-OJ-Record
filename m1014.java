package OJ;

import java.util.Scanner;

public class m1014{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextDouble()){
            double F = sc.nextDouble();
            double C = (F - 32)*5.0000/9;
            System.out.printf(String.format("%.4f\n", C));
        }
    }
}