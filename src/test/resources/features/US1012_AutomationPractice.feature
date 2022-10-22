Feature:US1012 Kullanici register yapabilmeli

  @automation
  Scenario:TC17 kullanici uygun datalarla register olabilmeli


  sayfasina gidelim
  Cucumber ile asagidaki testi yapalim
    Given kullanici "automationUrl" anasayfasinda
    And user sign in linkine tiklar
    And kullanici 5 sn bekler
    And user Create and account bölümüne email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And kullanici 5 sn bekler
    And user Register butonuna basar
    Then hesap olustugunu dogrular
    And sayfayi kapatir