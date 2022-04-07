package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ListProductsController implements Initializable{

    @FXML
    private TableView<Produit> tbl;

    @FXML
    private TableColumn<Produit, String> nom;

    @FXML
    private TableColumn<Produit, Double> prix;

    @FXML
    private TableColumn<Produit, Integer> qte;

    @FXML
    private TableColumn<Produit, String> pays;

    @FXML
    private TableColumn<Produit, String> date;

    @FXML
    private TableColumn<Produit, String> remarques;
    @FXML
    private Button btnBack;
    
    @FXML
    private void handleButtonBackAction(ActionEvent e) throws IOException
    {	
	Stage primaryStage = (Stage) btnBack.getScene().getWindow();
	BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
	Scene sceneAdd = new Scene(layoutAddProduct,400,500);
	primaryStage.setScene(sceneAdd);
    }

//    ObservableList<Produit> list = FXCollections.observableArrayList(
//	    new Produit("Panadol", 4, 20, "France","2022/10/01", "Très bon pour les douleurs"), 
//	    new Produit("Ferverx", 8, 40, "Autre", "2022/02/04", "Très bon pour la grippe"), 
//	    new Produit("Gripex", 7, 30, "France", "2022/05/02", "Très bon pour la grippe et fièvre")
//
//	    );

    @Override
    public void initialize(URL arg0,ResourceBundle arg1) {
	nom.setCellValueFactory(new PropertyValueFactory<Produit, String>("nom"));
	
	
	date.setCellValueFactory(new PropertyValueFactory<Produit, String>("date"));
	pays.setCellValueFactory(new PropertyValueFactory<Produit, String>("pays"));
	remarques.setCellValueFactory(new PropertyValueFactory<Produit, String>("remarque"));
	prix.setCellValueFactory(new PropertyValueFactory<Produit, Double>("prix"));
	qte.setCellValueFactory(new PropertyValueFactory<Produit, Integer>("qte"));
	
	 //ObservableList<Produit> produits = getProductsList();
        tbl.setItems(Main.list);
    }
 
}
