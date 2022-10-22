package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {
    DataTablesPage data=new DataTablesPage();
    Faker faker= new Faker();
    @Then("new butonuna basar")
    public void newButonunaBasar() {
        data.newButton.click();
    }

    @And("isim bolumune firstName{string}")
    public void isimBolumuneFirstName(String userName) {
        userName=faker.name().firstName();
        data.firstName.sendKeys(userName);
    }

    @And("lastName bolumune {string}")
    public void lastnameBolumune(String lastName) {
        lastName=faker.name().lastName();
        data.lastName.sendKeys(lastName);
    }

    @And("position bolumune {string}")
    public void positionBolumune(String position) {
        position=faker.job().position();
        data.position.sendKeys(position);
    }

    @And("office bolumune {string}")
    public void officeBolumune(String office) {
        office=faker.company().name();
        data.office.sendKeys(office);
    }

    @And("extension bolumune {string}")
    public void extensionBolumune(String extension) {
        extension=faker.name().title();
        data.extension.sendKeys(extension);
    }

    @And("startDate bolumune {string}")
    public void startdateBolumune(String startDate) {
        data.startDate.sendKeys(startDate);
    }

    @And("salary bolumune {string}")
    public void salaryBolumune(String salary) {
        data.salary.sendKeys(salary);
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        data.createButton.click();
    }

    @When("kullanici ilk isim ile arama yapar")
    public void kullaniciIlkIsimIleAramaYapar() {
    }

    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isimBolumundeIsmininOldugunuDogrular() {

    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        data.search.sendKeys(firstName);

    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstName) {
        Assert.assertTrue(data.aramaSonucFirstName.getText().contains(firstName));
    }
}
