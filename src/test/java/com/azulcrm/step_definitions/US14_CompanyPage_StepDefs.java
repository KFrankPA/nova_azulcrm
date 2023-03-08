package com.azulcrm.step_definitions;

import com.azulcrm.pages.BasePage;
import com.azulcrm.pages.CompanyPage;
import com.azulcrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US14_CompanyPage_StepDefs {

    CompanyPage companyPage = new CompanyPage();
    @When("users click the Company module")
    public void users_click_the_company_module() {
       /* for (WebElement eachOption : leftMenu) {
            if (eachOption.getText().equals("Company")){
                eachOption.click();
                break;
            }
        }

        */

        companyPage.companyMenuButton.click();
        BrowserUtils.sleep(3);
    }
    @Then("verify the users see following Company options:")
    public void verify_the_users_see_following_company_options(List<String> expectedOptions) {

        List<WebElement> actualOptionsAsWebElements = companyPage.options_header;
        List<String> actualOptions = BrowserUtils.getElementsText(actualOptionsAsWebElements);
        Assert.assertEquals(actualOptions,expectedOptions);

    }

}
