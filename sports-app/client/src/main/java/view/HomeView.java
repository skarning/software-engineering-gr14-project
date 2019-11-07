package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.applet.Applet;

public class HomeView extends Application {
    private final String HOMEVIEW_LOCATION = "/resources/HomeViewFXML.fxml";

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource(HOMEVIEW_LOCATION));     // Path is relative to classpath root
        loader.getLocation();
        Parent content = loader.load();

        Scene scene = new Scene(content);

        stage.setTitle("Title goes here");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}