package com.azulcrm.step_definitions;


import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        switch (userType.toLowerCase()){
            case "hr_user":
                username = ConfigurationReader.getProperty("hr_user");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "hr_username1":
                username = ConfigurationReader.getProperty("hr_user1");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "hr_username2":
                username = ConfigurationReader.getProperty("hr_user2");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "hr_username3":
                username = ConfigurationReader.getProperty("hr_user3");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "hr_username4":
                username = ConfigurationReader.getProperty("hr_user4");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "hr_username5":
                username = ConfigurationReader.getProperty("hr_user5");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "hr_username6":
                username = ConfigurationReader.getProperty("hr_user6");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "hr_username7":
                username = ConfigurationReader.getProperty("hr_user7");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "hr_username8":
                username = ConfigurationReader.getProperty("hr_user8");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "hr_username9":
                username = ConfigurationReader.getProperty("hr_user9");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "hr_username10":
                username = ConfigurationReader.getProperty("hr_user10");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "hr_username11":
                username = ConfigurationReader.getProperty("hr_user11");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "helpdesk_user":
                username = ConfigurationReader.getProperty("helpdesk_user");
                password = ConfigurationReader.getProperty("hd_password");
                break;
            case "marketing_user":
                username = ConfigurationReader.getProperty("marketing_user");
                password = ConfigurationReader.getProperty("mrkt_password");
                break;

        }

        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user enters valid username as {string} and valid password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }





}
