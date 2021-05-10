package ECommerceProject.business.concretes;

import ECommerceProject.business.abstracts.AuthService;
import ECommerceProject.core.abstracts.CheckService;
import ECommerceProject.core.abstracts.EmailService;
import ECommerceProject.dataAccess.abstracts.UserDao;
import ECommerceProject.entities.concretes.User;

public class AuthManager implements AuthService {

	//CheckService'tekilerin kontrolünü yapacağız.
	//Aynı zamanda e-mail de göndereceğimiz için EmailService'e de bağlıyız.
	//UserDao da aynı şekilde.
		
	private EmailService emailService;  //register işlemleri doğrulandığında e-mail göndereceğiz.
	private CheckService checkService;  //Kontrolleri sağlamak için.
	private UserDao userDao;   //login için bu Dao interface ve classından getAll,getEmail ve getPassword'u kullanacağız.
	
	public AuthManager(UserDao userDao, CheckService checkService, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.checkService = checkService;
		this.emailService = emailService;
	}

	@Override
	public void register(User user) {
	
		if (!userDao.emailExist(user)) {
			System.out.println("Kayıt başarısız!\n"+ user.getEmail() + " Bu mail adresi daha önceden kullanılmış. ");	
			return;
		}
		
		if(checkService.checkFirstName(user.getFirstName()))  
		{ 	
			System.out.println("İsim doğrulandı");
		}
		else {
			return;
		}
		
		if(checkService.checkLastName(user.getLastName())) {
			System.out.println("Soyisim doğrulandı");
		}
		else {
			return;
		}
		
		if(checkService.checkEmail(user.getEmail())) {
			System.out.println("E-mail doğrulandı");	
		}
		else {
			return;
		}
		
		if(checkService.checkPassword(user.getPassword())) {
			System.out.println("Şifre doğrulandı");	
		}
		else {
			return;
		}
		
		
		emailService.clickToVerify(user);  //Tüm doğrulamaları sağlayınca doğrulamak için tıkla
		emailService.sendVerifyEmail(user); //Doğrulama linkine tıkladıktan sonra doğrulama e-maili gönder.
		
		userDao.add(user);   //Tüm işlemleri geçtiği için sisteme kaydoldu
		System.out.println("Kayıt tamamlandı.Hoşgeldiniz: "+ user.getFirstName() + "!"); 
	}

	@Override
	public void login(String email, String password) {  //Giriş için getEmail ve getPassword kullandık.
				
		for(User user:userDao.getAll()) {
			if(email== user.getEmail() && password==user.getPassword()) {
				System.out.println("Giriş başarılı");
				return;
			}
			System.out.println("Yanlış giriş.Tekrar deneyin.");
		}
	}

	
}

