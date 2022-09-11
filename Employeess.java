import java.io.*;
import java.util.*;
class Employee
{
    static  int empno;
    static double salary;
    static double totalsalary;
    Employee(double salary)
    {
        empno++;
        this.salary=salary;
        totalsalary=salary+totalsalary;
    }
    void display()
    {
        System.out.println("Employee Number: " +empno);
        System.out.println("Total Salary   : " +totalsalary);
    }
}
class Employeess
{
    public static void main(String args[])
    {
        float sal1,sal2,sal3,sal4,sal5;
        System.out.println("Enter First person salary");
        Scanner sc=new Scanner(System.in);
        sal1=sc.nextFloat();
        Employee e1=new Employee(sal1);
        e1.display();
        System.out.println("Enter Second person salary");
        sal2=sc.nextFloat();
        Employee e2=new Employee(sal2);
        e2.display();
        System.out.println("Enter Third person salary");
        sal3=sc.nextFloat();
        Employee e3=new Employee(sal3);
        e3.display();
        System.out.println("Enter Fourth person salary");
        sal4=sc.nextFloat();
        Employee e4=new Employee(sal4);
        e4.display();
        System.out.println("Enter Fifth person salary");
        sal5=sc.nextFloat();
        Employee e5=new Employee(sal5);
        e5.display();
    }
}