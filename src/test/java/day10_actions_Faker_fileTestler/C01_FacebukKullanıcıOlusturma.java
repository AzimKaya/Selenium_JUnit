package day10_actions_Faker_fileTestler;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

public class C01_FacebukKullanıcıOlusturma extends TestBase {
  @Test
    public void facebukTest(){

      //1- https://www.facebook.com adresine gidelim
      driver.get("https://www.facebook.com");
      //2- Cookies kabul edin
      //3- Yeni hesap olustur butonuna basalim
      //4- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
      WebElement firstName= driver.findElement(By.xpath("//*[@*='open-registration-form-button']"));

    Actions actions=new Actions(driver);
    Faker faker=new Faker();
    String email=faker.internet().emailAddress();

    actions.click(firstName)

            .sendKeys(faker.name().firstName())
            .sendKeys(Keys.TAB)
            .sendKeys(faker.name().lastName())
            .sendKeys(Keys.TAB)
            .sendKeys(email)
            .sendKeys(Keys.TAB)
            .sendKeys(email)
            .sendKeys(Keys.TAB)
            .sendKeys(faker.internet().password())
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.TAB)
            .sendKeys("20")
            .sendKeys(Keys.TAB)
            .sendKeys("Mar")
            .sendKeys(Keys.TAB)
            .sendKeys("1990")
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.ARROW_RIGHT)
            .perform();

      ResubleMetods.bekle(10);



      //5- Kaydol tusuna basalim

    }

}
