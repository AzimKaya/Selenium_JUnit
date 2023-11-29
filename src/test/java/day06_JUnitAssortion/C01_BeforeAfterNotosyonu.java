package day06_JUnitAssortion;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.AssertionFailedError;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilitlies.ResubleMetods;

import java.time.Duration;

public class C01_BeforeAfterNotosyonu {
    // 3 farkli test method'u olusturarak
    // asagidaki testleri yapin
    // 1- test otomasyonu.com sitesine gidin
    // 2- phone, shoes ve dress icin arama yapin
    // 3- arama sonucunda urun bulunabildigini test edin
    // 4- sayfayi kapatin

    WebDriver driver;
@Before
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void teadown(){
        driver.quit();
    }
 @Test
    public void phoneTesti(){

        // 1- test otomasyonu.com sitesine gidin
        driver.get("https://www.testotomasyonu.com");
        // 2- phone,icin arama yapin
        WebElement aramaKutusu=driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone"+ Keys.ENTER);
        // 3- arama sonucunda urun bulunabildigini test edin
        WebElement aramaSonucElementi=driver.findElement(By.className("product-count-text"));
        String aramaSonusSayisiStr=aramaSonucElementi.getText().replaceAll("\\D","");
        int aramaSonucSayisi=Integer.parseInt(aramaSonusSayisiStr);

        if (aramaSonucSayisi>0){
            System.out.println("phone testi PASSED");
        }else {
            System.out.println("phone testi FAİLED");
            throw  new AssertionFailedError();

        }

    }
    @Test
    public void shesTesti(){

        // 1- test otomasyonu.com sitesine gidin
        driver.get("https://www.testotomasyonu.com");
        // 2- shoes,icin arama yapin
        WebElement aramaKutusu=driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("shoes"+ Keys.ENTER);
        // 3- arama sonucunda urun bulunabildigini test edin
        WebElement aramaSonucElementi=driver.findElement(By.className("product-count-text"));
        String aramaSonusSayisiStr=aramaSonucElementi.getText().replaceAll("\\D","");
        int aramaSonucSayisi=Integer.parseInt(aramaSonusSayisiStr);

        if (aramaSonucSayisi>0){
            System.out.println("shoes testi PASSED");
        }else {
            System.out.println("shoes testi FAİLED");
            throw  new AssertionFailedError();

        }


    }



    @Test
    public  void dressTesti(){

        // 1- test otomasyonu.com sitesine gidin
        driver.get("https://www.testotomasyonu.com");

        // 2- dress,icin arama yapin
        WebElement aramaKutusu=driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("dress"+ Keys.ENTER);

        // 3- arama sonucunda urun bulunabildigini test edin
        WebElement aramaSonucElementi=driver.findElement(By.className("product-count-text"));
        String aramaSonusSayisiStr=aramaSonucElementi.getText().replaceAll("\\D","");
        int aramaSonucSayisi=Integer.parseInt(aramaSonusSayisiStr);

        if (aramaSonucSayisi>0){
            System.out.println("dress testi PASSED");
        }else {
            System.out.println("dress testi FAİLED");
            throw  new AssertionFailedError();

        }

        ResubleMetods.bekle(2);
        driver.quit();



    }


}
