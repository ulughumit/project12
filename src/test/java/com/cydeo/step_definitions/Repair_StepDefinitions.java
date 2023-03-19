package com.cydeo.step_definitions;

import com.cydeo.pages.RepairPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Repair_StepDefinitions {

    RepairPage page =new RepairPage ();
    @When("User is logged in page")
    public void user_is_logged_in_page() {
        page.login("posmanager13@info.com","posmanager");

    }
    @Given("user should see Odoo")
    public void user_should_see_odoo() {
        String expectedTitle="Odoo";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }
    @Then("user click on repair button")
    public void user_click_on_repair_button() {
        page.repairsButton.click();

    }
    @Then("user should  click on the top ckeckbox")
    public void user_should_click_on_the_top_ckeckbox() {
        page.checkBox.click();

    }
    @Then("user should select all the repair orders by clicking the top check box")
    public void user_should_select_all_the_repair_orders_by_clicking_the_top_check_box() {
        Assert.assertTrue(page.posManager.isDisplayed());

    }
    @When("user as seles manager is logged in")
    public void user_as_seles_manager_is_logged_in() {
        page.login("salesmanager13@info.com","salesmanager");

    }
    @Given("user as seles manager should see Odoo")
    public void user_as_seles_manager_should_see_odoo() {
        String expectedTitle="Odoo";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }
    @Then("user as seles manager click on repair button")
    public void user_as_seles_manager_click_on_repair_button() {
        page.repairsButton.click();

    }
    @Then("user as seles manager should  click on the top ckeckbox")
    public void user_as_seles_manager_should_click_on_the_top_ckeckbox() {
        page.checkBox.click();

    }
    @Then("user as  seles manager  select all the repair orders by clicking the top check box")
    public void user_as_seles_manager_select_all_the_repair_orders_by_clicking_the_top_check_box() {
        Assert.assertTrue(page.selesManager.isDisplayed());

    }


}


