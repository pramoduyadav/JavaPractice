package generics.ubs.test5;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        Test5 t = new Test5();
        t.test();
    }
    private void test() {
        Arrays.stream(new int[] {1,2,3,4})
             .map(n -> 3 * n + 1)
             .filter(i -> i > 10)
             .average()
             .ifPresent(System.out::println);
    }
}
