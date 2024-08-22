package product;

public class ProductTest {

	public static void main(String[] args) {
		
		//only mandatory fields:
		Product product_1 = new Product.ProductBuilder("Samsung 101", "phone", 1200.34).build();
		System.out.println(product_1);
		
		//with optional fields:
		Product product_2 = new Product.ProductBuilder("iPhone 202", "apple phone", 1400.95)
		                      .setCategory("electronics")
		                      .setDiscount(5.23)
		                      .setFreeShipping(false)
		                      .setStock(5)
		                      .build();
		
		System.out.println(product_2);
		
		product_2.setStock(2);
		System.out.println(product_2);
		
		//
		

	}

}
