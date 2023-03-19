package com.cydeo.pages;

import com.cydeo.pages.BasePage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairPage extends BasePage {


    public RepairPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@data-menu-xmlid='mrp_repair.menu_repair_order']")
    public WebElement repairsButton;

    @FindBy(xpath = "//li[.='Repair Orders']")
    public WebElement header;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement checkBox;
    @FindBy(xpath = "//span[.='POSManager13']")
    public WebElement posManager;
    @FindBy(xpath = "//span[.='SalesManager13']")
    public WebElement selesManager;






}


