package stepDefinitions;

import Pages.AmazonPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PracAmazonStepDefinition {

    AmazonPage amazonPage = new AmazonPage();

   // Faker faker = new Faker();

    @Given("kullanici Amazon web sitesine gider")
    public void kullanici_amazon_web_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @When("sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        amazonPage.signIn.click();

    }
    @When("faker kullanarak e-posta gonderir")
    public void faker_kullanarak_e_posta_gonderir() {
       // amazonPage.emailBox.sendKeys(faker.internet().emailAddress());
        amazonPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());


    }
    @When("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigi_e_postanin_ekran_goruntusunu_alir() throws IOException {
        ReusableMethods.getScreenshotWebElement("FakeEmail",amazonPage.emailBox);

    }
    @When("continiue'a tiklar")
    public void continiue_a_tiklar() {
        amazonPage.continueButton.click();

    }
    @Then("There was a problem mesajini dogrular")
    public void there_was_a_problem_mesajini_dogrular() {
       String expectedText="There was a problem";
       String actualText= amazonPage.warningMessage.getText();
       Assert.assertEquals("Problem mesajı yanlıs",expectedText,actualText);

    }
    @Then("Need help e tiklar")
    public void need_help_e_tiklar() {
        amazonPage.needHelp.click();

    }
    @Then("forgot your password e tiklar")
    public void forgot_your_password_e_tiklar() {
        amazonPage.forgetPassword.click();

    }
    @Then("Password assistance metnini dogrular")
    public void password_assistance_metnini_dogrular() {
        Assert.assertTrue(amazonPage.passwordAssistance.isDisplayed());

    }
    @Then("Geri gider")
    public void geri_gider() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

    }
    @Then("Create your account butonuna tiklar")
    public void create_your_account_butonuna_tiklar() {
        amazonPage.createAccButton.click();

    }
    @Then("Create account metnini dogrular")
    public void create_account_metnini_dogrular() {
        Assert.assertTrue("Create Account texti içermiyor", amazonPage.createAccMessage.getText().contains("Create account"));

    }
    @Then("websayfasini kapatir")
    public void websayfasini_kapatir() {
        Driver.closeDriver();

    }


}
