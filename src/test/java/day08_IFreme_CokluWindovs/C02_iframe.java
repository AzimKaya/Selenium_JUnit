package day08_IFreme_CokluWindovs;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitlies.TestBase;

import java.util.List;

public class C02_iframe extends TestBase {

@Test
    public void test01(){

        //1)http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        //2)Cookies kabul edin
        //3) sayfadaki iframe sayısını bulunuz.
        List<WebElement>iFrameList=driver.findElements(By.tagName("iframe"));
        System.out.println("Sayfadaki iframe sayisi:"+iFrameList.size());

        //4) ilk iframe’deki (Youtube) play butonuna tıklayınız.
        WebElement playİframe= driver.findElement(By.xpath("//iframe[4]"));
        driver.switchTo().frame(playİframe);


        //5) ilk iframe’den çıkıp ana sayfaya dönünüz

        // WebElement playTusu= driver.findElement(By.xpath("//button[@title='play']"));
         //playTusu.click();


         driver.switchTo().defaultContent();









    }


}
