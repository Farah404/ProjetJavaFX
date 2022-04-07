package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FournisseurController {

	@FXML
	private Button btnAddFo;
	
	@FXML
	private TextField nomF;
	
	@FXML
	private TextField adresseF;
	
	@FXML
	private TextField telF;
	
	@FXML
	private TextField emailF;
	
	@FXML
	private void handleButtonAjoutAction(ActionEvent e)
	{
		int telFo = Integer.parseInt(telF.getText());
		
		Fournisseur newFournisseur = new Fournisseur(nomF.getText(), adresseF.getText(), telFo, emailF.getText());
		
		Main.listf.add(newFournisseur);

			/// début partie alert
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Ajout de fournisseur");
			alert.setHeaderText(null);
			alert.setContentText("Félicitation, fournisseur ajouté avec succès");

			alert.showAndWait();
			/// fin partie alert
			
			nomF.clear();
			adresseF.clear();
			telF.clear();
			emailF.clear();
		
		
	}
	@FXML
	private void handleMenuListActionProduits(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) btnAddFo.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("ListProduits.fxml"));
		Scene sceneList = new Scene(layoutAddProduct,700,400);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);
		
	}
	
	@FXML
	private void handleMenuListActionFournisseur(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) btnAddFo.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("ListFournisseurs.fxml"));
		Scene sceneList = new Scene(layoutAddProduct,700,400);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);
		
	}
	@FXML
	private void handleMenuListActionFinance(ActionEvent e) throws IOException
	{
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Contenu en construction");
		alert.setHeaderText(null);
		alert.setContentText("le détail de Finance est en construction");

		alert.showAndWait();
		
	}
	
	@FXML
	private void handleMenuListActionAbout(ActionEvent e) throws IOException
	{
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("ISIKA in few words");
		alert.setHeaderText(null);
		alert.setContentText("3 rue Danton, 92240 Malakoff\r\n"
				+ "\r\n"
				+ "contact@projet-isika.com");

		alert.showAndWait();
		
	}
	
}