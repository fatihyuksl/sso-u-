package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuAppPage;
import utulities.ReusableMethods;

public class HerokuAppStepDefinitions {
    HerokuAppPage page= new HerokuAppPage();
    @And("add Element  butona basar")
    public void addElementButonaBasar() {
        ReusableMethods.jsScrollClick(page.addElement);
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void deleteButonuGorunurOluncayaKadarBekler() {
        ReusableMethods.waitForVisibility(page.deleteButton,3);
    }

    @And("Delete butonunun gorunur oldugunu test edin")
    public void deleteButonununGorunurOldugunuTestEdin() {
        Assert.assertTrue(page.deleteButton.isDisplayed());
    }

    @Then("Delete butonuna basar")
    public void deleteButonunaBasar() {
       ReusableMethods.jsScrollClick(page.deleteButton);
    }

    @And("Delete butonuna gorunmedigini test eder")
    public void deleteButonunaGorunmediginiTestEder() {
        Assert.assertFalse(page.deleteButton.isDisplayed());
    }
}
