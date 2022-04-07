package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SampleController {
	
	//ArrayList<Produit> produits = new ArrayList<>();
	
	
	@FXML
	private Button btnAdd;
	
	@FXML
	private Button btnList;
	
	@FXML
	private TextField nomProduit;
	
	@FXML
	private TextField prixProduit;
	
	@FXML
	private TextField qteProduit;
	
	@FXML
	private ToggleGroup ab;
	
	@FXML
	private RadioButton france;
	
	@FXML
	private RadioButton autre;
	
	
	@FXML
	private DatePicker dateFabrication;
	
	@FXML
	private TextArea remarques;
	
	@FXML
	private Button btnlogOut;
	
	@FXML
	private void handleButtonAjoutAction(ActionEvent e)
	{
		

			RadioButton temp = (RadioButton) ab.getSelectedToggle();

			double prix = Double.parseDouble(prixProduit.getText());
			int qte = Integer.parseInt(qteProduit.getText());
			
			Produit p = new Produit(nomProduit.getText(),prix,qte,temp.getText(),dateFabrication.getValue().toString(),remarques.getText());
			
			Main.listp.add(p);
			
			/// début partie alert
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Ajout de produit");
			alert.setHeaderText(null);
			alert.setContentText("Félicitation, produit ajouté avec succès");

			alert.showAndWait();
			/// fin partie alert
			
			nomProduit.clear();
			prixProduit.clear();
			qteProduit.clear();
			dateFabrication.setValue(null);
			ab.selectToggle(france);
			remarques.clear();
		
		
	}
	
	
//	@FXML
//	private void handleButtonListAction(ActionEvent e) throws IOException
//	{
//		Stage primaryStage = (Stage) btnAdd.getScene().getWindow();
//		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("ListProduits.fxml"));
//		Scene sceneList = new Scene(layoutAddProduct,700,400);
//		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//		primaryStage.setScene(sceneList);
//
//		
//	}
	
	@FXML
	private void handleMenuListAction(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) btnAdd.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("ListProducts.fxml"));
		Scene sceneList = new Scene(layoutAddProduct,640,380);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);
		
	}
		
	@FXML
	private void handleMenuAddActionAjouterFournisseur(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) btnAdd.getScene().getWindow();
		BorderPane layoutAddProduct2 = (BorderPane)FXMLLoader.load(getClass().getResource("Fournisseurs.fxml"));
		Scene sceneList2 = new Scene(layoutAddProduct2,340,500);
		sceneList2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList2);
		
	}
	@FXML
	private void handleMenuAddActionFournisseur(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) btnAdd.getScene().getWindow();
		BorderPane layoutAddProduct2 = (BorderPane)FXMLLoader.load(getClass().getResource("ListFournisseur.fxml"));
		Scene sceneList2 = new Scene(layoutAddProduct2,640,400);
		sceneList2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList2);
		
	}
	
	@FXML
	private void handleMenuListActionFinance(ActionEvent e) throws IOException
	{
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Contenu en cours de constructions");
		alert.setHeaderText(null);
		alert.setContentText("Le détail de Finance est en construction et sera donc accessible une fois mis en place.");

		alert.showAndWait();
		
	}
	
	@FXML
	private void handleMenuListActionAbout(ActionEvent e) throws IOException
	{
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("ISIKA in few words");
		alert.setHeaderText(null);
		alert.setContentText("Isika est un organisme de formation situé au 3 rue Danton, 92240 Malakoff\r\n"
				+ "\r\n"
				+ "contact@projet-isika.com");

		alert.showAndWait();
		
	}
	@FXML
	private void handleLogOutAction(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) btnAdd.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene sceneList = new Scene(layoutAddProduct,280,400);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);
}
}