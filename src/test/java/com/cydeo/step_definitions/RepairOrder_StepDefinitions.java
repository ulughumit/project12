package com.cydeo.step_definitions;

import com.cydeo.pages.RepairOrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RepairOrder_StepDefinitions {
    RepairOrderPage repairOrderPage = new RepairOrderPage();



    @Given("users already logged in")
    public void users_already_logged_in() {
        repairOrderPage.login("posmanager11@info.com", "posmanager");

    }


    @When("user should see repaires module")
    public void user_should_see_repaires_module() {
        String expectedTitle ="Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);





    }

    @When("user click the Repairs module")
    public void user_click_the_repairs_module() {
        repairOrderPage.Repairs.click();

    }

    @And("users should verify {int} column orders")
    public void usersShouldVerifyColumnOrders(int elements) {
        Assert.assertTrue(repairOrderPage.columns.size()==elements);


    }


    @Then("user should verify login as POS manager")
    public void user_should_verify_login_as_pos_manager() {
//repairOrderPage.posManager.isDisplayed();
        Assert.assertTrue(repairOrderPage.posManager.isDisplayed());


    }

}


