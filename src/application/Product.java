package application;

public class Product {
	private String name;
	private float price;
	private ProductType productType;
	private enum ProductType{
		NoCategory(0),
		Groceries(1),
		PreparedFood(2),
		PrescriptionDrug(3),
		NonPrescriptionDrug(4),
		Clothing(5),
		Intangibles(6);
		private int value;
		private ProductType(int value) {
			this.value = value;
		}
		public int getProductValue() {
			return value;
		}
	}
	public Product(){
		this("",0.0f,null);
	}
	public Product(String name, float price, ProductType category){
		this.name = name;
		this.price = price;
		this.productType = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
