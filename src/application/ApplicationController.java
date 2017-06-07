package application;


import java.awt.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ApplicationController {
	ArrayList<ModelStanu> stateList = new ArrayList<ModelStanu>();
	ArrayList<Product> productList = new ArrayList<Product>();
	@FXML
	Button calculate;
	
	@FXML
	Label category;
	
	@FXML
	Label product;
	
	@FXML
	Label state;
	
	@FXML
	Label label4;
	
	@FXML
	ChoiceBox<String> categoryCB;
	
	@FXML
	ChoiceBox<String> box2;
	
	@FXML
	ChoiceBox<String> box3;
	
	@FXML
	TextField cena;
	
	@FXML
	TextField tax;
	
	@FXML
	TextField priceWithTax;
	
	@FXML
	TextField taxAmount;
	
	private Main mainApp;
	private ArrayList<Category> categoryList;
	
	void loadData() {
		//cena.setEditable(false);
		tax.setEditable(false);
		priceWithTax.setEditable(false);
		taxAmount.setEditable(false);
		stateList.add(new ModelStanu("Alabama",4.0,13.5,0,0,0,0,0,1,1,0,1,1));
		stateList.add(new ModelStanu("Alaska",0.0,7.0,0,0,0,0,0,0,0,0,0,0));
		stateList.add(new ModelStanu("Arizona",5.6,10.725,0,0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("Arkansas",6.5,11.625,1.5,0,0,0,0,1,1,0,1,1));
		stateList.add(new ModelStanu("California",7.25,9.75,0,0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("Colorado",2.9,10.0,0,0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("Connecticut",6.35,6.35,0,0,0,0,0,0,1,0,0,1));
		stateList.add(new ModelStanu("Delaware",0.0,0.0,0,0,0,0,0,0,0,0,0,0));
		stateList.add(new ModelStanu("District of Columbia",5.75,5.75,0,10.0,0,0,0,0,1,0,0,1));
		stateList.add(new ModelStanu("Florida",6.0,7.5,0,9.0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("Georgia",4.0,8.0,4,0,0,0,0,1,1,0,1,1));
		stateList.add(new ModelStanu("Guam",4.0,4.0,0,0,0,0,0,1,1,1,1,1));
		stateList.add(new ModelStanu("Hawaii",4.166,4.712,0,0,0,0,0,1,1,1,1,1));
		stateList.add(new ModelStanu("Idaho",6.0,8.5,0,0,0,0,0,1,1,0,1,1));
		stateList.add(new ModelStanu("Illinois",6.25,10.25,1.0,8.25,1.0,1.0,0,1,1,1,1,1));
		stateList.add(new ModelStanu("Indiana",7.0,7.0,0,9.0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("Iowa",6.0,7.0,0,0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("Kansas",6.5,10.15,0,0,0,0,0,1,1,1,1,1));
		stateList.add(new ModelStanu("Kentucky",6.0,6.0,0,0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("Louisiana",5.0,12.0,7.0,0,0,0,0,1,1,1,1,1));
		stateList.add(new ModelStanu("Maine",5.5,5.5,0,7.0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("Maryland",6.0,6.0,0,0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("Massachusetts",6.25,6.25,0,7.0,0,0,175,0,1,0,1,0));
		stateList.add(new ModelStanu("Michigan",6.0,6.0,0,0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("Minnesota",6.875,7.875,0,10.775,0,0,0,0,1,0,1,0));
		stateList.add(new ModelStanu("Mississippi",7.0,7.25,0,0,0,0,0,1,1,1,1,1));
		stateList.add(new ModelStanu("Missouri",4.225,10.85,1.225,0,0,0,0,1,1,1,1,1));
		stateList.add(new ModelStanu("Montana",0.0,0.0,0,0,0,0,0,0,0,0,0,0));
		stateList.add(new ModelStanu("Nebraska",5.5,7.5,0,9.5,0,0,0,0,1,1,1,1));
		stateList.add(new ModelStanu("Nevada",6.85,8.15,0,0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("New Hampshire",0.0,0.0,0,9.0,0,0,0,0,1,0,0,0));
		stateList.add(new ModelStanu("New Jersey",6.875,12.875,0,0,0,0,0,0,1,0,1,0));
		stateList.add(new ModelStanu("New Mexico",5.125,8.688,0,0,0,0,0,0,1,1,1,1));
		stateList.add(new ModelStanu("New York",4.0,8.875,0,0,0,0,110.0,0,1,0,0,0));
		stateList.add(new ModelStanu("North Carolina",4.75,7.50,2.0,8.5,0,0,0,1,1,0,1,1));
		stateList.add(new ModelStanu("North Dakota",5.0,8.0,0,0,0,0,0,0,1,1,1,1));
		stateList.add(new ModelStanu("Ohio",5.75,8.0,0,0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("Oklahoma",4.5,11.0,0,0,0,0,0,1,1,1,1,1));
		stateList.add(new ModelStanu("Oregon",0.0,0.0,0,0,0,0,0,0,0,0,0,0));
		stateList.add(new ModelStanu("Pennsylvania",6.0,8.0,0,0,0,0,0,0,1,0,0,0));
		stateList.add(new ModelStanu("Puerto Rico",10.5,11.5,1.0,0,0,0,0,1,1,0,1,1));
		stateList.add(new ModelStanu("Rhode Island",7.0,7.0,0,8.0,0,0,0,0,1,0,1,0));
		stateList.add(new ModelStanu("South Carolina",6.0,9.0,0,10.5,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("South Dakota",4.0,6.0,0,0,0,0,0,1,1,1,1,1));
		stateList.add(new ModelStanu("Tennessee",7.0,9.75,5.0,0,0,0,0,1,1,1,1,1));
		stateList.add(new ModelStanu("Texas",6.25,8.25,0,0,0,0,0,0,1,0,0,1));
		stateList.add(new ModelStanu("Utah",5.95,8.35,3.0,0,0,0,0,1,1,0,1,1));
		stateList.add(new ModelStanu("Vermont",6.0,7.0,0,9.0,0,0,110.0,0,1,0,0,0));
		stateList.add(new ModelStanu("Virginia",5.3,6.0,2.5, 5.3,0,0,0,1,1,0,0,1));
		stateList.add(new ModelStanu("Washington",6.5,10.4,0,10.0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("West Virginia",6.0,7.0,0,0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("Wisconsin",5.0,6.75,0,0,0,0,0,0,1,0,1,1));
		stateList.add(new ModelStanu("Wyoming",4.0,6.0,0,0,0,0,0,0,1,0,1,1));
		
		productList.add(new Product("Mleko", 100, categoryList.get(0).getName()));
		productList.add(new Product("Orzechy", 150, categoryList.get(0).getName()));
		productList.add(new Product("XBox", 200, categoryList.get(1).getName()));
		productList.add(new Product("Tojota", 340, categoryList.get(1).getName()));
		productList.add(new Product("Baranina", 700, categoryList.get(1).getName()));
		productList.add(new Product("Cytryna", 10, categoryList.get(2).getName()));
		productList.add(new Product("Kubek", 35, categoryList.get(2).getName()));
		productList.add(new Product("Mysz", 70, categoryList.get(2).getName()));
		productList.add(new Product("Kabel", 20, categoryList.get(3).getName()));
		productList.add(new Product("IPhone", 800, categoryList.get(3).getName()));
		productList.add(new Product("Cocaina", 160, categoryList.get(3).getName()));
		productList.add(new Product("Okulary", 180, categoryList.get(4).getName()));
		productList.add(new Product("Koszula", 140, categoryList.get(4).getName()));
		productList.add(new Product("Adiasy", 90, categoryList.get(4).getName()));

	}
	
    public void initialize(ArrayList<Category> category, ArrayList<Product> product, ArrayList<ModelStanu> stateL) {
		this.categoryList = category;
		this.productList = product;
		this.stateList=stateL;
		loadData();
		
		setCategoryChoiceBox();
		//setStateChoiceBox();
		categoryCB.getSelectionModel().selectedIndexProperty()
        .addListener(new ChangeListener<Number>() {
          public void changed(ObservableValue ov, Number value, Number new_value) {
        	
        	  setProductChoiceBox(new_value);
          }
        });
		box2.getSelectionModel().selectedIndexProperty()
        .addListener(new ChangeListener<Number>() {
          public void changed(ObservableValue ov, Number value, Number new_value) {
        	  try{
        		  ObservableList<String> op = FXCollections.observableArrayList();
	        	  op=box2.getItems();
	        	  box2.setValue(op.get((int)new_value));  
      	  		  System.out.println(box2.getValue());
	        	  setStateChoiceBox();
	        	  for(int i=0;i<productList.size();i++){
	        		 if(productList.get(i).getName().equals(box2.getValue())){
	        		
	        			cena.setText(Double.toString(productList.get(i).getPrice())); 
	        			System.out.println("price-"+productList.get(i).getPrice());
	        		 }
	        		 
	        	  }
	        	 
        	}catch(NullPointerException e) {
        		//System.out.println("nie wybrany product");
        	}catch(ArrayIndexOutOfBoundsException e){
        		//System.out.println("nie wybrany product");
        	}
          }
        });
		
		box3.getSelectionModel().selectedIndexProperty()
        .addListener(new ChangeListener<Number>() {
          public void changed(ObservableValue ov, Number value, Number new_value) {
        	  try{
        	  		box3.setValue(stateList.get((int)new_value).getNazwa());  
        	  		System.out.println(box3.getValue());
        	  		
        	  		for(int i=0;i<categoryList.size();i++){
		        	 	if(categoryList.get(i).getName().equals(categoryCB.getValue())){
		        	 		double[][] table=stateList.get((int) new_value).getProductTypeTax();
		        	 		double taxa=0;
		        	 		if(table[categoryList.get(i).getId()][1]==1&&table[categoryList.get(i).getId()][0]==0){
		        	 			 taxa=stateList.get((int)new_value).getBase_sales_tax();
		        	 			//System.out.println(tax);
		        	 		}else if(table[categoryList.get(i).getId()][1]==1&&table[categoryList.get(i).getId()][0]!=0){
		        	 			 taxa=table[categoryList.get(i).getId()][0];
		        	 			//System.out.println(tax);
							}else{
								if(categoryList.get(i).getId()==4){
									switch(stateList.get((int) new_value).getNazwa()){
										case "Massachusetts":
											for(int j=0;j<productList.size();j++){
									
												if(productList.get(j).getName().equals(box2.getValue())&&productList.get(j).getPrice()>175 ){
													 taxa=stateList.get((int)new_value).getBase_sales_tax();
													
													// System.out.println(tax);
													 break;
												}else{
													 taxa=0;
													// System.out.println(tax);
												}
											}
											
											break;
										case "New York":
											for(int j=0;j<productList.size();j++){
												
												if(productList.get(j).getName().equals(box2.getValue())&&productList.get(j).getPrice()>110 ){
													 taxa=stateList.get((int)new_value).getBase_sales_tax();
													
													// System.out.println(tax);
													 break;
												}else{
													 taxa=0;
													// System.out.println(tax);
												}
											}
											
											break;
										case "Vermont":
											for(int j=0;j<productList.size();j++){
												
												if(productList.get(j).getName().equals(box2.getValue())&&productList.get(j).getPrice()>110 ){
													 taxa=stateList.get((int)new_value).getBase_sales_tax();
													
													// System.out.println(tax);
													 break;
												}else{
													 taxa=0;
													// System.out.println(tax);
												}
											}
											
											break;
										
									}
								}else{
								    taxa=0;
									//System.out.println(tax);
								}
								
								
							}
		        	 		System.out.println(taxa);
							tax.setText(Double.toString(taxa)+"%");;	
							}
	        	  			
		        	 	}
          
        	  }catch(NullPointerException e) {
          		//System.out.println("nie wybrany stan");
          	}catch(ArrayIndexOutOfBoundsException e){
          		//System.out.println("nie wybrany stan");
          	}
          }
        });
    }
	
	
	public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
	
    public void setCategoryChoiceBox() {
    	categoryCB.setItems(FXCollections.observableArrayList(
    		    categoryList.get(0).getName(), categoryList.get(1).getName(),
    		    categoryList.get(2).getName(), categoryList.get(3).getName(),
    		    categoryList.get(4).getName())
    		);
    }
    
    public void setProductChoiceBox(Number value ) {
    	ObservableList<String> op = FXCollections.observableArrayList();
    	ArrayList<Product> productListInCategory = new ArrayList<Product>();
    	for(int i = 0; i < productList.size(); i++) {
    		if(productList.get(i).getCategory().equals(categoryList.get((int) value).getName())){
    			op.add(productList.get(i).getName());
    			productListInCategory.add(productList.get(i));
    		}
    	}
    	box2.setItems(op);
    }
    
    public void setStateChoiceBox() {
    	ObservableList<String> op = FXCollections.observableArrayList();
    	 
    	for(int i = 0; i < stateList.size(); i++) {
    		op.add(stateList.get(i).getNazwa());
    	}
    	box3.setItems(op);
    }
    
	public void setStateList(ArrayList<ModelStanu> state) {
		this.stateList = state;
	}
    @FXML
    public void calculate(){
    	try{
    		
	    	double price=Double.parseDouble(cena.getText());
	    	double taxa=Double.parseDouble(tax.getText().substring(0, tax.getText().length() -1));
	    	double PodDlaCeny=price*taxa/100;
	    	taxAmount.setText(Double.toString(PodDlaCeny)+"$");
	    	priceWithTax.setText(Double.toString(price+PodDlaCeny)+"$");
    	}catch(NumberFormatException e){
    		JOptionPane.showMessageDialog(null,  "¯le podana cena " );
    	}
    }
    
	
}
