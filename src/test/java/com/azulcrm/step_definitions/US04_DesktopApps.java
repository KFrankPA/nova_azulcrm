package com.azulcrm.step_definitions;

import com.azulcrm.pages.Employees;
import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US04_DesktopApps {
    LoginPage loginPage = new LoginPage();
    Employees employees = new Employees();
    @Given("user puts correct password and login to sign in")
    public void userPutsCorrectPasswordAndLoginToSignIn() {
        loginPage.login(ConfigurationReader.getProperty("hr_user2"),ConfigurationReader.getProperty("hd_password"));
    }

    @Then("verify the users sees desktop apps")
    public void verifyTheUsersSeesDesktopApps(List<String> desktopAppsExpected) {

        List <String> actualValue = getTxt(employees.desktopApps);
        Assert.assertEquals(actualValue,desktopAppsExpected);


    }
    public static List<String> getTxt(List<WebElement> listOfElements) {

        List<String> txtValue = new ArrayList<>();
        for (WebElement webElement : listOfElements) {
            txtValue.add(webElement.getText());
        }
        return txtValue;
    }

    @Given("user goes to login page")
    public void userGoesToLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}
