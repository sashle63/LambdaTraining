package com.steve;

// Module 294 - example 1
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

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

// Module 294 example 1
//class AnotherClass {
//    public String doSomething() {
//        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The anonymous class's name is: " + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2" );
//    }
//}

// Module 294 example 2
//class AnotherClass {
//    public String doSomething() {
//        UpperConcat uc = (s1, s2)  -> {
//            System.out.println("The lambda's name is: " + getClass().getSimpleName());
//            String result =  s1.toUpperCase() + s2.toUpperCase();
//            return result;
//        };
//        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
//        return Main.doStringStuff(uc, "String1", "String2" );
//    }
//}

// Module 294 example 2
//class AnotherClass {
//    public String doSomething() {
//        final int i = 0;
//        {
//            UpperConcat uc = new UpperConcat() {
//                @Override
//                public String upperAndConcat(String s1, String s2) {
//                    System.out.println("i in the anonymous class = " + i);
//                    return s1.toUpperCase() + s2.toUpperCase();
//                }
//            };
//            System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
////           i++;
//            System.out.println("i = " + i);
//            return Main.doStringStuff(uc, "String1", "String2" );
//        }
//    }
//}


// Module 294 example 3
class AnotherClass {
    public String doSomething() {
         int i = 0;
        {

        UpperConcat uc = (s1, s2)  -> {
            System.out.println("The lambda's expression's class is: " + getClass().getSimpleName());
            String result =  s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

            System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
//           i++;
            System.out.println("i = " + i);
            return Main.doStringStuff(uc, "String1", "String2" );
        }
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

//
//class AnotherClass {
//    public String doSomething() {
//        return Main.doStringStuff(new Employee.UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2" );
//    }
//}