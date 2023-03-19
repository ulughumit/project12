package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {




    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="login")
    public WebElement email;



    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[.=\"Log in\"]")
    public WebElement btn_logIn;


    public void login(String userNameStr, String passwordStr) {
        email.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        btn_logIn.click();
        // verification that we logged
    }










}
