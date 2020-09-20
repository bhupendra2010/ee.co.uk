package StepDefinationPackage;

import PageObjectPackage.RegistarPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefRegistar {
    RegistarPage page=new RegistarPage();
    @When("^User navigate to registar page$")
    public void user_navigate_to_registar_page() throws Throwable {
    page.registar();
    }

    @Then("^user can fill all the details and create his account$")
    public void user_can_fill_all_the_details_and_create_his_account() throws Throwable {

    }

}
