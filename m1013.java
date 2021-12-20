package OJ;

import java.util.Scanner;

public class m1013 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        while(in.hasNextInt()){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = 2*a + 2*b;
            int s = a*b;
            System.out.println(c + "," + s);
        }

    }
    
}
