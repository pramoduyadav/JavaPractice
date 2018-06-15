package generics.ubs.test6;

public class OperatorTest {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        boolean z = false;
        int count = 0;
        if (z = true || y == 1) {
            count = count + 1;
        }
        if (z^false) {
            count = count + 1;
        }
        if (++x > 0 & y++ > 0) {
            count = count + 1;
        }

        System.out.println(count);
    }
}
