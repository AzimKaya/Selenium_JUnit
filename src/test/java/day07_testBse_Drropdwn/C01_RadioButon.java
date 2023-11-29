package day07_testBse_Drropdwn;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_RadioButon {

     WebDriver driver;
     @Before
   public void setup(){
       WebDriverManager.chromedriver().setup();
       driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


   }
   @After
public void terdown(){
       driver.quit();


}
@Test
public void radioButonKutuTesti() throws InterruptedException {
       //   Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
       //   a. Verilen web sayfasına gidin.
       //   https://testotomasyonu.com/form
       driver.get("https://testotomasyonu.com/form");
       //   b. Cinsiyet Radio button elementlerini locate edin ve size uygun olani secin
    WebElement kadinRadioButton=driver.findElement(By.id("inlineRadio1"));
    WebElement erkekRadioButton=driver.findElement(By.id("inlineRadio2"));
    WebElement digerRadioButton=driver.findElement(By.id("inlineRadio3"));

    erkekRadioButton.click();
    digerRadioButton.sendKeys(Keys.PAGE_DOWN);
    //   c. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin
    Assert.assertTrue(erkekRadioButton.isSelected());
    Assert.assertFalse(kadinRadioButton.isSelected());
    Assert.assertFalse(digerRadioButton.isSelected());



    Thread.sleep(2000);
       //   radio butonunu işaretleyerek secin

    }
    @Test
    public void radioButonYaziTesti() throws InterruptedException {
        //   Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
        //   a. Verilen web sayfasına gidin.
        //   https://testotomasyonu.com/form
        driver.get("https://testotomasyonu.com/form");

        //   b. Cinsiyet Radio button elementlerini locate edin ve size uygun olani secin

        //secimi yazi ile yapabilirim
        //ama assortion'lar icin radio buttonlara ihtiyacımız var.
       WebElement erkekRadioButtonYaziElementi=driver.findElement(By.xpath("//*[@for=‘inlineRadio1’]"));
       erkekRadioButtonYaziElementi.sendKeys("");
       erkekRadioButtonYaziElementi.click();
        WebElement kadinRadioButton=driver.findElement(By.id("inlineRadio1"));
        WebElement erkekRadioButton=driver.findElement(By.id("inlineRadio2"));
        WebElement digerRadioButton=driver.findElement(By.id("inlineRadio3"));



        Thread.sleep(2000);

        //   c. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin



    }
}
