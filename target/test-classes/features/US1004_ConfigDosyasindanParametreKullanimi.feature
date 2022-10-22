Feature: US1004 Kullanici ;parametre ile configuration file'i kullanabilmeli

  @config@pr2
  Scenario: TC07 configuration properties dosyasindan paramtere kullanimi
    Given kullanici "trendyolUrl" anasayfasinda
    Then  kullanici 3 sn bekler
    And url'in "trend" icerdigini test eder
    Then sayfayi kapatir