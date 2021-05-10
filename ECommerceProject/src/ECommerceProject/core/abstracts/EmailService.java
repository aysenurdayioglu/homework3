package ECommerceProject.core.abstracts;

import ECommerceProject.entities.concretes.User;

public interface EmailService {

	void sendVerifyEmail(User user);			// Doğrulama maili kullanıcıya gönderildi
	void clickToVerify(User user);				// Kaydı doğrulamak için kullanıcı tıklayacak
}
