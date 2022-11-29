package stepDefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.PracticeFormPage;
import utilities.Driver;

import java.util.Random;

/*
# Scenario Outline:
ile Frame Workumuza hibrit(behavior and data) ozelligi kazandirmis oluyoruz
 */
public class PracticeFormStepDefinitions {
    PracticeFormPage page = new PracticeFormPage();

    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String url) {
        Driver.getDriver().get(url);

    }

    @When("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void username_password_ve_textarea_kisimlarini_doldurur(String username, String password, String textarea) {
        username= Faker.instance().name().username();
        password= Faker.instance().internet().password();
        textarea= Faker.instance().harryPotter().character();
        page.username.sendKeys(username);
        page.password.sendKeys(password);
        page.commets.clear();
        page.commets.sendKeys(textarea);

    }

    @When("bir dosya yukler")
    public void bir_dosya_yukler() {
        page.chooseFile.sendKeys("C:\\Users\\allam\\Desktop\\Yeni Metin Belgesi.txt");
    }

    @When("checkbox1 i secer")
    public void checkbox1_i_secer() {
        if (!page.checkBox1.isSelected()) page.checkBox1.click();
        if (page.checkBox2.isSelected()) page.checkBox2.click();
        if (page.checkBox3.isSelected()) page.checkBox3.click();

    }

    @When("radio2 yi secer")
    public void radio2_yi_secer() {
        page.radio2.click();

    }

    @When("selection item3 secer")
    public void selection_item3_secer() {
        page.selectItem3.click();

    }

    @When("dropdown item4 secer")
    public void dropdownitem4secer() {
        Select select=new Select(page.dropDown);
        Random random= new Random();
       int sira= random.nextInt(select.getOptions().size()-1);
        select.selectByIndex(sira);

    }

    @When("submite tiklar")
    public void submite_tiklar() {
        page.submitButton.click();

    }

    @Then("dosyanin yuklendigini dogrular")
    public void dosyanin_yuklendigini_dogrular() {
        Assert.assertTrue(page.filaeName.isDisplayed());
    }

}
