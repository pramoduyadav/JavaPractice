package generics.pair;

public class Util {
    public static void main(String[] args) {
        Pair<String, String> p1 = new Pair<>("Harish", "Pramod");
        Pair<String, String> p2 = new Pair<>("Pramod", "Pramod");
        System.out.println(compare(p1,p2));

    }
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}