package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;





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
    public static WebElement userBlock;

    @FindBy(xpath = "//a[.='Log out']")
    public static WebElement logOutOpt;

    @FindBy(id = "bx-help-block")
    public WebElement help;

    @FindBy(xpath = "//div[.='Mobile application']")
    public WebElement mobileAppBlock;

    @FindBy(xpath = "//div[.='Desktop client']")
    public WebElement desktopClientBlock;

    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[2]/a/span[contains(@class,'b24-app-icon b24-app-icon')]/following-sibling::span")
    public static List<WebElement> mobileAppOptions;

    @FindBy(xpath = "//a[@title='Chat and Calls']")
    public WebElement leftMenuBtn_Chat_and_Calls;

    @FindBy(css = "span[id='user-name']")
    public WebElement bnt_User_Profile;

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement userProfile_dropdownOption_MyProfile;

    @FindBy(xpath = "//span[contains(@class,'feed-add-post-form-link')]/span")
    public static List<WebElement> topMenuOptions;

    @FindBy(css = ".menu-popup-item-text")
    public static List<WebElement> topMenuMoreOptions;


    @FindBy(xpath = "//a[@title='Drive']")
    public static WebElement driveModule;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void topMenuOptionClick(String menuOption){

        for (WebElement topMenuOption : topMenuOptions) {
            if (topMenuOption.getText().equals(menuOption)){
                topMenuOption.click();
            }
        }
    }

    @FindBy(xpath = "//a[@title='Company']")
    public WebElement companyMenuButton;

    @FindBy(xpath="//span[@class='main-buttons-item-text-title']")
    public static List<WebElement> options_drive_header;


    @FindBy(xpath = "//div[@id='menu-favorites-settings-btn']")
    public static WebElement configure_menu;

}