package OJ;

public class m1027 {

    public static void main(String[] args) {
        for (int i = 1;i <= 999 ;i++ ) {                    //获取100到999之间的数
            int ge = i % 10;                                //123 % 10
            int shi = i / 10 % 10;                            //12 % 10;
            int bai = i / 10 / 10 % 10;                        //1 % 10
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
            }
        }
    }
}
