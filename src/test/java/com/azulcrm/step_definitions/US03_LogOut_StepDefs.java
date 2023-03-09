package com.azulcrm.step_definitions;


import com.azulcrm.pages.BasePage;
import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.azulcrm.pages.BasePage.userBlock;

public class US03_LogOut_StepDefs {


    LoginPage loginPage = new LoginPage();


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.azulcrm.com/");

    }
    @Then("User is logged in to the app homepage")
    public void user_is_logged_in_to_the_app_homepage(){

        loginPage.username.sendKeys(ConfigurationReader.getProperty("hr_user"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("hr_password"));

        loginPage.logInBtn.click();

    /*  loginPage.username.sendKeys(ConfigurationReader.getProperty("hr_user2"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("hr_user3"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("hr_user4"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("hr_user5"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("hr_user6"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("hr_user7"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("hr_user8"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("hr_user9"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("hr_user10"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("hr_user11"));


        loginPage.username.sendKeys(ConfigurationReader.getProperty("helpdesk_user"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("hd_password"));

        loginPage.username.sendKeys(ConfigurationReader.getProperty("marketing_user"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("mrkt_password"));
*/

    }



    @Given("the users are on the homepage")
    public void the_users_are_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("users click the user profile name")
    public void users_click_the_user_profile_name() {
        userBlock.click();


    }
    @When("users select the {string} option")
    public void users_select_the_option(String logOutBtn) {
        BasePage.logOutOpt.click();

    }
    @Then("verify the user back to the login page")
    public void verify_the_user_back_to_the_login_page() {
    String actualUrl = "https://qa.azulcrm.com/auth/?backurl=%2Fstream%2F";
        String expectedUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);

    }



}
