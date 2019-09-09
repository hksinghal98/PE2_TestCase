package com.stackroute;

public class q7 {
    //names firstName, lastName age, and salary.
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    q7(String firstName, String lastName, int age, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary =salary;
    }

    public String getFirstName(){
        System.out.println(this.firstName);
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public int getSalary(){
        return this.salary;
    }
}
