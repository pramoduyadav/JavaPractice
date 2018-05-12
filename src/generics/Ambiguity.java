package generics;

public class Ambiguity {
    public static void print(Number n) {
        System.out.println(n);
    }

    public static void print(Double n) {
        System.out.println(n);
    }


    public static void print(Float n) {
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(3);
    }
}
