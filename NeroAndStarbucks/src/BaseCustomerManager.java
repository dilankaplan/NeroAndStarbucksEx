
public abstract class BaseCustomerManager {
	
	public void save(Customer customer) {
		System.out.println("Database kayd� yap�ld� : " + customer.getName() + " " +  customer.getSurname());
		
	}
	

}
