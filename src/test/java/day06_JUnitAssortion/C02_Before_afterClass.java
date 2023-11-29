package day06_JUnitAssortion;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.AssertionFailedError;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Before_afterClass {



// 3 farkli test methodu olusturarak
// asagida verilen gorevi tamamlayin
// 1- testotomasyonu.com sayfasina gidin,
//    url'in testotomasyonu icerdigini test edin
// 2- phone icin arama yaptirin
//    ve arama sonucunda urun bulunabildigini test edin
// 3- ilk urune tiklayin
//    ve urun aciklamasinda case sensitive olmadan phone gectigini test edin


    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("Bfor calıstı");

    }

    @AfterClass
    public static void teardown(){

        driver.quit();
        System.out.println("After calıstı");
    }
@Test
   public void test1(){
        //Url testi
       //1- testotomasyonu.com sayfasina gidin,
       //    url'in testotomasyonu icerdigini test edin
       driver.get("https://www.testotomasyonu.com");
       String expectedUrlIcerik="tesotomasyonu";
       String actuelUrl=driver.getCurrentUrl();
       if (actuelUrl.contains(expectedUrlIcerik)){
           System.out.println("Url testi PASSED ");
       }else {
           System.out.println("Url testi FAİLED ");
           throw new AssertionFailedError();

       }

}
@Test
    public void test2() {
    //Arama testi
    // 2- phone icin arama yaptirin
    //    ve arama sonucunda urun bulunabildigini test edin
    WebElement aramaKutusu = driver.findElement(By.id("global-search"));
    aramaKutusu.sendKeys("phone" + Keys.ENTER);

    WebElement aramaSonucElementi = driver.findElement(By.className("product-count-text"));
    String aramaSonucsayisistr = aramaSonucElementi.getText().replaceAll("\\D", "");
    int aramaSonucsayisi = Integer.parseInt(aramaSonucsayisistr);

    if (aramaSonucsayisi > 0) {
        System.out.println("Arama testi PASSED");
    } else {
        System.out.println("Arama testi PASSED");
        throw new AssertionFailedError();
    }
}
@Test
    public void test03(){
         //ilk ürün testi
         // 3- ilk urune tiklayin
         //    ve urun aciklamasinda case sensitive olmadan phone gectigini test edin
        WebElement urunacıklamaElementi= driver.findElement(By.xpath("(//*[@class=‘product-box my-2  py-1’])[1]"));
        String expectedUrunİcerik="phone";
        String urunAcıklama=urunacıklamaElementi.getText().toLowerCase();

        if (urunAcıklama.contains(expectedUrunİcerik)){
            System.out.println("İlk urun testi PASSED");
        }else {
            System.out.println("İlk urun testi FAİLED");
            throw new AssertionFailedError();

        }

    }

}
