package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.ManagerAccessPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ManagerAccess_StepDefinitions extends BasePage {

    ManagerAccessPage ManagerAccessPage=new ManagerAccessPage();

    @Given("user logged as a sales manager")
    public void user_logged_as_a_sales_manager() {
        login("salesmanager52@info.com","salesmanager");
    }


    @Then("user access the {int} module of the page with the {string}")
    public void userAccessTheModuleOfThePageWithThe(int expectedModuleNumber, String expectedProfileName) {
        int actualModuleNumber = ManagerAccessPage.modules.size();
        Assert.assertTrue(expectedProfileName.equals(ManagerAccessPage.profileName.getText()));
        Assert.assertEquals(expectedModuleNumber,actualModuleNumber);
    }
}
