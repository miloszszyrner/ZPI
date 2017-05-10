package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	private Stage primaryStage;
	
	private ArrayList<Category> category = new ArrayList<Category>();
	private ArrayList<State> state = new ArrayList<State>();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			createCategory();
			createState();
			this.primaryStage = primaryStage;
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Makieta.fxml"));
			Parent root = loader.load();			
	        ApplicationController controller = loader.getController();
			controller.setMainApp(this);
			controller.setCategoryList(category);
			controller.setStateList(state);
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public double CalculateAfterTax(double amount, Product p, ModelStanu s) {
		return amount *(1 + s.calculateTax(p.getType()));
	}	
	
	public void createCategory() {
		category.add(new Category(1, "Groceries"));
		category.add(new Category(2, "Prepared food"));
		category.add(new Category(3, "Prescription drug"));
		category.add(new Category(4, "Non-prescription drug"));
		category.add(new Category(5, "Clothing"));
	    category.add(new Category(6, "Intangibles"));
	}
	
	public void createState() {
		state.add(new State(1, "Alabama"));
		state.add(new State(2, "Alaska"));
		state.add(new State(3, "Arizona"));
		state.add(new State(4, "Arkansas"));
		state.add(new State(5, "California"));
		state.add(new State(6, "Colorado"));
		state.add(new State(7, "Connecticut"));
		state.add(new State(8, "Delaware"));
		state.add(new State(9, "District of Columbia"));
		state.add(new State(10, "Florida"));
		state.add(new State(11, "Georgia"));
		state.add(new State(12, "Guam"));
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
