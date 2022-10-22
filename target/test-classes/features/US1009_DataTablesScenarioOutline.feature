Feature: US1009 DataTablessitesine 5 farkli giris yapalim

  @datatable
  Scenario Outline: TC14 5 farkli kayit girisi yapilabilmeli
    When kullanici "dataTablesUrl" anasayfasinda
    Then new butonuna basar
    And isim bolumune firstName"<firstName>"
    And lastName bolumune "<lastName>"
    And position bolumune "<position>"
    And office bolumune "<office>"
    And extension bolumune "<extension>"
    And startDate bolumune "<startDate>"
    And salary bolumune "<salary>"
    And Create tusuna basar
    When kullanici "<firstName>" ile arama yapar
    Then isim bolumunde "<firstName>" oldugunu dogrular
    Examples:
    |firstName|lastName|position|office|extension|startDate|salary|
    |firstName|lastName|position|office|extension|2009-05-20|10000|
    |firstName|lastName|position|office|extension|2018-06-18|20000|
    |firstName|lastName|position|office|extension|2022-07-02|30000|
    |firstName|lastName|position|office|extension|2021-08-01|40000|
    |firstName|lastName|position|office|extension|2020-01-02|50000|
