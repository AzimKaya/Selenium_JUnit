package day11_wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C01_ExplitsliWait {


@Test
public void implicitliWaitTesti(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



        //1. Bir class olusturun : WaitTest
        // 2. Iki tane metod olusturun : implicitWait() , explicitWait()
        //Iki metod icin de asagidaki adimlari test edin.
        // 3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        // 4. Remove butonuna basin.
        // 5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
        //6. Add buttonuna basin
        //7. It’s back mesajinin gorundugunu test edin






     }
     @Test
     public void expilicitliWaitTesti(){

         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


         WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));





     }




}
