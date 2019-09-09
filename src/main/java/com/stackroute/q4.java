package com.stackroute;

class Member{
    public String Name;
    public int Age;
    public Double Salary = 0.0;
}

public class q4{
    public String setName(String name){
        Member obj = new Member();
        obj.Name = name;
        return obj.Name;
    }

    public Double setSalary(Double salary){
        Member obj = new Member();
        obj.Salary = salary;
        return obj.Salary;
    }

    public int setAge(int Age){
        Member obj = new Member();
        obj.Age = Age;
        return obj.Age;
    }
}