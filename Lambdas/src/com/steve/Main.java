package com.steve;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        new  Thread(()-> {
//            System.out.println("Printing from Lambda");
//            System.out.println("Line 2");
//            System.out.format("This is line %d\n",3);
//        }).start();

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

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

//        Collections.sort(employees, ( employee1, employee2) ->
//            employee1.getName().compareTo(employee2.getName()));
//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//        }


//        String sillyString = doStringStuff(new Employee.UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        },
//                employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);
//
//
//        Employee.UpperConcat uc = ( s1, s2) -> {
//           String result  =  s1.toUpperCase() + s2.toUpperCase();
//           return result;
//        };
//
//        String sillyString = doStringStuff(uc,employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);

    }

    public final static String doStringStuff(Employee.UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1,s2);
    }
}

class Employee {
    private  String name;
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

    interface UpperConcat {
        public String upperAndConcat(String s1, String s2);
    }
}

class AnotherClass {
    public String doSomething() {
        return Main.doStringStuff(new Employee.UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, "String1", "String2" );
    }
}