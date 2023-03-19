package com.cydeo.pages;

import com.cydeo.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ManagerAccessPage extends BasePage {



    @FindBy(xpath = "//span[.='SalesManager52']")
    public WebElement profileName;


    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li/a/span")
    public List<WebElement> modules;







}
