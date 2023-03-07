package com.azulcrm.step_definitions;

import com.azulcrm.pages.BasePage;
import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US13_Verification_configure_menu_options extends BasePage {
         LoginPage loginPage= new LoginPage();
    @Given("users are on the Homepage")
    public void users_are_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(ConfigurationReader.getProperty("hr_user"),ConfigurationReader.getProperty("hr_password"));


    }
    @When("users click the CONFIGURE MENU option")
    public void users_click_the_configure_menu_option() {
      //Configure_menu.click();

    }
    @Then("verify the users see flowing six options")
    public void verify_the_users_see_flowing_six_options(List<String>options) {
        List<WebElement> ProfileOptions;

        for (String each : options) {
            ProfileOptions = Driver.getDriver().findElements(By.xpath("//span[.='" + each + "']"));

            for (WebElement each1 : ProfileOptions) {
                Assert.assertTrue(each1.isDisplayed());
            }

        }
    }






}
