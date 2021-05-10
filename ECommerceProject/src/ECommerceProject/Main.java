package ECommerceProject;

import ECommerceProject.business.abstracts.UserService;
import ECommerceProject.business.concretes.AuthManager;
import ECommerceProject.business.concretes.UserManager;
import ECommerceProject.core.GoogleManagerAdapter;
import ECommerceProject.core.concretes.CheckManager;
import ECommerceProject.core.concretes.EmailManager;
import ECommerceProject.dataAccess.concretes.InMemoryUserDao;
import ECommerceProject.entities.concretes.User;

public class Main {



	public static void main(String[] args) {
				
		UserService userService=new UserManager(new AuthManager(new InMemoryUserDao(), new CheckManager(),new EmailManager()), 
																new GoogleManagerAdapter());
		
		User user1= new User(1,"Ayşenur","Dayıoğlu","ayse@gmail.com","123456789");
		userService.register(user1);
		userService.login("ayse@gmail.com", "12345");
		
		userService.registerGoogle();
		
		System.out.println("---------------------------------------");
		
		//e-mail ve şifre aynı girip deneyelim
		User user2= new User(2,"İbrahim","Yalçın","ayse@gmail.com","123456789");
		userService.register(user2);

		
	
		
		

	}

}
