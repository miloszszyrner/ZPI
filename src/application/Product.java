package application;

public class Product {
	private String name;
	private String category;
	private double price;
	private int type;
	public Product(){
		this("",0.0f,"");
	}
	public Product(String name, double price, String category){
		this.name = name;
		this.price = price;
		this.category = category;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
