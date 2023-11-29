package day07_testBse_Drropdwn;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilitlies.TestBase;

public class C02_TestBaseİlkTest extends TestBase {

    @Test
    public void aramaTesti() throws InterruptedException {

        //test otomasyonu ana sayfaya gidin

        driver.get("https://testotomasyonu.com");
        // phone icin arama yapin

        WebElement aramaKutusu=driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone"+ Keys.ENTER);

        //arama sonucunda urun bulunabildigini test edin
        WebElement aramasonucElementi=driver.findElement(By.className("product-count-text"));

        String aramaSonucSayisiStr=aramasonucElementi.getText().replaceAll("\\D","");
        int aramasonucSayisi=Integer.parseInt(aramaSonucSayisiStr);
        Assert.assertTrue(aramasonucSayisi>0);

        Thread.sleep(2000);


    }
}
