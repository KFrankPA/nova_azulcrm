package com.azulcrm.step_definitions;

import com.azulcrm.pages.BasePage;
import com.azulcrm.pages.MyProfilePage;
import com.azulcrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US09_ProfilePage_StepDefs  {
    MyProfilePage myProfilePage=new MyProfilePage();
    @When("users click the user profile")
    public void users_click_the_user_profile() {
        myProfilePage.bnt_User_Profile.click();
        myProfilePage.userProfile_dropdownOption_MyProfile.click();
    }
    @Then("verify the users see flowing {int} options:")
    public void verify_the_users_see_flowing_options(Integer options, List<String>  expectedOptions) {
        List<String> actualOptions = BrowserUtils.getElementsText(myProfilePage.profileModuleOptions);
        System.out.println(expectedOptions);
        System.out.println(actualOptions);

            Assert.assertEquals(expectedOptions, actualOptions);

    }
}
