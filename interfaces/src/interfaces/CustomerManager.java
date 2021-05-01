package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
		
	}

	//iki tip baðýmlýlýk vardýr. loosly - tightly coupled. gevþek - katý baðlý.
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi: "+customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
		
		
		//this.logger.log(customer.getFirstName());
		
		/*for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
		}*/
		
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName()+" veri tabanýna loglandý."); KATI BAÐLILIK. TIGHTLY*/
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi: "+customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());
	}
	
	public void update(Customer customer) {
		System.out.println("Müþteri güncellendi: "+customer.getFirstName());
	}
}
