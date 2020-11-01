package org.cap.apps.customer.ui;

import org.cap.apps.customer.JavaConfiguration;
import org.cap.apps.customer.exceptions.InvalidArgumentException;
import org.cap.apps.customer.exceptions.InvalidCustomerNameException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProjectMain {

	public static void main(String[] args) {
		try {
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.register(JavaConfiguration.class);
			context.refresh();
			ProjectUi projectUi=context.getBean(ProjectUi.class);
			projectUi.runUi();
			
		}catch(InvalidArgumentException e) {
			System.out.println(e.getMessage());
		}catch(InvalidCustomerNameException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Something Went Wrong");
		}

	}

}
