package com.appointment.upcoming.screen;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args )
    {
    	ApplicationContext factory= new ClassPathXmlApplicationContext("Bean.xml");
    	
          Screen sccr=(Screen)factory.getBean("scr");
        System.out.println(sccr);
        System.out.println("upcoming Appointment");
       
    }

}
