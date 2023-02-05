package com.bajaj.jdbc.spring_jdbc;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String []args) {
    	
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Student st = new Student(102,"anya","pune");
    	System.out.println(st);
    	
    	Session session = factory.openSession();
    	
    	session.beginTransaction();
    	
    	session.save(st);
    	
    	session.getTransaction().commit();
    	
    	session.close();
    	
    	
    }
    
  
}
