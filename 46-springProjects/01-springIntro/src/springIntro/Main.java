package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//applicationContext.xml okumak için kullanılır.
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		//context.getBean applicationContext.xml içindeki bean ları okumak için kullanılır.
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		
		customerService.add();
		
		//CustomerManager manager = new CustomerManager(context.getBean("database", ICustomerDal.class));
		//manager.add();

	}

	// IoC - Inversion of Control
	// Dependency Injection
	// Spagetti
	// SOLID - Mevcuttaki hiçbir koda dokunamazsın

}
