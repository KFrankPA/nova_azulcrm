package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US02_RememberMe_StepDefs {
   LoginPage loginPage = new LoginPage();




    @And("the user see {string} message displayed")
    public void seeMessageDisplayed(String expectedText) {
        String actualText = loginPage.rememberMeText.getText();
        //Assert.assertTrue(loginPage.rememberMeText.isDisplayed());
        Assert.assertEquals(expectedText, actualText);
    }

    @Then("the user click the check box")
    public void clickTheCheckBox() {
        loginPage.rememberMeCheckBox.click();

    }

    @Then("verify check box is selected")
    public void verifyCheckBoxIsSelected() {
        Assert.assertTrue(loginPage.rememberMeCheckBox.isSelected());
    }
}
