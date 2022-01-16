package OJ;

import java.util.Scanner;

public class m1029 {

    public static void main(String[] args) {
        //Accepted
        Scanner in=new Scanner(System.in);

        while(in.hasNextInt()) {
            int n=in.nextInt();
            int N=1;
            System.out.println(N);
            for(int i=1;i<n;i++) {
                for(int j=0;j<=i;j++) {
                    N+=1;
                    if(j==i)
                        System.out.println(N);
                    else
                        System.out.print(N+" ");
                }
            }
        }
    }
}