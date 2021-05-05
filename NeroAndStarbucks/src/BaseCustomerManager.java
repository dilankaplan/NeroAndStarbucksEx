
public abstract class BaseCustomerManager {
	
	public void save(Customer customer) {
		System.out.println("Database kaydý yapýldý : " + customer.getName() + " " +  customer.getSurname());
		
	}
	

}
