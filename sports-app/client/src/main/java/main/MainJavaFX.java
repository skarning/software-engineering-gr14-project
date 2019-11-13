package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainJavaFX extends Application implements IMainJavaFX {

    private Stage primaryStage;
    private Stage loginWindow;
    private static MainJavaFX application;

    public Stage getLoginWindow() {
        return loginWindow;
    }

    public MainJavaFX() {
        application = this;
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.primaryStage = stage;
        loginWindow();
    }

    @Override
    public void loginWindow() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/fxml/LoginWindow.fxml"));
            primaryStage.setTitle("Please login");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch (IllegalStateException ise) {
            ise.printStackTrace();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    @Override
    public void clubWindow(Stage clubStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/fxml/ClubWindow.fxml"));
            clubStage.setTitle("Welcome Club");
            clubStage.setScene(new Scene(root));
            clubStage.initModality(Modality.APPLICATION_MODAL);
            clubStage.initOwner(getLoginWindow());
            clubStage.show();
        } catch (IllegalStateException ise) {
            ise.printStackTrace();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    @Override
    public void adminWindow(Stage adminStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/fxml/AdminWindow.fxml"));
            adminStage.setTitle("Welcome Admin");
            adminStage.setScene(new Scene(root));
            adminStage.initModality(Modality.APPLICATION_MODAL);
            adminStage.initOwner(getLoginWindow());
            adminStage.show();
        } catch (IllegalStateException ise) {
            ise.printStackTrace();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void stop() {
    }
}