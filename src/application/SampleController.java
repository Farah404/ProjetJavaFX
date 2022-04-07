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

    ArrayList<Produit> produits = new ArrayList<>();
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
    private Button btnLogOut;


    @FXML
    private void handleButtonAction(ActionEvent e){
	double prix = Double.parseDouble(prixProduit.getText());
	int qte = Integer.parseInt(qteProduit.getText());
	RadioButton temp = (RadioButton) ab.getSelectedToggle();
	Produit p = new Produit(nomProduit.getText(), prix, qte,temp.getText(),dateFabrication.getAccessibleText(),remarques.getText());
	
	Main.list.add(p);

	// début partie alert
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

    @FXML
    private void handleButtonListAction(ActionEvent e) throws IOException
    {	
	Stage primaryStage = (Stage) btnList.getScene().getWindow();
	BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("ListProducts.fxml"));
	Scene sceneAdd = new Scene(layoutAddProduct,710,420);
	primaryStage.setScene(sceneAdd);
    }

	@FXML
	private void handleButtonLogOutAction(ActionEvent e) throws IOException
	{	
	    Stage primaryStage = (Stage) btnList.getScene().getWindow();
	    BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("Login.fxml"));
	    Scene sceneAdd = new Scene(layoutAddProduct,280,200);
	    primaryStage.setScene(sceneAdd);
	    //	System.out.println("Contenu du Stock ....");
	    //	System.out.println(produits);

	}

    }