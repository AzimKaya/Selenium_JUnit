package day08_IFreme_CokluWindovs;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitlies.TestBase;

public class C03_iframe extends TestBase {

    @Test
    public void test01(){

         // 1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get("https://the-internet.herokuapp.com/iframe");
         // 2 ) Bir metod olusturun: iframeTest
         //  - “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.

          /*
        Text box bir İfreme'in icinde
        ifreme'in icinde olan elementlere ulasabilmek icin
        once iframe'e gecis yapmalısınız
        ifreme gecis yapabilmek icin
        -once ifremi bir webelement olarak lokeyt edin
        -switchto() ile ifreme gecin

        iframe'e gecis yaparsaniz
        driver orada kalır
        yeniden ana sayfa ile ilgili bir islem yapmak isterseniz
        driveri yeniden anasayfaya gecirmelisiniz

        driver.switchTo().defaultContent();eger ice birden fazla iframe varsa
                                          bir usteki iframe geciş yapar
           driver.switchTo().parentFrame();direk ana sayfaya geciş yapar



         */



        WebElement anIframeYaziElementi= driver.findElement(By.tagName("h3"));

        Assert.assertTrue(anIframeYaziElementi.isEnabled());
        System.out.println(anIframeYaziElementi.getText());

        // - Text Box’a “Merhaba Dunya!” yazin.

        WebElement iFremeElementi = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iFremeElementi);

        WebElement texBoxKutusu= driver.findElement(By.tagName("p"));
        texBoxKutusu.clear();
        texBoxKutusu.sendKeys("Merhaba Dünya");

        //driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();

        WebElement elemenalSeleniumElementi= driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
        Assert.assertTrue(elemenalSeleniumElementi.isDisplayed());
        System.out.println(elemenalSeleniumElementi.getText());



         //  - TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu dogrulayin ve  konsolda yazdirin.






    }
}
