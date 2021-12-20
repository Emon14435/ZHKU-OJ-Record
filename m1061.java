package OJ;

public class m1061 {
    public static void main(String[] args) {
        String o = "";
        for (int i = 100; i <= 300; i++) {
          if (i % 3 != 0 && i % 5 != 0) {
            o += i + " ";
          }
        }
        System.out.println(o.trim());
      }
}
