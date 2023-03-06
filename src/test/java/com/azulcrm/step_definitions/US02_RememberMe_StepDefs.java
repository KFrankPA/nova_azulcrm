package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US02_RememberMe_StepDefs {
   LoginPage loginPage = new LoginPage();


    @Then("click the check box")
    public void click_the_check_box () {
        loginPage.rememberMeCheckBox.click();
        Assert.assertTrue(loginPage.rememberMeCheckBox.isSelected());

    }
    @Then("see Remember me on this computer message displayed")
    public void verify_there_is_a_remember_me_on_this_computer_message_displayed(String expectedText) {
        String actualText = loginPage.rememberMeText.getText();
      //Assert.assertTrue(loginPage.rememberMeText.isDisplayed());
       Assert.assertEquals(expectedText, actualText);

    }




}
