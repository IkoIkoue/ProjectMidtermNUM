package project.midterm.projectmidtermnum.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import project.midterm.projectmidtermnum.MidtermApp;
import project.midterm.projectmidtermnum.models.MidtermLoginModel;

import java.io.IOException;

public class MidtermLoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label loginStatusLabel;

    private final MidtermLoginModel model = new MidtermLoginModel();

    @FXML
    private void login() {

        String username = usernameField.getText();
        String password = passwordField.getText();

        boolean authenticated = model.login(username, password);

        if (authenticated) {
            loginStatusLabel.setText("Login Success");
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(MidtermApp.class.getResource("MidtermMainView.fxml"));
                Parent root = fxmlLoader.load();
                Stage stage = (Stage) usernameField.getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setTitle("Midterm App");
                stage.setScene(scene);
                stage.show();

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            loginStatusLabel.setText("Invalid Credentials");
            usernameField.clear();
            passwordField.clear();
        }
    }
}
