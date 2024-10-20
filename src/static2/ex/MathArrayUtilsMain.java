package static2.ex;

import static static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] value = {1, 2, 3, 4, 5};
        System.out.println("sum=" + sum(value));
        System.out.println("average=" + average(value));
        System.out.println("max=" + max(value));
        System.out.println("min=" + min(value));

        String a = "a";
        String b = "a";
        String c = new String("a");

        System.out.println(a == b);
        System.out.println(a == c);

    }
}
