package CEPS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='email']")
    @CacheLookup
    WebElement usernameInput ;

    @FindBy(xpath = "//input[@name='password']")
    @CacheLookup
    WebElement passwordInput ;

    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    WebElement submitButton ;

    public LoginPage usernameInput (String UserName)
    {
        usernameInput.sendKeys(UserName);
        return this;
    }


    public LoginPage passwordInput (String Password)
    {
        passwordInput.sendKeys(Password);
        return this;
    }

    public LoginPage submitButton()
    {
        submitButton.click();
        return this;
    }


}

