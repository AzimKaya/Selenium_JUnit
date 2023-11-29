package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitlies.TestBase;

public class C08_KullanıcıOlusterma extends TestBase {

@Test
    public  void kullanıcıOlusturmaTesti(){

    //1- https://www.testotomasyonu.com adresine gidelim
    driver.get("https://testotomasyonu.com");
    // 2- Account linkine tiklayin
    driver.findElement(By.xpath("(//span[text()='Account'])[1]"));
    //3- Sign Up linkine basalim
    driver.findElement(By.xpath("//*[text()='Sign Up']")).click();
    //4- Ad, soyad, mail ve sifre kutularina deger yazalim ve Sign Up butonuna basalim
   WebElement firstNameKutusu=driver.findElement(By.id("//*[@id='firstName']"));
    Actions actions=new Actions(driver);

    // 5- Kaydin olusturuldugunu test edin

    driver.findElement(By.id("btn-submit-form")).click();


    WebElement emailKutusu= driver.findElement(By.id("email"));
    WebElement paswordKutusu= driver.findElement(By.id("password"));



    }

}
