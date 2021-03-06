package mainTests;

import javafx.stage.Stage;
import main.MainJavaFX;
import org.testfx.api.FxToolkit;

class MainJavaFXTest extends ApplicationTest {

    //Due to class inheritance
    @Override
    public void start(Stage stage) throws Exception {
        new MainJavaFX().start(stage);
    }

    public static void main(String[] args) throws Exception {
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(MainJavaFX.class);
        FxToolkit.showStage();
    }
}