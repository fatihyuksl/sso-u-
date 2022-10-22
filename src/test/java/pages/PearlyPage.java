package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class PearlyPage {
    public PearlyPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = ".login.inline-type")
    public WebElement signInIlk;

    @FindBy(xpath = "//button[contains(text(),'Sign In')]")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;




}
