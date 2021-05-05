
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager manager = new StarbucksCustomerManager(new CustomerCheckManager());
		Customer customer = new Customer ();
		customer.setId(1);
		customer.setName("Dilan");
		customer.setSurname("Kaplan");
		customer.setIdentityId("11964095162");
		manager.save(customer);
		
		
		
	
		


	}

}
