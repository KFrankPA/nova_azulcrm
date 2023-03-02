package com.azulcrm.pages;


import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public abstract class BasePage {

    @FindBy(id = "sitemap-menu")
    public WebElement sitemapMenu;

    @FindBy(name = "sitemap-section")
    public List<WebElement> sitemapCategories;

    @FindBy(id = "search-textbox-input")
    public WebElement searchBox;

    @FindBy(id = "left-menu-list")
    public List<WebElement> leftMenu;

    @FindBy(id = "left-menu-more-btn")
    public WebElement moreLeftMenuBtn;

    @FindBy(id = "timeman-background")
    public WebElement liveTime;

    @FindBy(id = "user-block")
    public WebElement userBlock;

    @FindBy(id = "bx-help-block")
    public WebElement help;


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
