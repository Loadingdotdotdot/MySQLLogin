package sample;

import java.sql.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;

public class NewUserClass implements Initializable{

    @FXML
    public TextField username;
    @FXML
    public TextField firstname;
    @FXML
    public TextField lastname;
    @FXML
    public TextField password;
    @FXML
    public TextField verifypassword;
    @FXML
    public Button register;

    @FXML
    private void onRegisterClicked() {
        Stage stage = (Stage) register.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        username.setPromptText("Username");
        firstname.setPromptText("First Name");
        lastname.setPromptText("Last Name");
        password.setPromptText("Password");
        verifypassword.setPromptText("Verify Password");
    }
}
