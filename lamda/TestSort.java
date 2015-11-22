package java8.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSort
{
    private static List<Name> names = Arrays.asList(new Name("Ramana", "Sumudrikam"), new Name("Seema", "Jain")

            );

    private static void oldJavaWay()
    {

        Collections.sort(names, new Comparator<Name>()
                {
            @Override
            public int compare(Name n1, Name n2)
            {
                return n1.firstName.compareTo(n2.firstName);
            }
                });
        printListOldWay();
    }

    private static void printListOldWay()
    {
        System.out.println("Before Java8..");

        for (Name n : names)
        {
            System.out.println("\t" + n);
        }

        System.out.println();
    }

    private static void newJavaWay()
    {

        Collections.sort(names, (Name n1, Name n2) -> {
            return n1.lastName.compareTo(n2.lastName);
        });
        printListNewWay();
    }

    private static void printListNewWay()
    {
        System.out.println("After Java8..");

        names.forEach(n -> System.out.println(n));
        System.out.println();
    }

    public static void main(String[] args)
    {
        oldJavaWay();
        newJavaWay();
    }

}

class Name
{
    String firstName;
    String lastName;

    Name(String fst, String lst)
    {

        this.firstName = fst;
        this.lastName = lst;
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }

}