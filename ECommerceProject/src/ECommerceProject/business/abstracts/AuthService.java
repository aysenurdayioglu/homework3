package ECommerceProject.business.abstracts;

import ECommerceProject.entities.concretes.User;

public interface AuthService {  						//Servisin sağladığı

	void register(User user); 							//Kullanıcının kaydı başarılı "ise" kayıt olabilecek.
	void login(String email, String password); 			//Giriş için email ve şifre


}
