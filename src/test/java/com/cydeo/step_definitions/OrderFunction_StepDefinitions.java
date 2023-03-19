package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.OrderFunctionPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class OrderFunction_StepDefinitions extends BasePage {

    OrderFunctionPage page=new OrderFunctionPage();
    @When("user logged in as POS manager")
    public void userLoggedInAsPOSManager() {
        login("posmanager19@info.com","posmanager");
    }

    @And("user clicks on Point of Sale")
    public void userClicksOnPointOfSale() {
        BrowserUtils.waitForClickablility(page.opt_POS,3);
        page.opt_POS.click();
    }

    @Then("user clicks on orders")
    public void userClicksOnOrders() {
        BrowserUtils.waitForClickablility(page.opt_orders,4);
        page.opt_orders.click();
    }

    @Then("user clicks Order Ref checkbox")
    public void userClicksOrderRefCheckbox() {
        page.cbox_orderRef.click();
    }

    @Then("user sees all orders are checked")
    public void userSeesAllOrdersAreChecked() {

        for (WebElement each : page.checks) {
            Assert.assertTrue(each.isSelected());
        }
        //Assert.assertTrue(checks.size()==60);
    }

    @Then("user sees the Action dropdown")
    public void userSeesTheActionDropdown() {
        Assert.assertTrue(page.dropdown_action.isDisplayed());
    }

    @And("user clicks on Action dropdown")
    public void userClicksOnActionDropdown() {
        page.dropdown_action.click();
    }

    @Then("user sees the below options")
    public void userSeesTheBelowOptions(List<String>actionOpts) {


        for (WebElement each : page.actionOptions) {
            for (String eachText : actionOpts) {
                Assert.assertTrue(each.getText().contains(eachText));
            }
        }


    }
}
