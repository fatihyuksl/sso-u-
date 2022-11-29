package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuAppPage {
    public HerokuAppPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@onclick='addElement()']")
    public WebElement addElement;

    @FindBy(xpath ="//button[contains(text(),'Delete')]")
    public WebElement deleteButton;


}
