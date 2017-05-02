import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;


public class AccountSteps {

    Account account;

    @Given("^I have an account with (\\d+) dollars$")
    public void iHaveAnAccountWithDollars(int dollars) throws Throwable {
         account = new Account(dollars);

    }

    @When("^I deposit (\\d+) dollars$")
    public void iDepositDollars(int dollars) throws Throwable {
        account.deposit(dollars);
    }

    @Then("^my new balance should be (\\d+) dollars$")
    public void myNewBalanceShouldBeDollars(Integer balance) throws Throwable {
        Assert.assertEquals(balance, account.balance);
    }

}
