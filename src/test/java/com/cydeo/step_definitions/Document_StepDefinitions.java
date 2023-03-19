package com.cydeo.step_definitions;

import com.cydeo.pages.DocumentPage;
import com.cydeo.pages.DocumentPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class Document_StepDefinitions {
    DocumentPage DocumentPage = new DocumentPage ();

    @Given("user is logged inside")
    public void user_is_logged_in() {
        DocumentPage.login("posmanager30@info.com", "posmanager");
    }

    @When("user clicks {string} button")
    public void user_clicks_button(String linkText) {
        DocumentPage.ClickMenu(linkText);
    }

    @When("user clicks {string} option")
    public void user_clicks_option(String menuOption) {
        String mainHandle = Driver.getDriver().getWindowHandle();
        BrowserUtils.sleep(2);
        DocumentPage.ClickMenu(menuOption);

        BrowserUtils.sleep(1);

        Set<String> windows = Driver.getDriver().getWindowHandles();

        for (String window : windows) {
            Driver.getDriver().switchTo().window(window);
        }
    }

    @Then("user sees  {string} in the url")
    public void user_sees_in_the_url(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));
    }

    @Then("user sees {string} message is displayed")
    public void user_sees_message_is_displayed(String string) {
        Assert.assertTrue(DocumentPage.message.isDisplayed());
        Assert.assertEquals(DocumentPage.message.getText(), string);
    }

    @Then("there are {int} main documents topics are listed")
    public void there_are_main_documents_topics_are_listed(Integer int1) {
        Assert.assertTrue(DocumentPage.headers.size() == int1);
    }

}
