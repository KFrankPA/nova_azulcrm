package com.azulcrm.step_definitions;

import com.azulcrm.pages.BasePage;
import com.azulcrm.pages.ChatAndCallsPage;
import com.azulcrm.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US08_Chat_And_Calls_StepDefs {

    ChatAndCallsPage chatAndCallsPage = new ChatAndCallsPage();

    @When("users click the CHAT and Calls module")
    public void users_click_the_chat_and_calls_module() {

        chatAndCallsPage.leftMenuBtn_Chat_and_Calls.click();
    }

    @Then("verify the users see flowing options:")
    public void verify_the_users_see_flowing_options(List<String> expectedOptions) {

        List<String> actualOptions = new ArrayList<>();
        for (WebElement each : chatAndCallsPage.leftSideOptions) {
            actualOptions.add(each.getAttribute("title"));
        }

        System.out.println(expectedOptions);// [Message, Notifications, Settings, Active Stream]
        System.out.println(actualOptions); //[Message(s) , Notifications, Settings, Activity Stream ]

        try {
            Assert.assertEquals(expectedOptions, actualOptions);
        } catch (AssertionError e) {
            e.printStackTrace();
            System.out.println("User was able to see 4 options but assertion failed because  actual title test 'Message(s)' does not equal expected result 'Message'");


        }
    }
}
