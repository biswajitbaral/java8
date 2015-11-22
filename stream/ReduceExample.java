package java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceExample
{

    public static void main(String[] args)
    {

        List<Integer> values = Arrays.asList(12, 34, 54, 36, 87, 13, 4);
        Optional<Integer> sum = values.stream().reduce(Integer::sum);
        System.out.println("Sum = " + sum.get());

        int s = values.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Usingi Binary" + s);

        String[] arr =
        { "java", "Lamda", "python", "perl" };

        System.out.println("With Ordered  ########## >");
        Arrays.asList(arr).stream().parallel().forEachOrdered(System.out::println);

        System.out.println("Without Ordered  ###### >");

        Stream<String> parallelWords = Stream.of(arr).parallel();

        parallelWords.forEach(System.out::println);

        int[] shortWords = new int[12];

        IntSummaryStatistics stats = values.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println(stats);

    }

}
