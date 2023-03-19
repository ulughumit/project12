package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.SalesLoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SalesLogin_StepDefinitions {

    SalesLoginPage loginPage =new SalesLoginPage();
    @When("Users login with their {string} and {string}")
    public void usersLoginWithTheirAnd(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("Users see the correct {string}")
    public void usersSeeTheCorrect(String accountName) {
        Assert.assertEquals(accountName,loginPage.accountHolder.getText());

    }

}
