import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MerniceServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		customerManager.save(new Customer(1, "Ayþenur", "Dayýoðlu", LocalDate.of(1996, 2, 29), "55867390610"));

	}

}
