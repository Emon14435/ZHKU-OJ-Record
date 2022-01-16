package OJ;

public class m1033 {
    public static void main(String[] args) {
        //Accepted
        for (int cook = 0; cook <= 100 / 3; cook++) {
            for (int hen = 0; hen <= (100 - 3 * cook) / 2; hen++) {
                int chicken = 100 - cook - hen;
                double money = 3 * cook + 2 * hen + chicken / 3.0;
                if (money == 100) {
                    System.out.printf("cook=%d,hen=%d,chick=%d\n", cook, hen, chicken);
                }
            }
        }
    }
}