package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.ModuleAccessPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Module_Access_StepDefinitions extends BasePage {

    ModuleAccessPage moduleAccessPage = new ModuleAccessPage ();

    @When("user is on the base page")
    public void user_is_on_the_base_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Then("user login as a Event manager")
    public void user_login_as_a_event_manager() {
        moduleAccessPage.login("eventscrmmanager14@info.com","eventscrmmanager");


    }

    @Then("use should see {int} modules")
    public void useShouldSeeModules(int modules) {


        Assert.assertEquals(modules, moduleAccessPage.ModulesAccessButtons.size());


    }



}



