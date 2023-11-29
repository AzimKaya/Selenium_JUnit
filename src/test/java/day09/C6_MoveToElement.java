package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

public class C6_MoveToElement extends TestBase {
@Test
    public void moveToElementTesti(){

         //1- https://www.testotomasyonu.com/ adresine gidin
         driver.get("https://testotomasyonu.com/");
         ResubleMetods.bekle(2);

         //2- “Kids Wear” menusunun acilmasi icin mouse’u bu menunun ustune getirin
         WebElement kidsWearElementi=driver.findElement(By.xpath("(//*[@class='has-sub'])[7]"));
         Actions actions=new Actions(driver);
         actions.moveToElement(kidsWearElementi).perform();
         ResubleMetods.bekle(2);

         //3- “Boys” linkine basin
         driver.findElement(By.id("(//ul[@class='submenu-link'])[2]"));

         //4- Acilan sayfadaki ilk urunu tiklayin
         driver.findElement(By.xpath("(//div[@class='product-box mb-2 pb-1'])[1]"));

         //4- Acilan sayfada urun isminin “Boys Shirt White Color” oldugunu test edin
         WebElement isimElementi=driver.findElement(By.xpath("/div[@class=' heading-sm mb-4']"));
         String expectedİsim="Boys Shirt White Color";
         String actualİsim=isimElementi.getText();


    }
}
