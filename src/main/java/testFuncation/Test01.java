package testFuncation;


import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by bingye on 2019-04-17
 */
public class Test01 {


    public static void main(String[] args) {


        Collection<String> collection = Arrays.asList("1","2","3");

        Consumer<String> hello = item -> System.out.println("hello");

        collection.forEach(item -> System.out.printf("string [%s] \r\n",item));

        Supplier<String> supplier = () -> "adsf";

        System.out.println(supplier.get());
    }
}
