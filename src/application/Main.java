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
    
    public static ObservableList<Produit> list = FXCollections.observableArrayList();
//	    new Produit("Panadol", 4, 20, "France","2022/10/01", "Très bon pour les douleurs"), 
//	    new Produit("Ferverx", 8, 40, "Autre", "2022/02/04", "Très bon pour la grippe"), 
//	    new Produit("Gripex", 7, 30, "France", "2022/05/02", "Très bon pour la grippe et fièvre")

    @Override
    public void start(Stage primaryStage) {
	try {
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
	    	//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Login.fxml"));
	    	//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("ListProducts.fxml"));
		Scene scene = new Scene(root,380,500);
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
System.out.println("Pharmacie par Farah");
	launch(args);
    }
}