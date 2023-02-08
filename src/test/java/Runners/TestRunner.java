package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue= "stepDefinitions",
        tags="@medunna",  //İki tane seneryo çalıştırmak için seneryoların yanına "@" ile aynı isim verilip çalıştırılabilir.
        dryRun = false
)
public class TestRunner {


    /*
    Bir framework'de tek bir Runner class'ı yeterli olabilir.
    Runner class'ında class body'sinde hiçbir şey olmaz.
    Runner class'ımızı önemli yapan 2 adet annotaion vardır.
    @RunWith(Cucumber.class) notasyonu Runner class'ına calisma özelliği katar.
    Bu notasyon oldugu için Cucumber frameworkumuzde JUnit kullanmayı tercih ediyoruz.

    features: Runner dosyasının feature dosylarını nereden bulacağını tarif eder.
    glue: stepDefinitions dosyalarını nerede bulacağımızı gösterir.
    tags: o an hangi tag'ı çalıştırmak istiyorsak onu belli eder.

    dryRun:
    dryRun= true  : yazdığımızda Testimizi çalıştırmadan sadece eksik adımları bize verir.

    dryRun= false : yazdığımızda testlerimizi çalıştırır.

     */
}
