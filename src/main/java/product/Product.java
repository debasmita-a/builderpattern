package product;

public class Product {

	// required fields:

	private String productName;
	private String description;
	private double price;

	// non required fields :

	private String category;
	private double discount;
	private boolean freeShipping;
	private int stock;

	private Product(ProductBuilder builder) {
		this.productName = builder.productName;
		this.price = builder.price;
		this.category = builder.category;
		this.description = builder.description;
		this.discount = builder.discount;
		this.freeShipping = builder.freeShipping;
		this.stock = builder.stock;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public boolean isFreeShipping() {
		return freeShipping;
	}

	public void setFreeShipping(boolean freeShipping) {
		this.freeShipping = freeShipping;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", description=" + description + ", price=" + price
				+ ", category=" + category + ", discount=" + discount + ", freeShipping=" + freeShipping + ", stock="
				+ stock + "]";
	}

	static class ProductBuilder {

		// required fields:

		private String productName;
		private String description;
		private double price;

		// non required fields :

		private String category;
		private double discount;
		private boolean freeShipping;
		private int stock;

		// public constructor : for mandatory fields :

		public ProductBuilder(String productName, String description, double price) {
			this.productName = productName;
			this.description = description;
			this.price = price;
		}

		// setters for optional fields :

		public ProductBuilder setCategory(String category) {
			this.category = category;
			return this;
		}

		public ProductBuilder setDiscount(double discount) {
			this.discount = discount;
			return this;
		}

		public ProductBuilder setFreeShipping(boolean freeShipping) {
			this.freeShipping = freeShipping;
			return this;
		}

		public ProductBuilder setStock(int stock) {
			this.stock = stock;
			return this;
		}

		// build method to create Product class object

		public Product build() {
			return new Product(this);
		}

	}

}
