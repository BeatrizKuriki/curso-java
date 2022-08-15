package entities;

public class Product1 {
	public String name;
	public double price;
	public int quantity;
	
	public Product1() {
		///construtor padrão
		
	}
	
	public Product1(String name, double price, int quantity) {
		///o que está dentro do parenteses são parametros para o construtor
		this.name = name;
		// a palavra this serve para referenciar o atributo do objeto
		this.price = price;
		this.quantity = quantity;
	}
	public Product1(String name, double price) {
		///isto é sobrecarga, quando vc tem mais de um construtor com diferentes parametros
		this.name = name;
		// a palavra this serve para referenciar o atributo do objeto
		this.price = price;
		
	}
	

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
