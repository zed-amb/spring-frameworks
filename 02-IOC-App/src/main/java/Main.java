import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.zola.service.UserService;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		UserService user = context.getBean(UserService.class);
		
		String name = user.getName(100);
		System.out.println("User name: " + name);
}

}
