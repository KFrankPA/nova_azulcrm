package com.azulcrm.step_definitions;

import com.azulcrm.pages.BasePage;
import com.azulcrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

import static com.azulcrm.pages.BasePage.topMenuMoreOptions;

public class US07_More_Tab_Options_StepDefs {

    @When("user clicks the {string} tab")
    public void userClicksTheTab(String topMenuOption) {
        BasePage.topMenuOptionClick(topMenuOption);
    }

    @Then("verify the users see following 4 options")
    public void verifyTheUsersSeeFollowingOptions(List<String> expectedOptions) {
        List<String> actualOptions = BrowserUtils.getElementsText(topMenuMoreOptions);
        Assert.assertEquals(expectedOptions, actualOptions);
    }
}
