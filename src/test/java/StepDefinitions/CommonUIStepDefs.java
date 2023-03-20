package StepDefinitions;

import Common.CommonUI;
import io.cucumber.java.en.Given;

import java.io.IOException;

public class CommonUIStepDefs {

    @Given("I open the edge browser")
    public void iOpenTheEdgeBrowser() throws IOException, InterruptedException {
        CommonUI test1 = new CommonUI();
        test1.openBrowser();
    }
}
