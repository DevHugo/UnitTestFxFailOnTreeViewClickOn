import javafx.embed.swing.SwingFXUtils;
import javafx.scene.input.MouseButton;
import javafx.stage.Screen;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testfx.api.FxRobot;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import static org.testfx.api.FxToolkit.registerPrimaryStage;
import static org.testfx.api.FxToolkit.setupApplication;
import static org.testfx.api.FxToolkit.setupStage;

public class MyTreeCellTest extends FxRobot {

    private MyApp app;

    @BeforeClass
    public static void setupSpec() throws Exception {
        Stage primaryStage = registerPrimaryStage();
        setupStage(stage -> stage.show());
    }

    @Before
    public void setup() throws Exception {
        app = (MyApp) setupApplication(MyApp.class);
    }

    @Test
    public void clickMenuHumanResourcesTest() throws IOException {
        clickOn("MyCompany Human Resources", MouseButton.SECONDARY);
        clickOn("Menu Item");

        javafx.scene.image.Image image = capture(Screen.getPrimary());
        File outputfile = new File("saved.png");
        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        ImageIO.write(bImage, "png", outputfile);

    }


}
