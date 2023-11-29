package day08_IFreme_CokluWindovs;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

import java.util.Set;

public class C06_kontrolsuzCokluWindowKullanımı extends TestBase {
@Test
    public void rest1(){



         //● https://testotomasyonu.com/addremove/ adresine gidin.
         driver.get("https://testotomasyonu.com/addremove/");
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
           /*
           Driver bir webelemente click yapildiginda
           ayni sayfada acilacagini varsayar

          */
            String ilkSayfaWHD=driver.getWindowHandle();
            Set<String>wHdSeti=driver.getWindowHandles();
            String ikinciSayfaWhd="";
            System.out.println(ikinciSayfaWhd);
            System.out.println(wHdSeti);


            for (String each:wHdSeti
             ) {

            if (!each.equals(ilkSayfaWHD)){
            ikinciSayfaWhd=each;

             }
            }

           driver.switchTo().window(ikinciSayfaWhd);


           //● Electronics sayfasinin acildigini test edin
           String epectedTitleİcerik="Electronics";
           String actualeTitle=driver.getTitle();
           Assert.assertTrue(actualeTitle.contains(epectedTitleİcerik));


           //● Bulunan urun sayisinin 16 olduğunu test edin
           WebElement sonucYaziElementi= driver.findElement(By.className("product-count-text"));
          String sonucSayisiStr=sonucYaziElementi.getText().replaceAll("\\D","");//16

          int actuelSonucSayisi=Integer.parseInt(sonucSayisiStr);
          int expectedUrunSayisi=16;
          Assert.assertEquals(expectedUrunSayisi,actuelSonucSayisi);


         //● Ilk actiginiz addremove sayfasina donun
         driver.switchTo().window(ilkSayfaWHD);


         //● Url'in addremove icerdigini test edin

         String expectedUrlİcerik="addremove";
         String actualUrl=driver.getCurrentUrl();
         Assert.assertTrue(actualUrl.contains(expectedUrlİcerik));
         ResubleMetods.bekle(5);
        driver.quit();


    }




}
