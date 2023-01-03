package com.example.doctor.demo_appointment2;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class App 
	{
	    public static void main( String[] args )
	    {
	    	ApplicationContext factory= new ClassPathXmlApplicationContext("NewBean.xml");
	    	
	          Appointment apm=(Appointment)factory.getBean("app");
	        System.out.println(apm);
	       
	    }
	

}
