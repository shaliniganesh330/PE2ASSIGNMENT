package com.stackroute.pe2;

public class MemberVariable {
    public Member member;
    /*constructor*/
    MemberVariable(){
        member = new Member();
    }
    /*getName method*/
    public String getName(String name) {
        if(name.equals(null))
            return null;
        member.setName(name);
        return member.getName();
    }
    public int getAge(int age) {
        member.setAge(age);
        return member.getAge();
    }
    public double getSalary(double salary) {
        member.setSalary(salary);
        return member.getSalary();
    }
}

