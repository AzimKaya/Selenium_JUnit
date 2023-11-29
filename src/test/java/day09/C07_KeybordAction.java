package day09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

public class C07_KeybordAction extends TestBase {

@Test
    public void test01(){


        //2- https://www.testotomasyonu.com sayfasina gidelim
        driver.get("https://testotomasyonu.com");
        //3- Arama kutusuna actions method’larini kullanarak “DELL Core I3” yazdirin ve Enter’a basarak arama yaptirin
    WebElement aramaKutusu= driver.findElement(By.id("global-search"));
    Actions actions=new Actions(driver);
    ResubleMetods.bekle(2);
    actions.click(aramaKutusu)
            .keyDown(Keys.SHIFT)
            .sendKeys("dell c")
            .keyUp(Keys.SHIFT)
            .sendKeys("ore ")
            .keyDown(Keys.SHIFT)
            .sendKeys("i")
            .keyUp(Keys.SHIFT)
            .sendKeys("3")
            .sendKeys(Keys.ENTER)
            .perform();
    ResubleMetods.bekle(5);



       //4- Bulunan urun isminde “DELL Core I3” bulundugunu test edin
    WebElement urunİsimElementi= driver.findElement(By.xpath("//*[@class=‘prod-title mb-3' ]"));
    String expecredİsimİcerigi="DELL Core I3";
    String actualUrunİcerigi=urunİsimElementi.getText();
    Assert.assertTrue(actualUrunİcerigi.contains(expecredİsimİcerigi));
    ResubleMetods.bekle(2);

    }
}
