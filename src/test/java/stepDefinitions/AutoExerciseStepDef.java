package stepDefinitions;

import Pages.AutoExercisePage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class AutoExerciseStepDef {
    AutoExercisePage autoExercisePage= new AutoExercisePage();

    @Given("Istenen {string} adresine git")
    public void istenen_adresine_git(String istenenUrl) {

        Driver.getDriver().get(istenenUrl);

    }

    @Then("Anasayfanin basariyla gorunur oldugunu dogrula")
    public void anasayfanin_basariyla_gorunur_oldugunu_dogrula() {

        String homeUrl="https://automationexercise.com/";
        Assert.assertEquals("home url eşit değil",homeUrl,Driver.getDriver().getCurrentUrl());

    }

    @Then("Test Case butonuna tikla")
    public void test_case_butonuna_tikla() {
        autoExercisePage.testCasesLink.click();


    }

    @Then("Kullanicinin test case sayfasina basariyla yonlendirildigini dogrula")
    public void kullanicinin_test_case_sayfasina_basariyla_yonlendirildigini_dogrula() {
        Assert.assertTrue(autoExercisePage.testCasesTitle.isDisplayed());

    }

    @Then("Ilgili sayfanin Ss'ini al")
    public void ilgili_sayfanin_ss_ini_al() {

        try {
            ReusableMethods.getScreenshot("TC07 Page");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
