package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.EmployeeBean;
import com.bean.UserBean;
import com.controller.SignUpController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext  applicationContext =new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(applicationContext);

		
		UserBean u =applicationContext.getBean("user",UserBean.class);
		System.out.println(u.getName());
		System.out.println(u.getEmail());
		
		
		SignUpController signup=(SignUpController)applicationContext.getBean("SignUpController");
		EmployeeBean emp=applicationContext.getBean("employee",EmployeeBean.class);
		applicationContext.registerShutdownHook();
		
    }
}