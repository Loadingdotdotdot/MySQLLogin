package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    public TextField user;
    @FXML
    public PasswordField pass;
    @FXML
    public Button login;
    @FXML
    public Label allowed;


    public static String username;
    public static String password;



    @FXML
    private void onLoginClicked() {
        username = user.getText();
        password = pass.getText();
        DBConnect connect = new DBConnect();
        if (connect.getData() == false) {
            allowed.setText("Allowed: NO");
        } else {
            allowed.setText("Allowed: YES");
        }
    }

    @FXML
    private void onNewUserClicked() throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("NewUser.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Register");
        primaryStage.setScene(new Scene(root, 300, 400));
        primaryStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        user.setPromptText("Username");
        pass.setPromptText("Password");
    }
}
