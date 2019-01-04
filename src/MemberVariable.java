import java.util.Scanner;
 class Member {
    private String name;
    private int age;
    private double salary;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){

        this.age=age;
    }
    public int getAge(){

        return age;
    }
    public void setSalary(double salary){

        this.salary=salary;
    }
    public double getSalary(){

        return salary;
    }
}


public class MemberVariable {
    public static void main(String args[]){
        Member obj = new Member();
        System.out.println("Enter the name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        obj.setName(name);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        obj.setAge(age);
        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();
        obj.setSalary(salary);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: "+obj.getAge());
        System.out.println("Salary: "+obj.getSalary());
    }
}