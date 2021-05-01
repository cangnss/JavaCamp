package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
		
	}

	//iki tip ba��ml�l�k vard�r. loosly - tightly coupled. gev�ek - kat� ba�l�.
	public void add(Customer customer) {
		System.out.println("M��teri eklendi: "+customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
		
		
		//this.logger.log(customer.getFirstName());
		
		/*for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
		}*/
		
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName()+" veri taban�na logland�."); KATI BA�LILIK. TIGHTLY*/
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi: "+customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());
	}
	
	public void update(Customer customer) {
		System.out.println("M��teri g�ncellendi: "+customer.getFirstName());
	}
}
