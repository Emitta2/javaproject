package javalab;

import java.util.Scanner;
public class employeedetails {
 public static void main(String [] args) {
  Officer officer=new Officer();
  officer.getdetails();
  officer.getsalary();
  officer.getspecialisation();
  System.out.println("Officer Details:");
  officer.printdetails();
  officer.printspecialisation();
  Manager manager=new Manager();
  manager.getdetails();
  manager.getdepartment();
  manager.getsalary();
  System.out.println("Manager Details:");
  manager.printdetails();
  manager.printdepartment();
 }

}
class Employee{
 Scanner sc=new Scanner(System.in);
 String name,address;
 int salary,age;
 long phoneNumber;
 public void getdetails() {
  System.out.println("enter the name:");
  name=sc.next();
  System.out.println("enter the address:");
  address=sc.next();
  System.out.println("enter age:");
  age=sc.nextInt();
  System.out.println("enter pnone number:");
  phoneNumber=sc.nextLong();
 }
 public void getsalary() {
  System.out.println("enter the salary:");
  salary=sc.nextInt();
 }
 public void printdetails(){
  System.out.println("Name:"+name);
  System.out.println("Address:"+address);
  System.out.println("Age:"+age);
  System.out.println("Phone Number:"+phoneNumber);
  System.out.println("Salary:"+salary);
    }
}
class Officer extends Employee {
 String specialization;
 public void getspecialisation() {
  System.out.println("enter specialisation:");
  specialization=sc.next();
 }
 public void printspecialisation() {
  System.out.println("Specialization:"+specialization);
 }
	
	
}
class Manager extends Employee {
 String department;
 public void getdepartment() {
  System.out.println("enter department:");
  department=sc.next();
 }
 public void printdepartment() {
  System.out.println("Departement:"+department);
 }
}


