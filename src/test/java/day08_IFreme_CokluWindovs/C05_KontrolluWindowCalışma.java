package day08_IFreme_CokluWindovs;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import utilitlies.TestBase;

public class C05_KontrolluWindowCalışma extends TestBase {
    @Test
    public void kontrolluCokluWindowCalıstırma() throws InterruptedException {
        // Testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        // url'in testotomasyonu icerdigini test edin
        String expectedUrlİcerik="testotomasyonu";
        String actuelUrl=driver.getCurrentUrl();
        Assert.assertTrue(actuelUrl.contains(expectedUrlİcerik));
        String anaSayfaWHD=driver.getWindowHandle();

        // yeni bir tab olarak elctronics linkini acin
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.testotomasyonu.com");
        driver.findElement(By.xpath("(//li[@class='has-sub'])[1]")).click();
        String electonicsWHD=driver.getWindowHandle();

         // acilan sayfanin electronics sayfasi oldugunu test edin
         //Title'Da Electronics oldugunu testc edelim
         String epectedTitleİcerik="Electronics";
         String actualTitle=driver.getTitle();
         Assert.assertTrue(actualTitle.contains(epectedTitleİcerik));

         // yeni bir window'da acilacak sekilde menfashion linkini tiklayin
         driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.testotomasyonu.com");
         driver.findElement(By.xpath("(//a[text()='Men Fashion'])[3]")).click();
         String menFasionWHD=driver.getWindowHandle();
         // menfashion sayfasinin acildigini test edin
         epectedTitleİcerik="Men Fashion";
         actualTitle=driver.getTitle();
         Assert.assertTrue(actualTitle.contains(epectedTitleİcerik));

         // ilk actigimiz sayfaya donun
        driver.switchTo().window(anaSayfaWHD);
         //Eger Bir testte acilan windowlar farklı tab veya windowlarda aciliyorsa
         // ve testinizde bu sayfalar arasında gecis isteniyorsa
         // gectiginiz her sayfanin WindowHandle degerini kaydetmeliyiz

         // test otomasyon anasayfada oldugumuzu test edin
         // url ile test edlim https://www.testotomasyonu.com
         String epectedUrl="https://www.testotomasyonu.com";
         String actualUrl=driver.getCurrentUrl();
         Assert.assertTrue(actualUrl.contains(epectedUrl));


        Thread.sleep(2000);
    }

}
