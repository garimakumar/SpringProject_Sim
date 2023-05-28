package com.example;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
    	Airtel airtel=ac.getBean(Airtel.class);
    	//airtel.setDataStrength("signal strength is high");  //According to Spring core framework, we dont have to hardcore the values in the java component(i.e in the main method) and instead of that, we have to configure it in the  spring.xml config file in the property tag. 
    	Idea idea=ac.getBean(Idea.class);
    	airtel.DataTypeOfSim();
    	idea.TypeOfSim();
    	System.out.println(airtel.getDataStrength());
    	idea.DisplayInIdea();
    }
}
