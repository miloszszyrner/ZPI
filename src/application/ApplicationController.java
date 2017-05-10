package application;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class ApplicationController {
	ArrayList<ModelStanu> stateList = new ArrayList<ModelStanu>();
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
	
	private Main mainApp;
	private ArrayList<Category> categoryList;
	private ArrayList<State> satetList;
	
	void loadData() {
		stateList.add(new ModelStanu("Alabama",4.0,13.5,0,0,0,0,0));
		stateList.add(new ModelStanu("Alaska",0.0,7.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Arizona",5.6,10.725,0,0,0,0,0));
		stateList.add(new ModelStanu("Arkansas",6.5,11.625,1.5,0,0,0,0));
		stateList.add(new ModelStanu("California",7.25,9.75,0,0,0,0,0));
		stateList.add(new ModelStanu("Colorado",2.9,10.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Connecticut",6.35,6.35,0,0,0,0,0));
		stateList.add(new ModelStanu("Delaware",0.0,0.0,0,0,0,0,0));
		stateList.add(new ModelStanu("District of Columbia",5.75,5.75,0,10.0,0,0,0));
		stateList.add(new ModelStanu("Florida",6.0,7.5,0,9.0,0,0,0));
		stateList.add(new ModelStanu("Georgia",4.0,8.0,4,0,0,0,0));
		stateList.add(new ModelStanu("Guam",4.0,4.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Hawaii",4.166,4.712,0,0,0,0,0));
		stateList.add(new ModelStanu("Idaho",6.0,8.5,0,0,0,0,0));
		stateList.add(new ModelStanu("Illinois",6.25,10.25,1.0,8.25,1.0,1.0,0));
		stateList.add(new ModelStanu("Indiana",7.0,7.0,0,9.0,0,0,0));
		stateList.add(new ModelStanu("Iowa",6.0,7.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Kansas",6.5,10.15,0,0,0,0,0));
		stateList.add(new ModelStanu("Kentucky",6.0,6.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Louisiana",5.0,12.0,7.0,0,0,0,0));
		stateList.add(new ModelStanu("Maine",5.5,5.5,0,7.0,0,0,0));
		stateList.add(new ModelStanu("Maryland",6.0,6.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Massachusetts",6.25,6.25,0,7.0,0,0,175));
		stateList.add(new ModelStanu("Michigan",6.0,6.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Minnesota",6.875,7.875,0,10.775,0,0,0));
		stateList.add(new ModelStanu("Mississippi",7.0,7.25,0,0,0,0,0));
		stateList.add(new ModelStanu("Missouri",4.225,10.85,1.225,0,0,0,0));
		stateList.add(new ModelStanu("Montana",0.0,0.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Nebraska",5.5,7.5,0,9.5,0,0,0));
		stateList.add(new ModelStanu("Nevada",6.85,8.15,0,0,0,0,0));
		stateList.add(new ModelStanu("New Hampshire",0.0,0.0,0,9.0,0,0,0));
		stateList.add(new ModelStanu("New Jersey",6.875,12.875,0,0,0,0,0));
		stateList.add(new ModelStanu("New Mexico",5.125,8.688,0,0,0,0,0));
		stateList.add(new ModelStanu("New York",4.0,8.875,0,0,0,0,110.0));
		stateList.add(new ModelStanu("North Carolina",4.75,7.50,2.0,8.5,0,0,0));
		stateList.add(new ModelStanu("North Dakota",5.0,8.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Ohio",5.75,8.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Oklahoma",4.5,11.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Oregon",0.0,0.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Pennsylvania",6.0,8.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Puerto Rico",10.5,11.5,1.0,0,0,0,0));
		stateList.add(new ModelStanu("Rhode Island",7.0,7.0,0,8.0,0,0,0));
		stateList.add(new ModelStanu("South Carolina",6.0,9.0,0,10.5,0,0,0));
		stateList.add(new ModelStanu("South Dakota",4.0,6.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Tennessee",7.0,9.75,5.0,0,0,0,0));
		stateList.add(new ModelStanu("Texas",6.25,8.25,0,0,0,0,0));
		stateList.add(new ModelStanu("Utah",5.95,8.35,3.0,0,0,0,0));
		stateList.add(new ModelStanu("Vermont",6.0,7.0,0,9.0,0,0,110.0));
		stateList.add(new ModelStanu("Virginia",5.3,6.0,2.5, 5.3,0,0,0));
		stateList.add(new ModelStanu("Washington",6.5,10.4,0,10.0,0,0,0));
		stateList.add(new ModelStanu("West Virginia",6.0,7.0,0,0,0,0,0));
		stateList.add(new ModelStanu("Wisconsin",5.0,6.75,0,0,0,0,0));
		stateList.add(new ModelStanu("Wyoming",4.0,6.0,0,0,0,0,0));
	}
	
	@FXML
    private void initialize() {
    }
	
	
	public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
	
	public void setCategoryList(ArrayList<Category> category) {
		this.categoryList = category;
		setCategoryChoiceBox();
	}
	
    public void setCategoryChoiceBox() {
    	categoryCB.setItems(FXCollections.observableArrayList(
    		    categoryList.get(0).getName(), categoryList.get(1).getName(),
    		    categoryList.get(2).getName(), categoryList.get(3).getName(),
    		    categoryList.get(4).getName(), categoryList.get(5).getName())
    		);
    }
    
	public void setStateList(ArrayList<State> state) {
		this.stateList = state;
	}
    
    
	
}
