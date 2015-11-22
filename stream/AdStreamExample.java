package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AdStreamExample
{

    public static void main(String[] args)
    {
        List<Employee> persons = Arrays.asList(new Employee("Seema", "Engg", 25), new Employee("baral", "Labour", 4),
                new Employee("Mahesh", "Manager", 100), new Employee("Vinay", "Lead", 70));

        List<Employee> empFil = persons.stream().filter((p) -> !p.designation.equals("Labour"))
                .collect(Collectors.toList());
        System.out.println(empFil);

        Map<String, Double> map = persons.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));

        map.forEach((key, value) -> {
            System.out.println(key + " > " + value);
        });

        Map<String, Employee> map1 = persons.stream().collect(Collectors.toMap(Employee::getName, Function.identity()));

        map1.forEach((key, value) -> {
            System.out.println(key + " ###> " + value);
        });

    }

}

class Employee
{

    String name;

    String designation;
    double salary;

    // This is the constructor of the class Employee
    public Employee(String name, String desg, double salary)
    {
        this.name = name;
        this.designation = desg;
        this.salary = salary;
    }

    /* Assign the designation to the variable designation. */
    public void empDesignation(String empDesig)
    {
        designation = empDesig;
    }

    public String getName()
    {
        return name;
    }

    public String getDesignation()
    {
        return designation;
    }

    /* Assign the salary to the variable salary. */
    public void empSalary(double empSalary)
    {
        salary = empSalary;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return name + " -> " + designation + " ->" + salary;
    }
}