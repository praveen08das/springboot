package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
 ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("Config.xml");
 Student student1 = (Student) Context.getBean("Student1");

          System.out.println(student1);
         
        
    }
}
