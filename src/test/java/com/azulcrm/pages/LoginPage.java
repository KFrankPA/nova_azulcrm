package com.azulcrm.pages;


import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="USER_LOGIN")
    public WebElement username;

    @FindBy(name="USER_PASSWORD")
    public WebElement password;

    @FindBy(css = "input[value='Log In']")
    public WebElement submit;

    @FindBy(css = "#USER_REMEMBER")
    public WebElement rememberMeCheckBox;

    @FindBy(className = "errortext")
    public WebElement invalidCredentialText;

    public void login(String userNameStr, String passwordStr) {
        username.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

}
