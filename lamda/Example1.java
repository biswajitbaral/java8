package java8.lamda;

public class Example1
{

    public static void main(String[] args)
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Before Java8 Example");
            }
        }).start();

        new Thread(() -> {
            System.out.println("Lamda Executed");
        }).start();

    }

}
