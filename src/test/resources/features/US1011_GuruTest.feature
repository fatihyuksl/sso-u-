Feature: US1011 web tablosundaki istenen sutunu yazdirma
@guru
  Scenario: TC16 sutun_basligi_ile_liste_alabilmeli

    Given kullanici "guruUrl" anasayfasinda
    And "Prev Close (Rs)", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir