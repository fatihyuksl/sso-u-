import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinitions {
    Workbook workbook;

    @Given("kullanici excel  dosyasini kullanilabilir hale getirir")
    public void kullaniciExcelDosyasiniKullanilabilirHaleGetirir() throws IOException {
        String dosyaYolu = "src/test/resources/features/ulkeler.xlsx";
        //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis = new FileInputStream(dosyaYolu);
        //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        //-WorkbookFactory.create(fileInputStream)
        Workbook workbook = WorkbookFactory.create(fis);

    }

    @Then("{int}.satirdaki {int}.hucreyi yazdirir")
    public void satirdakiHucreyeGidelimVeYazdirir(int satir, int sutun) {
        String istenenHucreYazisi = workbook
                .getSheet("Sayfa1")
                .getRow(satir - 1)
                .getCell(sutun - 1)
                .toString();
        System.out.println(satir + ". satir " + sutun + ".sutun'daki deger : " + istenenHucreYazisi);
    }

    @And("baskenti Jakarta olan ulke ismini yazdirir")
    public void baskentiJakartaOlanUlkeIsminiYazdirir() {
        int satirSayisi = workbook.getSheet("Sayfa1").getLastRowNum();
        for (int i = 0; i <= satirSayisi; i++) {
            if (workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString().equals("Jakarta")) ;
            System.out.println("Baskenti Jakarta olan ulke : " +
                    workbook.getSheet("Sayfa1").getRow(i).getCell(0));

        }

    }

    @And("Ulke sayisinin {int} oldugunu test eder")
    public void ulkeSayisininOldugunuTestEder(int ulkeSayisi) {
        int actualulkeSayisi = workbook.getSheet("Sayfa1").getLastRowNum();
        Assert.assertTrue(ulkeSayisi == actualulkeSayisi);

    }

    @And("Fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fizikiOlarakKullanilanSatirSayisininOldugunuTestEder(int kullanilanSatirSayisi) {
        int actualkullanilanSatirSayisi = workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertTrue(kullanilanSatirSayisi == actualkullanilanSatirSayisi);

    }


}
