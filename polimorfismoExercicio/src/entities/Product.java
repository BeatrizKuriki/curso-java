package entities;

public  class Product {
	
	private String name;
	private double price;
	
	public Product() {
		
	}
	
	
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
		
		
		
		
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
	public String priceTag(){
		return name
				+" $ "
				+ String.format("%.2f", price);
	}
}
