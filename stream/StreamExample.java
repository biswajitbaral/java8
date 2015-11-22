package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample
{
    public static void doIterate()
    {
        List<String> languages = Arrays.asList("Java", "python", "perl", "shell");

        languages.stream().forEach(lang -> System.out.println(lang));
        languages.stream().forEach(System.out::println);
        // filter
        System.out.println("After Filter");
        languages.stream().filter((str) -> str.startsWith("p")).forEach(System.out::println);

        System.out.println("Use of map");

        languages.stream().filter((str) -> str.startsWith("p")).map(String::toUpperCase).forEach(System.out::println);

        languages.stream().filter((str) -> {
            System.out.println(">" + str);
            return false;
        }).map(String::toUpperCase).forEach(System.out::println);
        // parallel
        System.out.println("!!!!!!!!!!!Parallel");

        languages.parallelStream().filter((str) -> str.startsWith("p")).map(String::toUpperCase)
                .forEach(System.out::println);
        languages.stream().parallel().filter((str) -> !str.startsWith("p")).map(String::toUpperCase)
        .forEach(System.out::println);

        // Sorted
        System.out.println("#################Sorted.");
        languages.stream().sorted((s1, s2) -> {
            return s1.compareTo(s2);
        }).forEach(System.out::println);

        // search
        System.out.println("##################==search");
        boolean abc = languages.stream().filter((str) -> str.contains("python")).anyMatch(s -> true);
        System.out.println(abc);

        abc = languages.stream().filter((str) -> str.contains("pydfdathon")).anyMatch(s -> true);
        System.out.println(abc);

    }

    public static void main(String[] args)
    {
        doIterate();

        Stream<String> song = Stream.of("s1", "s2", "s4", "s3");

        song.sorted().forEach(System.out::println);

        // Stream<String> echos = Stream.generate(() -> "Echo");

        // echos.forEach(System.out::println);

    }

}
