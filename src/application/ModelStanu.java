package application;

public class ModelStanu {
	private String nazwa;
	private double Base_sales_tax;
	private double Total_max_surtax;
	private double productTypeTax[] = new double[5];
	ModelStanu(String nazwa,double Base_sales_tax, double Total_max_surtax, double t1, double t2, double t3, double t4, double t5){
		this.nazwa=nazwa;
		this.Base_sales_tax=Base_sales_tax;
		this.Total_max_surtax=Total_max_surtax;
		this.productTypeTax[0] = t1;
		this.productTypeTax[1] = t2;
		this.productTypeTax[2] = t3;
		this.productTypeTax[3] = t4;
		this.productTypeTax[4] = t5;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public double getBase_sales_tax() {
		return Base_sales_tax;
	}

	public void setBase_sales_tax(double base_sales_tax) {
		Base_sales_tax = base_sales_tax;
	}

	public double getTotal_max_surtax() {
		return Total_max_surtax;
	}

	public void setTotal_max_surtax(double total_max_surtax) {
		Total_max_surtax = total_max_surtax;
	}
	public double calculateTax(int productType){
		return (Base_sales_tax+productTypeTax[productType]);
	}
}
