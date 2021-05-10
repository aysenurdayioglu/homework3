package ECommerceProject.GoogleRegister;

public class GoogleManager {		//Interface olmadığı için adapter ile enjekte edeceğiz.
	
	public void register() {		//Bunu da dışardan aldık gibi düşünelim yani GoogleRegister ile geldi.
		System.out.println("Google ile giriş.");
	}
}
