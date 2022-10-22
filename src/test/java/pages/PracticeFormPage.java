package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class PracticeFormPage {
    public PracticeFormPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='comments']")
    public WebElement commets;

    @FindBy(xpath = "//input[@name='filename']")
    public WebElement chooseFile;

    @FindBy(xpath = "(//input[@name='checkboxes[]'])[1]")
    public WebElement checkBox1;

    @FindBy(xpath = "(//input[@name='checkboxes[]'])[2]")
    public WebElement checkBox2;

    @FindBy(xpath = "(//input[@name='checkboxes[]'])[3]")
    public WebElement checkBox3;

    @FindBy(xpath = "//input[@value=\"rd2\"]")
    public WebElement radio2;

    @FindBy(xpath = "//*[@value='ms3']")
    public WebElement selectItem3;

    @FindBy(xpath = "//select[@name='dropdown']")
    public WebElement dropDown;

    @FindBy(xpath = "//input[@value='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//li[text()='Yeni Metin Belgesi.txt']")
    public WebElement filaeName;


}
