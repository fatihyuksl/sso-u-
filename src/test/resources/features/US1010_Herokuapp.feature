@heroku
Feature: US1010 herokuapp Delete testi
  Scenario: TC15 herokuapp'dan delete butonu calismali
    Given kullanici "herokuAppUrl" anasayfasinda
    And add Element  butona basar
    And kullanici 2 sn bekler
    Then Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test edin
    Then  Delete butonuna basar
    And kullanici 3 sn bekler
    And Delete butonuna gorunmedigini test eder
    And  sayfayi kapatir

