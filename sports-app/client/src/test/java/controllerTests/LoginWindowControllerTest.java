package controllerTests;

import controller.LoginWindowController;
import javafx.application.Application;
import main.MainJavaFX;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testfx.api.FxAssert.*;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

class LoginWindowControllerTest {

    private LoginWindowController loginWindowController = new LoginWindowController();

    @BeforeAll
    static void setUpClass() throws InterruptedException {
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
    void correctTextIsSetFromMethodThatSetTextOnClub() {
        final String clubButtonText = "Club";
        assertEquals(clubButtonText, loginWindowController.setTextOnLoginButtonClub());
    }

    @Test
    void correctTextIsSetFromMethodThatSetTextOnAdmin() {
        final String adminButtonText = "Admin";
        assertEquals(adminButtonText, loginWindowController.setTextOnLoginButtonAdmin());
    }

    @Test
    void checkThatClubLoginButtonHasCorrectText() {
        verifyThat("#loginButtonClub", hasText("Club"));
    }

    @Test
    void checkThatAdminLoginButtonHasCorrectText() {
        verifyThat("#loginButtonAdmin", hasText("Admin"));
    }

}