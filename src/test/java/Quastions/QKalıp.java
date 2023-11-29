package Quastions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class QKalıp {


    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterClass
    public static void teardown(){
        driver.quit();


    }
    @Test
    public void test1(){
        //Url testi
        driver.get("http://automationexercise.com");

    }

    @Test
    public void test2(){
        //Arama testi


    }
    @Test
    public void test3(){
        //ilk ürün testi


    }



}
