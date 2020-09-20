package StepDefinationPackage;

import PageObjectPackage.MobileDealPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefProduct {
    MobileDealPage mobileDealPage=new MobileDealPage();
    @Given("^User is on homepage$")
    public void user_is_on_homepage() throws Throwable {
    mobileDealPage.baseurl();
    }

    @When("^User is going to paymonthly phone$")
    public void user_is_going_to_paymonthly_phone() throws Throwable {
    mobileDealPage.shop();
    }

    @When("^search the different mobile phone deal$")
    public void search_the_different_mobile_phone_deal() throws Throwable {

    }

    @Then("^User should see all the deal with description$")
    public void user_should_see_all_the_deal_with_description() throws Throwable {

    }

}
