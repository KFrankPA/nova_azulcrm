package com.azulcrm.step_definitions;

import com.azulcrm.pages.BasePage;
import com.azulcrm.pages.Employees;
import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_EmployeePage {
    LoginPage loginPage = new LoginPage();
    Employees employees = new Employees();

    @Given("user on login page")
    public void user_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user successfully logs in")
    public void user_successfully_logs_in() {
        loginPage.login(ConfigurationReader.getProperty("hr_user1"),ConfigurationReader.getProperty("hr_password"));



    }
    @Then("user clicks {string} page and clicks")
    public void user_clicks_page_and_clicks(String string) {
        employees.employeeButton.click();


    }
    @Then("verify that user access {string} page")
    public void verify_that_user_access_page(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Company Structure"));

    }

}
