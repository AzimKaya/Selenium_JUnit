package day06_JUnitAssortion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_CheckBox {
    //a. Verilen web sayfasına gidin.
    //    https://testotomasyonu.com/form
    // b. Sirt Agrisi ve Carpinti checkbox’larini secin
    // c. Sirt Agrisi ve Carpinti checkbox’larininin seçili olduğunu test edin
    // d. Seker ve Epilepsi checkbox’larininin seçili olmadigini test edin
    WebDriver driver;
    @Before
    public void setep(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    }

    @After
    public void teardown(){

        driver.quit();
    }


    @Test
    public void phoneTesti(){



    }
    @Test
    public void shoesTesti(){


    }
    @Test
    public void dressTesti(){


    }






}
