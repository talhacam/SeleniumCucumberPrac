package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracNegativePage {
    public PracNegativePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signinSymbol;

    @FindBy (xpath = "//span[.='Sign in']")
    public WebElement signinButton;

    @FindBy (xpath = "//*[@name='username']")
    public WebElement usernameBox;

    @FindBy (xpath = "//*[@name='password']")
    public WebElement passwordBox;

    @FindBy (xpath = "(//*[.='Sign in'])[4]")
    public WebElement siginWithCredentials;

    @FindBy (xpath = "//*[contains(text(), 'Authentication information not correct.')]")
    public WebElement popUpMessage;
}
