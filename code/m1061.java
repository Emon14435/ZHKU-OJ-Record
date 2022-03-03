package OJ;

public class m1061 {
    //Accepted
    public static void main(String[] args) {
        StringBuilder o = new StringBuilder();
        for (int i = 100; i <= 300; i++) {
          if (i % 3 != 0 && i % 5 != 0) {
            o.append(i).append(" ");
          }
        }
        System.out.println(o.toString().trim());
      }
}
