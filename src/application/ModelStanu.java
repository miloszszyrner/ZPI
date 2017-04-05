package application;

public class ModelStanu {
	private String nazwa;
	private double Base_sales_tax;
	private double Total_max_surtax;
	
	ModelStanu(String nazwa,double Base_sales_tax, double Total_max_surtax){
		this.nazwa=nazwa;
		this.Base_sales_tax=Base_sales_tax;
		this.Total_max_surtax=Total_max_surtax;
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

}
