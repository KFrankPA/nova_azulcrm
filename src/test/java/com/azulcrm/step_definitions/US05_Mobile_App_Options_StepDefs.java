package com.azulcrm.step_definitions;

import com.azulcrm.pages.BasePage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US05_Mobile_App_Options_StepDefs extends BasePage{


    @Then("verify the users see following 2 mobile app options")
    public void verifyTheUsersSeeFlowingMobileApp(List<String> expectedOptions) {
        List<String> actualOptions = BrowserUtils.getElementsText(mobileAppOptions);
        Assert.assertEquals(expectedOptions,actualOptions);
    }
}
