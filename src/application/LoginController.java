package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginController {
	
	
	String vlogin="admin";
	String vmdp ="1234";
	@FXML
	private TextField login;
	
	@FXML
	private PasswordField pwd;
	
	@FXML
	private Button btnlogin;
	
	@FXML
	private void handleButtonLoginAction(ActionEvent e) throws IOException
	{
		System.out.println("Login ....");
		//System.out.println(login.getText() +" "+pwd.getText());
		if(login.getText().equals(vlogin)  && pwd.getText().equals(vmdp))
		{
			/// début partie alert
			/*
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Connexion réussi");
			alert.setHeaderText(null);
			alert.setContentText("Félicitation, connexion avec succès");
			alert.showAndWait();
			*/
			/// fin partie alert
			
			Stage primaryStage = (Stage) btnlogin.getScene().getWindow();
			BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene sceneAdd = new Scene(layoutAddProduct,700,400);
			primaryStage.setScene(sceneAdd);
		     
		}
		
		else
		{
			/// début partie alert
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Connexion Problem");
			alert.setHeaderText(null);
			alert.setContentText("Login ou mot de passe incorrectes");

			alert.showAndWait();
			/// fin partie alert
		}
		 
		
	}

}