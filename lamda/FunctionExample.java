package java8.lamda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FunctionExample
{
    public static Integer DoOperation(BiFunction<Integer, Integer, Integer> bi, Integer i1, Integer i2)
    {
        return bi.apply(i1, i2);
    }

    public static boolean doBiPredict(BiPredicate<Integer, Integer> bi, Integer i1, Integer i2)
    {
        return bi.test(i1, i2);
    }

    public static void doPredicate(Predicate<String> condition, List<String> datas)
    {
        for (String name : datas)
        {
            if (condition.test(name))
            {
                System.out.println(name + " ");
            }
        }

    }

    public static void main(String[] args)
    {
        // BiFunction Example

        // BiFunction accepts two arguments and returns a value.

        BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "Result:" + (num1 + num2);

        BiFunction<String, String, String> biFunction1 = (num1, num2) -> "Result:" + (num1 + num2);
        // BiFunction has function method as apply(T t, U u) which accepts two argument.

        System.out.println(biFunction.apply(12, 13));

        int result = FunctionExample.DoOperation((a, b) -> (a * b), 12, 13);

        System.out.println("Result :-  " + result);

        System.out.println(biFunction1.apply("Hello", "World"));

        // BiConsumer

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "first");
        map.put(2, "Second");
        map.put(3, "Thid");

        BiConsumer<Integer, String> biConsumer1 = (ip1, ip2) -> {
            System.out.println(ip1);
            System.out.println(ip2);
        };

        BiConsumer<String, String> biConsumer = (ip1, ip2) -> {
            System.out.println(ip1);
            System.out.println(ip2);
        };
        biConsumer.accept("Hi", "There");

        map.forEach(biConsumer1);

        // BiPredict

        boolean res = doBiPredict((a, b) -> a > b, 2, 3);
        System.out.println("Predict :- " + res);

        res = doBiPredict((a, b) -> a < b, 2, 3);

        System.out.println("BiPredict :- " + res);

        // Predicate

        List<String> abc = Arrays.asList("Hello ", "JAVA", "Lamda");
        doPredicate((str) -> (str).startsWith("J"), abc);

    }

}
