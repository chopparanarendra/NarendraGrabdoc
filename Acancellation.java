package com.appointment.cancellation.screen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Acancellation {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("Newbean.xml");
		Cancellation can=(Cancellation)factory.getBean("canc");
		System.out.println(can);
		System.out.println("Appointment cancelled");
	}
	

}
