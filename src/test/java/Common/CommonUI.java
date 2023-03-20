package Common;

import UI.Test;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class CommonUI extends Test {

    public void openBrowser() throws IOException, InterruptedException {
        driver = new EdgeDriver();
        driver.manage().window().maximize();

    }
}
