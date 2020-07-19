package com.steve;

// Module 295 - example 1
import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee homer = new Employee("Homer", 32);
        Employee bart = new Employee("Bart", 8);
        Employee lisa = new Employee("Lisa", 6);
        Employee maggie = new Employee("Maggie", 2);
        Employee marge = new Employee("Marge", 32);

        List<Employee> employees = new ArrayList<>();
        employees.add(homer);
        employees.add(bart);
        employees.add(lisa);
        employees.add(maggie);
        employees.add(marge);


//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//        }
//
//        System.out.println("****************************");
//        Employee employee;
//        for (int i=0; i<employees.size(); i++) {
//            employee = employees.get(i);
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//        }

//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//        }


        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        }) ;
    }

    public static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

// Module 295 example 1
class AnotherClass {
    public String doSomething() {
         int i = 0;
                UpperConcat uc = (s1, s2)  -> {
            System.out.println("The lambda's expression's class is: " + getClass().getSimpleName());
            System.out.println("i in the lambda expression = " + i);
            String result =  s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

            System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
            return Main.doStringStuff(uc, "String1", "String2" );
    }

    public void printValue  () {
        int number = 25;

        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println( "The value is " + number );
        };

    new Thread(r).start();
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

