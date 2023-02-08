package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[@class='nav-a nav-a-2   nav-progressive-attribute'][1])")
    public WebElement signIn;

    @FindBy (xpath = "//input[@id='ap_email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//h4[@class='a-alert-heading']")
    public WebElement warningMessage;

    @FindBy (xpath = "//span[@class='a-expander-prompt']")
    public WebElement needHelp;

    @FindBy(xpath = "//a[@id='auth-fpp-link-bottom']")
    public WebElement forgetPassword;

    @FindBy (xpath = "//h1")
    public WebElement passwordAssistance;

    @FindBy (xpath = "//a[@id='createAccountSubmit']")
    public WebElement createAccButton;

    @FindBy (xpath = "//h1[@class='a-spacing-small']")
    public WebElement createAccMessage;


}
