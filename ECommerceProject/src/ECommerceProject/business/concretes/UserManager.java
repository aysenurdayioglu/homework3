package ECommerceProject.business.concretes;

import ECommerceProject.business.abstracts.AuthService;
import ECommerceProject.business.abstracts.UserService;
import ECommerceProject.core.abstracts.GoogleService;
import ECommerceProject.entities.concretes.User;

public class UserManager implements UserService{

	
	private AuthService authService;				//authService'e bağımlıyız doğrulanırsa dediğimiz için.
	
	private GoogleService googleService;			// googleService'e bağımlıyız
	
	
	public UserManager(AuthService authService,GoogleService googleService) {
		
		this.authService = authService;
		this.googleService=googleService;
		
	}

	@Override
	public void login(String email, String password) {  //Doğrulamaları sağlarsa giriş gerçekleştirilir.
		authService.login(email, password);
		
	}

	@Override
	public void register(User user) {  					//Doğrulamalar sağlanırsa kayıt gerçekleştirilir.
		authService.register(user);
		
	}

	@Override
	public void registerGoogle() {
		googleService.registerToSystem();		// Google ın register sistemine git
		
	}
	
}
