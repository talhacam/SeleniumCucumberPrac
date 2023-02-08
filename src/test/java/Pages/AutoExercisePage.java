package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExercisePage {
    public AutoExercisePage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "(//i[@class='fa fa-list'][1])")
    public WebElement testCasesLink;

    @FindBy (xpath = "(//h2)[1]")
    public WebElement testCasesTitle;


}
