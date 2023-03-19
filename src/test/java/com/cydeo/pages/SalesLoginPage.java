package com.cydeo.pages;

import com.cydeo.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesLoginPage extends BasePage {


    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement accountHolder;

}
