
Feature: Amazon Search
  @112
  Scenario: TC01 kullanici amazonda Nutella aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir
  @112
  Scenario: TC02 kullanici amazonda Nutella aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder
    And sayfayi kapatir
    Then kullanici iphone icin arama yapar
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir

  @111
  Scenario: TC03 kullanici amazonda Nutella aratir
    Given Kullanici "https://sso.catchprobe.com/"  adresine gidilir
    When Kullanıcı Darkmap modulüne gider
    Then Darkmap de Staticts sayfasına ulaşır
    When Kullanıcı Threatway modulüne giderAnd Threatway de Statics sayfasına ulaşır
    When Kullanıcı Smartdeceptive modulüne giderThen Smartdeceptive de Home sayfasına ulaşır
    When SmartDecepitve Deception Operations bölümüne gelir
    And  SmartDeceptive de zone definitions da status ve ruuning durumlarını kontrol eder
    And  SmartDeceptive de zone definitions da herhangi bir aksaklık yok
    And  SmartDeceptive de Honeypot Definitions da status ve ruuning durumlarını kontrol eder
    And  SmartDeceptive de Honeypot Definitions da herhangi bir aksaklık yok
    And Kullanıcı CrimeGround sayfasına ulaşırAnd Arama kısmına keyword ekleyip sonuçları gördürür
    And Kullanıcı LeakMap sayfasına ulaşırAnd Dashboard bölümüne gelir Data Leak Fields kısmını görür
    Then sayfayi kapatir
