package generics.ubs.test16;

class P extends Exception {}
class Q extends P {}
class R extends P {}
class S extends R {}

public class Test16 {
    public static void main(String[] args) {


        try {
            processQ();
            processP();
            processR();
            processS();



        }
        catch(S e) {

        }
        catch(Q e) {

        }
        catch(R e) {

        }
        catch(P e) {

        }

    }

    public static void processS() throws S {

    }

    public static void processQ() throws Q {

    }

    public static void processR() throws R {

    }

    public static void processP() throws P {

    }
}
