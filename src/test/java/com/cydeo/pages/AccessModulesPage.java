package com.cydeo.pages;

import com.cydeo.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccessModulesPage extends BasePage {

    @FindBy(xpath = "//span[.='POSManager22']")
    public WebElement posmanager;

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> modules;

}

