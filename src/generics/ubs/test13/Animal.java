package generics.ubs.test13;

public class Animal {
    {
        System.out.println("A");
    }

    public Animal() {
        System.out.println("B");
    }

    static {
        System.out.println("E");
    }
}

class Reptile extends Animal {
    static {
        System.out.println("C");
    }
    public Reptile() {
        System.out.println("D");
    }
}

class Alligator extends Reptile {
    public static void main(String[] args) {
        System.out.println("Before");
        new Alligator();
        System.out.println("After");
    }
}

