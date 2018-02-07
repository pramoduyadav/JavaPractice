package annotations;

import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Smartphone {
    String osname();

    int version();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Price {
    int rupees();
}


@Price(rupees = 25000)
@Smartphone(osname = "Android", version = 1)
class NokiaASeries {

    public NokiaASeries() {

    }
}

public class CustomAnnotation {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        NokiaASeries nokiaASeries = new NokiaASeries();
        Class a = nokiaASeries.getClass();
        Annotation at = a.getAnnotation(Smartphone.class);
        Smartphone sp = (Smartphone) at;
        System.out.println(sp.osname());
        System.out.println(sp.version());

        Annotation[] atArray = a.getAnnotations();
        for (Annotation object : atArray) {
            Class aClass = object.getClass();

            // System.out.println(aClass.getName());
//       System.out.println(aClass);
            Method[] m = aClass.getDeclaredMethods();
            for (Method md : m) {

                System.out.println(md.invoke(md.getDefaultValue()));

            }


            //         Method[] m = object.annotationType().getDeclaredMethods();
            // System.out.println(object.annotationType());
        }

    }


}
