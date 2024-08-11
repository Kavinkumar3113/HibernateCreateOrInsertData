package com.CreateOrInsert;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainMethod 
{
    public static void main( String[] args )
    {
      Scanner sc=new Scanner(System.in);
     
     int id;
  	 String name;
  	 String dept;
  	 String designation;
  	 String dateofjoin;
     double salary;
     System.out.print("\nEnter the id: ");
     id=sc.nextInt();
     sc.nextLine();
     System.out.print("\nEnter the name: ");
     name=sc.nextLine();
     System.out.print("\nEnter the dept: ");
     dept=sc.nextLine();
     System.out.print("\nEnter the designation: ");
     designation=sc.nextLine();
     System.out.print("\nEnter the dateofjoin: ");
     dateofjoin=sc.next();
     System.out.print("\nEnter the salary: ");
     salary=sc.nextDouble();
     
      Employee emp=new Employee(id,name,dept,designation,dateofjoin,salary);
      Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
      SessionFactory sf=con.buildSessionFactory();
      
      Session session=sf.openSession();
      Transaction tx=session.beginTransaction();
      session.save(emp);
      tx.commit();
    }
}
