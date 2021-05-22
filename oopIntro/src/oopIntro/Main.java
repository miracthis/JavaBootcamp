package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product1 = new Product(1,"Lenovo v15",15000,"16 GB Ram",10);
				
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo v15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
				
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Yiyecek");
		
		System.out.println(category1.getName());
		
		
		
		
	}

}
