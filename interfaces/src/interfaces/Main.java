package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger[] loggers = {new EmailLogger(), new SmsLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1,"Engin","Demiroð");
		customerManager.add(engin);
		

	}

}
