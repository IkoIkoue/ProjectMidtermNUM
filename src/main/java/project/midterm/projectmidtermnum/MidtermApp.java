package project.midterm.projectmidtermnum;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MidtermApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MidtermApp.class.getResource("MidtermLoginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 240);
        stage.setTitle("Midterm App Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}