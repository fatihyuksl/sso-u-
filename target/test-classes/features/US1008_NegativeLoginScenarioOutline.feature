#pearlymarket Login negative test case’i asagidaki 5
#kullanici ismi ve sifresi icin calisacak sekilde duzenleyin
#Kullanici adi #Password
#Manager5       Manager5!
#Manager6       Manager6!
#Manager7       Manager7!
#Manager8       Manager8!
#Manager9       Manager9!
@pearly
Feature: US1008 kullanici farkli yanlis sifre ve kullanici adiyla giris yapamaz

  Scenario Outline: TC13 yanlis kullanici adi ve sifrelerle giris yapilamaz
    Given kullanici "projeUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz "<username>" girer
    And gecersiz password"<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kulllanici sayfayi kapatir
    Examples:
      | username | password  |
      | Manager5 | Manager5! |
      | Manager6 | Manager6! |
      | Manager7 | Manager7! |
      | Manager8 | Manager8! |
      | Manager9 | Manager9! |