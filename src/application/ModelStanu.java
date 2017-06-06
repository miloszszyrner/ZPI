package application;

public class ModelStanu {
	private String nazwa;
	private double Base_sales_tax;
	private double Total_max_surtax;
	private double productTypeTax[][] = new double[5][2];
	ModelStanu(String nazwa,double Base_sales_tax, double Total_max_surtax, double t1, double t2, double t3, double t4, double t5, double s1, double s2, double s3, double s4, double s5){
		this.nazwa=nazwa;
		this.Base_sales_tax=Base_sales_tax;
		this.Total_max_surtax=Total_max_surtax;
		this.productTypeTax[0][0] = t1;
		this.productTypeTax[1][0] = t2;
		this.productTypeTax[2][0] = t3;
		this.productTypeTax[3][0] = t4;
		this.productTypeTax[4][0] = t5;
		this.productTypeTax[0][1] = s1;
		this.productTypeTax[1][1] = s2;
		this.productTypeTax[2][1] = s3;
		this.productTypeTax[3][1] = s4;
		this.productTypeTax[4][1] = s5;
	}
	
	public double[][] getProductTypeTax() {
		return productTypeTax;
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
	//public double calculateTax(int productType){
		//return (Base_sales_tax+productTypeTax[productType]);
	//}
}
