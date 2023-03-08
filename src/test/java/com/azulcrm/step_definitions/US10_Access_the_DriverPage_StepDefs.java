package com.azulcrm.step_definitions;

import com.azulcrm.pages.BasePage;
import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US10_Access_the_DriverPage_StepDefs extends BasePage{
    @Given("users click the Drive module")
    public void users_click_the_drive_module() {
      driveModule.click();


    }

    }





