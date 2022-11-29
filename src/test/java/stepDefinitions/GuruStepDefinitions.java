package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage page = new GuruPage();

    @And("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenSutun) {
        List<WebElement> tabloBaslikListesi = page.baslikListesi;
        //Listemiz webelementlerden olusuyor
        //bu webelementlerden hangisi istenen sutun basligi tasiyor bilemeyiz
        int istenenBaslikIndexi = -3;
        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)) {
                istenenBaslikIndexi = i + 1;
                break;
            }
        }
        //for loop ile tum sutun basliklarinin istenen degerle karsilatirilmasi yapildi
        //loop bitince basligin bulundugu kontrol edilmeli ve bulundu ise isleme devam edilmeli
        if (istenenBaslikIndexi != -3) {//baslik bulundu
            List<WebElement> istenenSutundakiElementler = Driver.getDriver()
                    .findElements(By.xpath("//tbody//tr//td[" + (istenenBaslikIndexi) + "]"));
            for (WebElement each : istenenSutundakiElementler) {
                System.out.println(each.getText());

            }

        } else {//baslik bulunamadi
            System.out.println("istenen baslik bulunamadi");
        }

    }
}
