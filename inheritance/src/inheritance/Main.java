package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IndividualCustomer engin = new IndividualCustomer();
engin.customerNumber="12345";

CorporateCustomer hepsiBurada = new CorporateCustomer();
hepsiBurada.customerNumber="78910";

SendikaCustomer abc = new SendikaCustomer();
abc.customerNumber = "99999";

CustomerManager customerManager = new CustomerManager();

Customer[] customers = {engin, abc, hepsiBurada};

customerManager.addMultiple(customers);

	}

}