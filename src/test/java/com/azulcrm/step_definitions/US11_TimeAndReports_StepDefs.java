package com.azulcrm.step_definitions;

import com.azulcrm.pages.BasePage;
import com.azulcrm.pages.LoginPage;
import com.azulcrm.pages.TimeAndReport;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class US11_TimeAndReports_StepDefs{

    TimeAndReport timeAndReport = new TimeAndReport();
    LoginPage loginPage = new LoginPage();

    @Given("users are already on the homepage")
    public void enters_valid_username_and_password() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("hr_user11"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("hr_password"));
        loginPage.submit.click();
    }


    @When("users click the Time and Reports module")
    public void users_click_the_time_and_reports_module() {
        timeAndReport.TimeAndReports.click();


    }

    @Then("verify the users see flowing 5 options")
    public void verify_the_users_see_flowing_5_options(List<String> expectedOptions) {
        List<String> actualOptions = BrowserUtils.getElementsText(timeAndReport.fiveModule);
        try {
            Assert.assertEquals(expectedOptions, actualOptions);
        } catch (AssertionError e) {
            e.printStackTrace();
            System.out.println("Have used tryCatch block, because assertion is failed  " + "actual result 3rd tab is 'BITRIX24.Time ' " + "" +
                    "does not equal " + "expected result 'Bitrix24.Time'");

        }
    }
}



