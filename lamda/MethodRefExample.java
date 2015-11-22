package java8.lamda;

interface WithOnlyOneMethod
{
    public void referenceDemo();

}

public class MethodRefExample
{

    public static void commonMethod()
    {
        System.out.println("This method is already defined.");
    }

    public static void commonMethod1()
    {
        System.out.println("This method is already defined.wdfvwef");
    }

    public static void implement()
    { // Anonymous class.

        System.out.println("Before java 8");
        WithOnlyOneMethod demoOne = new WithOnlyOneMethod()
        {
            @Override
            public void referenceDemo()
            {
                MethodRefExample.commonMethod();
            }

        };
        demoOne.referenceDemo();

        System.out.println(" java 8 Lamda");
        // Lambda implementaion.
        WithOnlyOneMethod demo = () -> MethodRefExample.commonMethod();
        demo.referenceDemo();
        // Method reference.
        System.out.println(" java 8 Reference");
        WithOnlyOneMethod demoTwo = MethodRefExample::commonMethod;
        demoTwo.referenceDemo();
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        implement();

    }

}
