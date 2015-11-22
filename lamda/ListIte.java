package java8.lamda;

import java.util.Arrays;
import java.util.List;

public class ListIte
{

    public static void main(String[] args)
    {
        // Prior Java 8 :
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");

        for (String feature : features)
        {
            System.out.println(feature);
        }

        // In Java 8:

        features.forEach(l -> System.out.println(l));

        System.out.println("Another Way");

        features.forEach(System.out::println);
    }

}
