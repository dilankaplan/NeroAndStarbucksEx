
public class StarbucksCustomerManager extends BaseCustomerManager{


	private CustomerCheckServices customerCheckService;
	
	
	
	public StarbucksCustomerManager(CustomerCheckServices customerCheckService) {
		
		this.customerCheckService = customerCheckService;
		
	}
	
	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Gerçek kiþi deðil");
		}
		
	}
	
}
