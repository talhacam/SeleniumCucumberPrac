package stepDefinitions;

import Pages.PracticeFormPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.Random;

public class PracticeFormStepDef {

    PracticeFormPage practiceFormPage = new PracticeFormPage();


    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String url) {
        Driver.getDriver().get(url);

    }
    @When("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void username_password_ve_textarea_kisimlarini_doldurur(String username, String password, String textarea) {
       username= Faker.instance().name().username();
       password= Faker.instance().internet().password();
       textarea= Faker.instance().animal().name();

        practiceFormPage.username.sendKeys(username);
        practiceFormPage.password.sendKeys(password);
        practiceFormPage.textArea.clear();
        practiceFormPage.textArea.sendKeys(textarea);


    }
    @When("bir dosya yukler")
    public void bir_dosya_yukler() {
        //practiceFormPage.dosyaSec.sendKeys("C:\\Users\\pc\\Desktop\\text.txt");

        String homeDirectory = System.getProperty("user.home");
        String filePath = homeDirectory+"/Desktop/text.txt";
        practiceFormPage.dosyaSec.sendKeys(filePath);

    }
    @When("checkbox1 i secer")
    public void checkbox1_i_secer() {
        /*
        practiceFormPage.checkBox1.click();
        practiceFormPage.checkBox3.click();
         Benim yaptığım
         */

        //Hocanın yaptığı

        if (!practiceFormPage.checkBox1.isSelected()){
            practiceFormPage.checkBox3.click();
        }
        if (practiceFormPage.checkBox2.isSelected()){
            practiceFormPage.checkBox2.click();
        }
        if (practiceFormPage.checkBox3.isSelected()){
            practiceFormPage.checkBox3.click();
        }

    }
    @When("radio2 yi secer")
    public void radio2_yi_secer() {
        practiceFormPage.radioButton2.click();

    }

    @When("selection item3 secer")
    public void selection_item3_secer() {
        practiceFormPage.selectItem3.click();

    }
    @When("dropdown itmem4 secer")
    public void dropdown_itmem4_secer() {
        Select select = new Select(practiceFormPage.dropDown);
        Random random = new Random();
        int rastgele= random.nextInt(select.getOptions().size()-1);
        select.selectByIndex(rastgele);

    }
    @When("submite tiklar")
    public void submite_tiklar() {
        practiceFormPage.submitButton.click();

    }
    @Then("dosyanin yuklendigini dogrular")
    public void dosyanin_yuklendigini_dogrular() {
        Assert.assertTrue(practiceFormPage.fileName.isDisplayed());

    }
}
