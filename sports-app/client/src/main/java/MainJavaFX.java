import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainJavaFX extends Application {

    private Stage primaryStage;
    private static MainJavaFX application;

    public MainJavaFX() {
        application = this;
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.primaryStage = stage;
        loginWindow();
    }

    public void loginWindow() throws IOException {
        try {
            /*
            String javaVersion = System.getProperty("java.version");
            String javafxVersion = System.getProperty("javafx.version");
            */

            Parent root = FXMLLoader.load(getClass().getResource("/view/LoginWindow.fxml"));
            primaryStage.setTitle("Please login");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        } catch (IllegalStateException ise) {
            ise.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}