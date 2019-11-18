package controllerTests;

import controller.LoginWindowController;
import enumerations.Enums;
import handlers.ProfileHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import main.MainJavaFX;
import models.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import repositories.MockupDatabase;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

class LoginWindowControllerTest {

    private LoginWindowController loginWindowController = new LoginWindowController();
    private final String CLUB_BUTTON_TEXT = "Club";
    private final String ADMIN_BUTTON_TEXT = "Admin";

    Enums.UserLevels administratorTestLevel;
    Enums.UserLevels clubTestLevel;
    User testUser;

    @BeforeAll
    @Order(1)
    public static void set_up_class() throws InterruptedException {
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
    @Order(2)
    public void verify_that_correct_text_is_set_on_club_button_in_fxml() throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("/view/fxml/LoginWindow.fxml"));
        Button button = (Button) node.lookup("#loginButtonClub");
        verifyThat(button, hasText(CLUB_BUTTON_TEXT));
    }

    @Test
    @Order(3)
    public void verify_that_correct_text_is_set_on_admin_button_in_fxml() throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("/view/fxml/LoginWindow.fxml"));
        Button button = (Button) node.lookup("#loginButtonAdmin");
        verifyThat(button, hasText(ADMIN_BUTTON_TEXT));
    }

    @Test
    @Order(4)
    void test_admin_goes_to_admin_view_when_clicked() {
        test_create_new_user_depending_on_user_when_user_logs_in(administratorTestLevel); //Using test method
        assertEquals(this.administratorTestLevel, this.loginWindowController.getUserRepository().getById(testUser.getUserId()).getUserLevel());
    }

    @Test
    @Order(5)
    void test_club_goes_to_club_view_when_clicked() {
        test_create_new_user_depending_on_user_when_user_logs_in(clubTestLevel); //Using test method
        assertEquals(this.clubTestLevel, this.loginWindowController.getUserRepository().getById(testUser.getUserId()).getUserLevel());
    }

    @ParameterizedTest
    @EnumSource(Enums.UserLevels.class)
    @Order(6)
    void test_create_new_user_depending_on_user_when_user_logs_in(Enums.UserLevels userLevelsTest) {
        MockupDatabase.emptyDatabase();
        testUser = new User(1, "testUser", "pass", 1,
                "test", "testesen", 12, userLevelsTest);

        loginWindowController.getUserRepository().add(testUser);
        ProfileHandler.setUser(testUser);

        assertEquals(testUser, this.loginWindowController.getUserRepository().getById(testUser.getUserId()));
        assertEquals(testUser, ProfileHandler.getUser());
    }
}