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
	private ArrayList<ModelStanu> state = new ArrayList<ModelStanu>();
	private ArrayList<Product> product = new ArrayList<Product>();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			createCategory();
			this.primaryStage = primaryStage;
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Makieta.fxml"));
			Parent root = loader.load();			
	        ApplicationController controller = loader.getController();
			controller.setMainApp(this);
			controller.initialize(category, product);
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
	

	public static void main(String[] args) {
		launch(args);
	}
}
