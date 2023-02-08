package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class AmazonPage {
    public AmazonPage() {
       PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;
    @FindBy(xpath = "//input")
    public WebElement customername;
    @FindBy(xpath = "(//input)[2]")
    public WebElement password;
    @FindBy(xpath = "//button")
    public WebElement Login;
    @FindBy(xpath = "//select[@class='dashboard-select form-control']")
    public WebElement Dashboard;
    @FindBy(xpath = "//select[@class='tagging']")
    public WebElement Select;
    @FindBy(xpath = "//span[@class='font-13']")
    public WebElement search;
    @FindBy(xpath = "//a[@href='https://www.catchprobe.com']")
    public WebElement catchprobes;
    @FindBy(xpath = "//input[@placeholder='Search Scraped Datas...']")
    public WebElement arama;
    @FindBy(xpath = "(//h5)[6]")
    public WebElement Mostused;
    @FindBy(xpath = "(//h5)[2]")
    public WebElement Mostattack;
    @FindBy(xpath = "(//h5)[5]")
    public WebElement Mostattackhacker;
    @FindBy(xpath = "(//h5[@class='redirect-title'])[3]")
    public WebElement Leakinfo;
    @FindBy(xpath = "(//h5[@class='redirect-title'])[2]")
    public WebElement Keywords;
    @FindBy(xpath = "//div[@class='active-project']")
    public WebElement DarkmapYön;
    @FindBy(xpath = "(//img)[1]")
    public WebElement Catchprobeimg;
    @FindBy(xpath = "(//h5[@class='redirect-title'])[4]")
    public WebElement Schellcode;
    @FindBy(xpath = "//input[@value='Yükle!']")
    public WebElement Yukle;
    @FindBy(xpath = "//h1")
    public WebElement Yuklemetamam;
    @FindBy(xpath = "//span[text()='DarkMap']")
    public WebElement Darkmap;
    @FindBy(xpath = "//div[@class='hover-project']")
    public WebElement DarkmapLight;
    @FindBy(xpath = "//*[@class='flaticon-search-engine m-menu__link-icon']")
    public WebElement QuickSearch;
    @FindBy(xpath = "(//*[text()=' ak-69 '])[1]")
    public WebElement exploit;
    @FindBy(xpath = "//*[text()=' exploit ']")
    public WebElement exploit2;
    @FindBy(xpath = "//*[@id=\"m_ver_menu\"]")
    public WebElement DarkmapStatistictt;
    @FindBy(xpath = "//h3[text()=' Daily Stats of keyword ']")
    public WebElement DailyStats;
    @FindBy(xpath = "//span[text()='Threatway']")
    public WebElement Threatway;
    @FindBy(xpath = "//*[@style='text-align: center; padding: 10px']")
    public WebElement Threatwayalt;
    @FindBy(xpath = "//*[@class='m-scroll-top m-scroll-top--skin-top']")
    public WebElement İmlec;
    @FindBy(xpath = "//*[@class='m-scroll-top']")
    public WebElement Smartİmlec;
    @FindBy(xpath = "//span[text()='SmartDeceptive']")
    public WebElement SmartDeceptive;
    @FindBy(xpath = "//h3[text()=' BAD REPUTATIONS ']")
    public WebElement Badreputations;
    @FindBy(xpath = "//h3[text()=' The Top Attacking IP Addresses ']")
    public WebElement Thetopattacking;
    @FindBy(xpath = "//h3[text()=' The Most Tried Passwords ']")
    public WebElement Themosttried;
    @FindBy(xpath = "(//*[@role='slider'])[2]")
    public WebElement Slider1;
    @FindBy(xpath = "(//*[@role='slider'])[3]")
    public WebElement Slider2;
    @FindBy(xpath = "//*[@role='slider']")
    public WebElement Slider3;
    @FindBy(xpath = "//span[text()='CrimeGround']")
    public WebElement CrimeGround;
    @FindBy(xpath = "//input[@class='search-input form-control']")
    public WebElement Search;
    @FindBy(xpath = "(//button[@id='0'])[2]")
    public WebElement button1;
    @FindBy(xpath = "//button[@id='1']")
    public WebElement button2;
    @FindBy(xpath = "//button[@id='2']")
    public WebElement button3;
    @FindBy(xpath = "//button[@id='3']")
    public WebElement button4;
    @FindBy(xpath = "//button[@id='4']")
    public WebElement button5;
    @FindBy(xpath = "//button[@id='5']")
    public WebElement button6;
    @FindBy(xpath = "//button[@id='6']")
    public WebElement button7;
    @FindBy(xpath = "//button[@id='7']")
    public WebElement button8;
    @FindBy(xpath = "//button[@id='8']")
    public WebElement button9;
    @FindBy(xpath = "//button[@id='9']")
    public WebElement button10;
    @FindBy(xpath = "//i[@class='fa fa-file fa-3x facbox']")
    public WebElement Yenile;

    @FindBy(xpath = "//span[text()='LeakMap']")
    public WebElement Leakmap;
    @FindBy(xpath = "//*[text()='Data Leak Fields']")
    public WebElement DataLeakFields;
    @FindBy(xpath = "//div[@class='card-body p-0']")
    public WebElement DataResim;
    @FindBy(xpath = "//div[@class='scrolltop']")
    public WebElement LeakmapTop;
    @FindBy(xpath = "//*[@href='/search/quick']")
    public WebElement Leaksearch;
    @FindBy(xpath = "//input[@placeholder='Search our billions of records...']")
    public WebElement SearchLeak;
    @FindBy(xpath = "//*[@class='btn btn-block btn-icon-white btn-light btn-text-white btn-lg spinner spinner-white']")
    public WebElement SearchButtonu;
    @FindBy(xpath = "//ul[@class='pagination']")
    public WebElement Quickpage;
    @FindBy(xpath = "//tbody//tr[3]//td[6]")
    public WebElement Shw1 ;
    @FindBy(xpath = "//tbody//tr[1]//td[6]")
    public WebElement Smartactive1 ;
    @FindBy(xpath = "(//tbody//tr[1]//td[5])[2]")
    public WebElement Honeypootactive1 ;
    @FindBy(xpath = "(//tbody//tr[2]//td[5])[2]")
    public WebElement Honeypootactive2 ;
    @FindBy(xpath = "(//tbody//tr[3]//td[5])[2]")
    public WebElement Honeypootactive3 ;
    @FindBy(xpath = "(//tbody//tr[1]//td[6])[2]")
    public WebElement Honeypootrunning1 ;
    @FindBy(xpath = "(//tbody//tr[2]//td[6])[2]")
    public WebElement Honeypootrunning2 ;
    @FindBy(xpath = "(//tbody//tr[3]//td[6])[2]")
    public WebElement Honeypootrunning3 ;
    @FindBy(xpath = "//tbody//tr[2]//td[6]")
    public WebElement Smartactive2 ;
    @FindBy(xpath = "//tbody//tr[3]//td[6]")
    public WebElement Smartactive3 ;
    @FindBy(xpath = "//tbody//tr[4]//td[6]")
    public WebElement Smartactive4 ;
    @FindBy(xpath = "//tbody//tr[5]//td[6]")
    public WebElement Smartactive5 ;
    @FindBy(xpath = "//tbody//tr[6]//td[6]")
    public WebElement Smartactive6 ;
    @FindBy(xpath = "//tbody//tr[7]//td[6]")
    public WebElement Smartactive7 ;
    @FindBy(xpath = "//tbody//tr[1]//td[7]")
    public WebElement Smartrunning1 ;
    @FindBy(xpath = "//tbody//tr[2]//td[7]")
    public WebElement Smartrunning2 ;
    @FindBy(xpath = "//tbody//tr[3]//td[7]")
    public WebElement Smartrunning3 ;
    @FindBy(xpath = "//tbody//tr[4]//td[7]")
    public WebElement Smartrunning4 ;
    @FindBy(xpath = "//tbody//tr[5]//td[7]")
    public WebElement Smartrunning5 ;
    @FindBy(xpath = "//tbody//tr[6]//td[7]")
    public WebElement Smartrunning6 ;
    @FindBy(xpath = "//tbody//tr[7]//td[7]")
    public WebElement Smartrunning7 ;
    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement Smartbutton ;
    @FindBy(xpath = "(//*[@class='m-menu__link-icon'])[3]")
    public WebElement DeceptionOperations;
    @FindBy(xpath = "//*[text()='Honeypot Definition ']")
    public WebElement HoneypotDefinition;

    @FindBy(xpath = "//*[@class='btn m-btn--pill btn-outline-success btn-sm m--margin-right-3']")
    public WebElement Refresh;
    @FindBy(xpath = "(//*[@class='btn m-btn--pill btn-outline-success btn-sm m--margin-right-3'])[2]")
    public WebElement Refresh2;
    @FindBy(xpath = "(//li[@class='nav-item m-tabs__item'])[3]")
    public WebElement http;
    @FindBy(xpath = "(//li[@class='nav-item m-tabs__item'])[4]")
    public WebElement s7comn;
    @FindBy(xpath = "(//li[@class='nav-item m-tabs__item'])[5]")
    public WebElement bacnet;
    @FindBy(xpath = "(//li[@class='nav-item m-tabs__item'])[6]")
    public WebElement enip;
    @FindBy(xpath = "(//li[@class='nav-item m-tabs__item'])[7]")
    public WebElement snmp;
    @FindBy(xpath = "(//li[@class='nav-item m-tabs__item'])[8]")
    public WebElement modbus;
    @FindBy(xpath = "(//li[@class='nav-item m-tabs__item'])[9]")
    public WebElement http_iis;
    @FindBy(xpath = "(//li[@class='nav-item m-tabs__item'])[10]")
    public WebElement exchange;
    @FindBy(xpath = "(//li[@class='nav-item m-tabs__item'])[11]")
    public WebElement rdp;
    @FindBy(xpath = "(//li[@class='nav-item m-tabs__item'])[12]")
    public WebElement ftp;
    @FindBy(xpath = "(//li[@class='nav-item m-tabs__item'])[13]")
    public WebElement sql_server;
    @FindBy(xpath = "(//li[@class='nav-item m-tabs__item'])[14]")
    public WebElement adb;
    @FindBy(xpath = "(//li[@class='nav-item m-tabs__item'])[15]")
    public WebElement mysql;
    @FindBy(xpath = "//tbody//tr[1]//td[4]")
    public WebElement admin;
    @FindBy(xpath = "//*[@class='btn m-btn--pill btn-outline-success btn-sm m--margin-right-3']")
    public WebElement createtemplate;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-outline-success']")
    public WebElement exit;



}
