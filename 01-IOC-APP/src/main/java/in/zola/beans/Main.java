package in.zola.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-beans.xml");
		
		RestaurantService rs1 = context.getBean(RestaurantService.class);
		
		rs1.processPayment(2000.00);
	}
}
