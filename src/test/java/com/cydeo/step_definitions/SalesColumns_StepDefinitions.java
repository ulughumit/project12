package com.cydeo.step_definitions;

import com.cydeo.pages.SalesColumnsPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SalesColumns_StepDefinitions {

    SalesColumnsPage columnsPage = new SalesColumnsPage();

    @Given("Users already logged in page")
    public void users_already_logged_in_page() {
        columnsPage.login("posmanager11@info.com","posmanager");

    }
    @When("Manager will log in to page.")
    public void manager_will_log_in_to_page() {

        columnsPage.login("posmanager11@info.com","posmanager");

    }


    @Given("Click to Sales tab on the top")
    public void click_to_sales_tab_on_the_top() {
        columnsPage.salesTab.click();

    }


    @Then("Manager should see below quotations")
    public void managerShouldSeeBelowQuotations(List<String> expectedQuotations) {

        List <String> actualColumns = new ArrayList<>();
        for (WebElement each : columnsPage.columns) {
            Assert.assertTrue(expectedQuotations.contains(each.getText()));
        }


    }


    @Then("Check if log in name appears on the corner")
    public void check_if_log_in_name_appears_on_the_corner_wearers_right_hand_side() {
        String actualName= columnsPage.ManagerInfo.getText();
        String expectedName= "POSManager11";

        Assert.assertTrue(actualName.equals(expectedName) );



    }

    @Then("Manager sees {string}")
    public void managerSees(String Salesperson) {
        BrowserUtils.sleep(3);
        String actualText =  columnsPage.SalesPerson.getText();
        Assert.assertEquals(Salesperson,actualText);

    }
}
