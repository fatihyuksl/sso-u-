package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utulities.Driver;
import utulities.ReusableMethods;

public class AutomationStepDefinitions {
    AutomationPage auto = new AutomationPage();
    Faker faker = new Faker();
    Actions action = new Actions(Driver.getDriver());
    @And("user sign in linkine tiklar")
    public void userSignInLinkineTiklar() {
        auto.login.click();
    }

    @And("user Create and account bölümüne email adresi girer")
    public void userCreateAndAccountBölümüneEmailAdresiGirer() {
        auto.createEmail.sendKeys(faker.internet().emailAddress());

    }

    @And("Create an Account butonuna basar")
    public void createAnAccountButonunaBasar() {
        action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void userKisiselBilgileriniVeIletisimBilgileriniGirer() {
        auto.radioButton.click();
        action.sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).sendKeys(Keys.TAB).sendKeys("1").
                sendKeys(Keys.TAB).sendKeys("June").sendKeys(Keys.TAB).sendKeys("1982").
                sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.company().name()).
                sendKeys(Keys.TAB).sendKeys(faker.address().country()).sendKeys(Keys.TAB).
                sendKeys(faker.address().city()).sendKeys(Keys.TAB).sendKeys("kansa").sendKeys(Keys.TAB).
                sendKeys("Alaska").sendKeys(Keys.TAB).sendKeys("07100").sendKeys(Keys.TAB).
                sendKeys("United States").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).perform();

    }

    @And("user Register butonuna basar")
    public void userRegisterButonunaBasar() {
        action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
    }

    @Then("hesap olustugunu dogrular")
    public void hesapOlustugunuDogrular() {
        Assert.assertTrue(auto.myAccountText.isDisplayed());
    }
}
