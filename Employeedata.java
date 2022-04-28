import java.io.*;
import java.util.*;

class Employee
{
  String name;
  int age;
  long phone;
  String address;
  int sal;
  
  

  void printSalary()
  { 
    System.out.println("Salary "+sal);
   } 
  
}



class Officer extends Employee
{ 
    String splztn;
 
 

   void display()
	{
	 System.out.println("\nName: "+ name +"\nAge: "+age +"\nPhone Number: "+ phone +"\nAddress: "+ address + "\nSpecialization: " + splztn);
	}

} 
  


class Manager extends Employee
{ 
    String dept;
    
    
   void display()
	{
	 System.out.println("\nName: "+ name +"\nAge: "+age +"\nPhone Number: "+ phone +"\nAddress: "+ address + "\nDepartment: " + dept);
	}
} 
     
class Employeedata
{ 
  public static void main(String [] args)
  {
    Officer O = new Officer();
    Manager M = new Manager();
    Scanner ob = new Scanner(System.in);
    Scanner ob1 = new Scanner(System.in);
    
    System.out.println(" Enter the Officer's Name ");
    O.name = ob.nextLine();
    System.out.println(" Enter the Manager's Name ");
    M.name = ob1.nextLine(); 
    System.out.println(" Enter the Officer's Address ");
    O.address =  ob.nextLine();
    System.out.println(" Enter the Manager's Address ");
    M.address =  ob1.nextLine();
    System.out.println(" Enter the Specilization ");
    O.splztn = ob.nextLine();
    System.out.println(" Enter the Department ");
    M.dept = ob.nextLine();
    System.out.println(" Enter the Officer's Age ");
    O.age =  ob.nextInt();
    System.out.println(" Enter the Manager's Age ");
    M.age =  ob1.nextInt();
    System.out.println(" Enter the Officer's PhoneNo.");
    O.phone =  ob.nextLong();
    System.out.println(" Enter the Manager's PhoneNo.");
    M.phone =  ob1.nextLong();
    System.out.println(" Enter the Officer's Salary ");
    O.sal = ob.nextInt();
    System.out.println(" Enter the Manager's Salary ");
    M.sal = ob1.nextInt();
    O.display();
    O.printSalary();
    M.display();
    M.printSalary(); 
   }
 }   
    
    

    
    
         