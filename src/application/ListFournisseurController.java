package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ListFournisseurController implements Initializable{


    @FXML
    private TableColumn<Fournisseur, String> nomF;

    @FXML
    private TableColumn<Fournisseur, String> adresseF;

    @FXML
    private TableColumn<Fournisseur, String> emailF;

    @FXML
    private TableColumn<Fournisseur, Integer> telF;

    @FXML
    private TableView<Fournisseur> tblFournisseurs;
    
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		nomF.setCellValueFactory(new PropertyValueFactory<Fournisseur, String>("nomF"));
		adresseF.setCellValueFactory(new PropertyValueFactory<Fournisseur, String>("adresseF"));
		emailF.setCellValueFactory(new PropertyValueFactory<Fournisseur, String>("emailF"));
		
		telF.setCellValueFactory(new PropertyValueFactory<Fournisseur, Integer>("telF"));
		
		//Charger le TableView par Observable List qui contient nos objets Produits
		tblFournisseurs.setItems(Main.listf);
		
	}
	
	@FXML
	private void handleMenuAddActionProduits(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) tblFournisseurs.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("sample.fxml"));
		Scene sceneList = new Scene(layoutAddProduct,500,700);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);
		
	}
	
	@FXML
	private void handleMenuAddActionFournisseur(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) tblFournisseurs.getScene().getWindow();
		BorderPane layoutAddProduct2 = (BorderPane)FXMLLoader.load(getClass().getResource("Fournisseurs.fxml"));
		Scene sceneList2 = new Scene(layoutAddProduct2,340,500);
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
    
    

}