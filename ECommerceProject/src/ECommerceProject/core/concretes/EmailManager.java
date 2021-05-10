package ECommerceProject.core.concretes;

import ECommerceProject.core.abstracts.EmailService;
import ECommerceProject.entities.concretes.User;


public class EmailManager implements EmailService{

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("Doğrulama adresinize gönderildi: " + user.getEmail());
	}

	@Override
	public void clickToVerify(User user) {
		System.out.println("Kaydınızı doğrulamak için bağlantıya tıklayın: " + user.getFirstName());
	}

	

	
	
}
