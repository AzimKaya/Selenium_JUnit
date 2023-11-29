package day09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

public class C04_Actions extends TestBase {

    @Test
    public void sagKlickTesti(){

        //2- https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");

        //3- Cizili alan uzerinde sag click yapin
        Actions actions=new Actions(driver);
        WebElement cizgiliAlanElementi= driver.findElement(By.id("hot-spot"));
        actions.contextClick(cizgiliAlanElementi).perform();

        ResubleMetods.bekle(3);
        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
       String expectedAlertYazisi="You selected a context menu";
       String actualAlertYazisi=driver.switchTo().alert().getText();
        Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);
        ResubleMetods.bekle(3);

        //5- Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();
        ResubleMetods.bekle(3);

        //6- Elemental Selenium linkine tiklayalim
        driver.findElement(By.linkText("Elemental Selenium")).click();
        ResubleMetods.bekle(3);

        //7- Acilan sayfada h1 taginda “Make sure your code lands” yazdigini test edelim
        driver=ResubleMetods.titleİleSayfaDegistir(driver,"Elemental Selenium | Elemental Selenium");
        WebElement h1TagYaziElementi= driver.findElement(By.tagName("h1"));
        String expectedYazi="Make sure your code lands";
        String actualYazi=h1TagYaziElementi.getText();
        Assert.assertEquals(expectedYazi,actualYazi);


        ResubleMetods.bekle(5);


    }
}
