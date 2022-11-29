package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PearlyPage;
import utilities.ReusableMethods;

public class Project09NegatifTestStepDefinitions {
    PearlyPage page= new PearlyPage();
    @Then("Log in yazisina tiklar")
    public void logInYazisinaTiklar() {
        ReusableMethods.jsScrollClick(page.signInIlk);
    }

    @And("gecersiz {string} girer")
    public void gecersizGirer(String userName) {
        page.userName.sendKeys(userName);
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        page.signInButton.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(page.signInIlk.isDisplayed());

    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
    }

    @And("gecersiz password{string} girer")
    public void gecersizPasswordGirer(String password) {
        page.password.sendKeys(password);
    }
}
