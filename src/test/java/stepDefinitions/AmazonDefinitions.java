package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import org.openqa.selenium.interactions.Actions;

public class AmazonDefinitions {
    AmazonPage amazonPage = new AmazonPage();
    AmazonPage SSO = new AmazonPage();


    @Given("kullanici amazon anasayfasinda")
    public void kullaniciAmazonAnasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("catchprobe"));
        amazonPage.customername.sendKeys(ConfigReader.getProperty("username"));

        ReusableMethods.waitFor(3);
        amazonPage.password.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(3);
        amazonPage.Login.click();

        ReusableMethods.waitFor(18);
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @And("sonuclarin Nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String actualStr = amazonPage.aramaSonucElementi.getText();
        String expectedStr = "Nutella";
        Assert.assertTrue(actualStr.contains(expectedStr));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Java", Keys.ENTER);
    }

    @And("sonuclarin Java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        String actualStr = amazonPage.aramaSonucElementi.getText();
        String expectedStr = "Java";
        Assert.assertTrue(actualStr.contains(expectedStr));
    }

    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String actualStr = amazonPage.aramaSonucElementi.getText();
        String expectedStr = "iphone";
        Assert.assertTrue(actualStr.contains(expectedStr));
    }

    @And("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {
        String actualStr = amazonPage.aramaSonucElementi.getText();
        String expectedStr = istenenKelime;
        Assert.assertTrue(actualStr.contains(expectedStr));
    }

    @Given("kullanici {string} anasayfasinda")//amazonUrl
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("Kullanici {string}  adresine gidilir")
    public void kullaniciAdresineGidilir(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("catchprobe"));
        amazonPage.customername.sendKeys(ConfigReader.getProperty("username"));

        ReusableMethods.waitFor(3);
        amazonPage.password.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(3);
        amazonPage.Login.click();

        ReusableMethods.waitFor(18);
    }



    @When("Kullanıcı Threatway modulüne giderAnd Threatway de Statics sayfasına ulaşır")
    public void kullanıcıThreatwayModulüneGiderAndThreatwayDeStaticsSayfasınaUlaşır() {
    }

    @When("Kullanıcı Smartdeceptive modulüne giderThen Smartdeceptive de Home sayfasına ulaşır")
    public void kullanıcıSmartdeceptiveModulüneGiderThenSmartdeceptiveDeHomeSayfasınaUlaşır() {
    }

    @When("SmartDecepitve Deception Operations bölümüne gelir")
    public void smartdecepitveDeceptionOperationsBölümüneGelir() {
    }

    @And("SmartDeceptive de zone definitions da status ve ruuning durumlarını kontrol eder")
    public void smartdeceptiveDeZoneDefinitionsDaStatusVeRuuningDurumlarınıKontrolEder() {
    }

    @And("SmartDeceptive de zone definitions da herhangi bir aksaklık yok")
    public void smartdeceptiveDeZoneDefinitionsDaHerhangiBirAksaklıkYok() {
    }

    @And("SmartDeceptive de Honeypot Definitions da status ve ruuning durumlarını kontrol eder")
    public void smartdeceptiveDeHoneypotDefinitionsDaStatusVeRuuningDurumlarınıKontrolEder() {
    }

    @And("SmartDeceptive de Honeypot Definitions da herhangi bir aksaklık yok")
    public void smartdeceptiveDeHoneypotDefinitionsDaHerhangiBirAksaklıkYok() {
    }

    @And("Kullanıcı CrimeGround sayfasına ulaşırAnd Arama kısmına keyword ekleyip sonuçları gördürür")
    public void kullanıcıCrimeGroundSayfasınaUlaşırAndAramaKısmınaKeywordEkleyipSonuçlarıGördürür() {
    }

    @And("Kullanıcı LeakMap sayfasına ulaşırAnd Dashboard bölümüne gelir Data Leak Fields kısmını görür")
    public void kullanıcıLeakMapSayfasınaUlaşırAndDashboardBölümüneGelirDataLeakFieldsKısmınıGörür() {
    }

    @When("Kullanıcı Darkmap modulüne gider")
    public void kullanıcıDarkmapModulüneGider() {
        ReusableMethods.waitFor(10);
        SSO.Darkmap.click();ReusableMethods.waitFor(3);
        SSO.Threatway.click();ReusableMethods.waitFor(3);
        SSO.SmartDeceptive.click();ReusableMethods.waitFor(3);
        SSO.CrimeGround.click();ReusableMethods.waitFor(3);
        SSO.Leakmap.click();ReusableMethods.waitFor(3);
    }

    @Then("Darkmap de Staticts sayfasına ulaşır")
    public void darkmapDeStatictsSayfasınaUlaşır() {
        Driver.getDriver().get(ConfigReader.getProperty("darkmap"));
/*  JavascriptExecutor executor = (JavascriptExecutor)driver;
  executor.executeScript("document.body.style.zoom = '80%'");*/

        ReusableMethods.waitFor(3);
        String expecteddata="Daily Stats of keyword";
        String actualdata=SSO.DailyStats.getText();
        Assert.assertEquals(expecteddata, actualdata);
        System.out.println(actualdata);
        //ReusableMethods.scrollBy(500);
        SSO.QuickSearch.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(SSO.exploit2.isEnabled());
    }
}
