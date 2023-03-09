package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Employees {

    public Employees(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Employees']/span")
    public WebElement employeeButton;

    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[1]/a/span[contains(@class,'b24-app-icon b24-app-icon')]/following-sibling::span")
    public List<WebElement> desktopApps;
}
