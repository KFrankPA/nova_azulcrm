package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyPage extends BasePage{

    public CompanyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "span[class='main-buttons-item-text-title']")
    public List<WebElement> options_header;

}
