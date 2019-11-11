package controllerTests;

import controller.LoginWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import main.MainJavaFX;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

class LoginWindowControllerTest {

    private LoginWindowController loginWindowController = new LoginWindowController();
    private final String CLUB_BUTTON_TEXT = "Club";
    private final String ADMIN_BUTTON_TEXT = "Admin";

    @BeforeAll
    public static void setUpClass() throws InterruptedException {
        System.out.println("About to launch the application");
        Thread thread = new Thread("JavaFX Init Thread") {
            public void run() {
                Application.launch(MainJavaFX.class);
            }
        };
        thread.setDaemon(true);
        thread.start();
        System.out.println("Success: Application has been launched");
        Thread.sleep(500);
    }

    @Test
    public void verifyThatCorrectTextIsSetOnClubButtonInFxml() throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("/view/fxml/LoginWindow.fxml"));
        Button button = (Button) node.lookup("#loginButtonClub");
        verifyThat(button, hasText(CLUB_BUTTON_TEXT));
    }

    @Test
    public void verifyThatCorrectTextIsSetOnAdminButtonInFxml() throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("/view/fxml/LoginWindow.fxml"));
        Button button = (Button) node.lookup("#loginButtonAdmin");
        verifyThat(button, hasText(ADMIN_BUTTON_TEXT));
    }

}