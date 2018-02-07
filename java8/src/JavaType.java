import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaType {

    public static void main(String[] args) {

        String inputString = "ISIN1111|ISIN222|ISIN3333";
        Map<String, String> isinMap = new HashMap<>();
        isinMap.put("ISIN1111", "val111");
        isinMap.put("ISI2", "val2222");
        isinMap.put("ISIN3333", "val333");

        String splitOnWhitespace = null;
        try {
            splitOnWhitespace = Stream
                    .of(inputString)
                    .map(w -> w.split(Pattern.quote("|")))
                    .flatMap(Arrays::stream)
                    .map(s -> s.concat("-"))
                    .collect(Collectors.joining("|"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(splitOnWhitespace);


        Function<String, Exception> getMap;
        getMap = (String s) -> {
            if (isinMap.get(s) == null) try {
                throw new Exception("I m thrown");
            } catch (Exception e) {
                e.printStackTrace();
            }
            else {
                isinMap.get(s);
            }

            return null;

        };

    }


}
