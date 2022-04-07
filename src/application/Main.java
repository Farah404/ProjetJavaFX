package application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	public static ObservableList<Fournisseur> listf = FXCollections.observableArrayList();
	
	public static ObservableList<Produit> listp = FXCollections.observableArrayList();
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
//			Scene scene = new Scene(root,380,500);
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Login.fxml"));
			//Scene scene = new Scene(root,300,200);
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("ListProducts.fxml"));
			//Scene scene = new Scene(root,675,400);
			
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("ListProduits.fxml"));
			//Scene scene = new Scene(root,700,400);
			
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("login.fxml"));
			Scene scene = new Scene(root,280,400);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Gestion de Pharmacie par ISIKA");
			primaryStage.getIcons().add(new Image("C:\\Users\\farah\\Desktop\\Pharmacie-logo.png"));
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Oups un problème");
		}
	}
	
	public static void main(String[] args) {

		
		System.out.println("Bienvenue dans notre Pharmacie...");
		launch(args);
	}
}