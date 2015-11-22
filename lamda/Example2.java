package java8.lamda;

public class Example2
{

    public static void main(String[] args)
    {
        RunTest rt = new RunTest();
        System.out.println("######## Before Java 8 #####");

        rt.run(new Test()
        {

            @Override
            public void execute()
            {
                System.out.println(" Executed...");

            }

        }

                );

        System.out.println("########  Java 8 ######");

        rt.run(() -> {
            System.out.println("Executed");
            System.out.println("Multiple statements");

        });
        System.out.println("######## Before Java 8 With Parameter #####");

        RunTestWithR rt1 = new RunTestWithR();

        rt1.runR(new TestWithR()
        {

            @Override
            public int execute(int ip)
            {
                // TODO Auto-generated method stub
                return ip + 321;
            }

        });
        System.out.println("########  Java 8 With Parameter #####");

        rt1.runR((a) -> 45 + a);

    }

}

interface Test
{

    void execute();

}

interface TestWithR
{

    int execute(int ip);
}

class RunTestWithR
{
    public void runR(TestWithR t)
    {
        System.out.println("Going to execute Interface Test ");
        int data = 123;
        int sum = t.execute(data);
        System.out.println("Result == " + sum);
    }

}

class RunTest
{

    public void run(Test t)
    {
        System.out.println("Going to execute Interface Test ");
        t.execute();
    }

}