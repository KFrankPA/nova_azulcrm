package com.azulcrm.step_definitions;

import com.azulcrm.pages.BasePage;
import com.azulcrm.pages.DrivePage;
import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class US10_Access_the_DriverPage_StepDefs extends BasePage {
    @Given("users click the Drive module")
    public void users_click_the_drive_module() {
        driveModule.click();

    }

    @Then("verify the users see folowing 6 options:")
    public void verify_the_users_see_flowing_options(List<String> expectedOptions) {
        List<String> actualOptions = BrowserUtils.getElementsText(options_drive_header);
        Assert.assertEquals(expectedOptions, actualOptions);


    }
}







