package controllerTests;

import javafx.application.Application;
import main.MainJavaFX;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class DeleteEventWindowControllerTest {

    @BeforeAll
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
    public void test_a_shit() throws IOException {

    }


}
