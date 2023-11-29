package day09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

public class C03_Action extends TestBase {
    @Test
    public void SagClickTesti(){


        //1- https://testotomasyonu.com/click sitesine gidin
        driver.get("https://testotomasyonu.com/click");
        ResubleMetods.bekle(1);
        Actions actions=new Actions(driver);
        WebElement dgiDroneElementi= driver.findElement(By.id("pic2_thumb"));
        ResubleMetods.bekle(1);
        //2- “DGI Drones” uzerinde sag click yapin
        actions.contextClick(dgiDroneElementi).perform();
        String expectedAlertYazisi="Tebrikler!... Sağ click yaptınız.";
        ResubleMetods.bekle(1);
        //3- Alert’te cikan yazinin “Tebrikler!... Sağ click yaptınız.” oldugunu test edin.
        String actualAlertYazisi=driver.switchTo().alert().getText();
        Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);
        ResubleMetods.bekle(1);
        //4- Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();
        ResubleMetods.bekle(1);

    }
}
