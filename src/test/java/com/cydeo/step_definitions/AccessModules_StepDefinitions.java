package com.cydeo.step_definitions;

import com.cydeo.pages.AccessModulesPage;
import com.cydeo.pages.BasePage;
import com.cydeo.pages.AccessModulesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccessModules_StepDefinitions {

    AccessModulesPage accessModulesPage = new AccessModulesPage ();

    @Given("users already logged in page")
    public void users_already_logged_in_page() {
        accessModulesPage.login ("posmanager22@info.com","posmanager");

        Assert.assertTrue (accessModulesPage.posmanager.isDisplayed ());

    }


    @Then("user should verify {int} main modules")
    public void userShouldVerifyMainModules(int expected) {

        Assert.assertEquals (expected, accessModulesPage.modules.size ());


    }


}
