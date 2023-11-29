package day11_wait;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitlies.TestBase;

public class C04_WebTales extends TestBase {
@Test
    public void webTabletesti(){

        // Testotomasyonu anasayfaya gidin
       driver.get("https://www.testotomasyonu.com/webtables");
       WebElement veri =  driver.findElement(By.xpath("//table/tbody"));






    }
}
