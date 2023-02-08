package stepDefinitions;

import Pages.TestPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

import javax.swing.*;
import java.util.List;

public class PracticeTestPageStepDef {
    TestPage testPage= new TestPage();
    Actions actions= new Actions(Driver.getDriver());
    int down32toplam;
    int clickTextToplam;
    int sonuc;

    @Given("{string} adresine gidin")
    public void adresine_gidin(String url) {
        Driver.getDriver().get(url);
    }

    @Given("{int} defa click me ye tiklayin")
    public void defa_click_me_ye_tiklayin(Integer int1) {
        for (int i = 0; i <int1 ; i++) {
            testPage.clikButton.click();
        }
    }

    @Given("{int} defa Space dugmesine basin")
    public void defa_space_dugmesine_basin(Integer int1) {
        for (int i = 0; i <int1 ; i++) {
            actions.sendKeys(Keys.SPACE).perform();
        }
    }

    @Given("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void down_yazisindaki_iki_basamakli_sayilarin_hepsini_toplayin() {
        List<WebElement> down32= testPage.down32;
        for (WebElement w: down32) {
            down32toplam+= Integer.parseInt(w.getText().replaceAll("[^0-9]",""));
            //string'i int'e çevrildi. Replace all'da down atıldı sadece 32 kaldı.
        }
        System.out.println("down32toplamı: " +down32toplam);

        }



    @Given("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tum_click_metinlerinin_uzunlugunun_toplamini_onceki_toplamdan_cikarin() {
        List<WebElement> clickText= testPage.clickText;
        for (WebElement w: clickText) {
        clickTextToplam+= w.getText().length();
        }
        sonuc= down32toplam - clickTextToplam;
        System.out.println("Sonuç:" +sonuc);


    }

    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucun_oldugunu_dogrulayin(int result) {
        Assert.assertEquals("Sonuc esit degil",result,(sonuc));

    }

}
