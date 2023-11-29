package day06_JUnitAssortion;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C04_Asortions {

// https://www.bestbuy.com/ Adresine gidin
// farkli test method’lari olusturarak asagidaki testleri yapin
            //○ Sayfa URL’inin https://www.bestbuy.com/ ’a esit oldugunu test edin
            //○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
            //○ logoTest => BestBuy logosunun görüntülendigini test edin
            //○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin


    static WebDriver driver;
    @BeforeClass
    public static void setup(){

    }




    @Test
    public void title(){
        //○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin

        String unexpectedIcerik="Rest";
        String actuelTitle=driver.getTitle();


    }

    public void logoTesti(){
        //○ logoTest => BestBuy logosunun görüntülendigini test edin
        WebElement logoElementi=driver.findElement(By.xpath("(//img[@class=‘logo’])[1]"));


    }



}
