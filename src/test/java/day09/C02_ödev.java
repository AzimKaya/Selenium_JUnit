package day09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

import java.util.Set;

public class C02_ödev extends TestBase {
    @Test
    public void test01(){

        //icinde oldugumuz sayfa ve driveri input olarak alip
        //ikinci sayfa window handle degerini bize döndüren
        // bir method kullanalim

        //● https://testotomasyonu.com/addremove/ adresine gidin.
        driver.get("https://testotomasyonu.com/addremove/");
        String ilkSayfaBWHD=driver.getWindowHandle();
        System.out.println(driver.getWindowHandle());

        //● Sayfadaki textin "Add/Remove Elements" olduğunu doğrulayın.
        WebElement yaziElementi= driver.findElement(By.tagName("h2"));
        String expectedYazi="Add/Remove Elements";
        String actualYazi=yaziElementi.getText();
        Assert.assertEquals(expectedYazi,actualYazi);

        //● Sayfa başlığının(title) "Test Otomasyonu" olduğunu doğrulayın.
        String expectedTitle="Test Otomasyonu";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        //● 'Please click for Electronics Products' linkine tiklayin.
        driver.findElement(By.linkText("Electronics Products")).click();
        ResubleMetods.bekle(2);

       String ikinciWHD=ResubleMetods.ilkSayfaWhdİleİkinciSayfaWhdBul(driver,ilkSayfaBWHD);
       driver.switchTo().window(ikinciWHD);

        WebElement sonucYaziElementi= driver.findElement(By.className("product-count-text"));

        //● Bulunan urun sayisinin 16 olduğunu test edin
        String sonucSayisiStr=sonucYaziElementi.getText().replaceAll("\\D","");//16
        int actualSonucSayisi=Integer.parseInt(sonucSayisiStr);
        int expectedSonucSayisi=16;
        Assert.assertEquals(expectedSonucSayisi,actualSonucSayisi);

        //● Ilk actiginiz addremove sayfasina donun

        driver.switchTo().window(ilkSayfaBWHD);
        //● Url’in addremove icerdigini test edin

        String expectedUrlİcerik="addremove";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlİcerik));

           /*
           Driver bir webelemente click yapildiginda
           ayni sayfada acilacagini varsayar

          */

        String ilkSayfaWHD=driver.getWindowHandle();
        Set<String> wHdSeti=driver.getWindowHandles();
        String ikinciSayfaWhd="";
        System.out.println(ikinciSayfaWhd);
        System.out.println(wHdSeti);



    }

}
