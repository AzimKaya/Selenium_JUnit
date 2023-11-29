package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilitlies.ResubleMetods;

import java.time.Duration;

public class C02_AramaTesti {
    public static void main(String[] args) throws InterruptedException {

        //1- testotomasyonu.com anasayfasina gidelim
        //2- arama kutusunu locate edelim
        //3- “phone” ile arama yapalim
        //4- Bulunan sonuc sayisini yazdiralim
        //5- Ilk urunu tiklayalim
        //6- Urunun stokta var oldugunu test edin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- testotomasyonu.com anasayfasina gidelim
        driver.get("https://www.testotomasyonu.com");
        //2- arama kutusunu locate edelim
       WebElement aramaKutusu= driver.findElement(By.xpath("//input[@id='global-search']"));
        //3- “phone” ile arama yapalim
       aramaKutusu.sendKeys("phone"+ Keys.ENTER);
        //4- Bulunan sonuc sayisini yazdiralim
        WebElement sonucYazıElementi=driver.findElement(By.className("product-count-text"));
        System.out.println(sonucYazıElementi.getText());
        //5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//div[@class='product-box my-2  py-1'])[1]"))
                .click();
        //6- Urunun stokta var oldugunu test edin
        WebElement stokElementi=driver.findElement(By.xpath("(//span[@class='heading-xs '])[1]"));

        String expectedStokDurumu="Availibility: In Stock";
        String actualStokDurumu=stokElementi.getText();

        if (expectedStokDurumu.equals(actualStokDurumu)){
            System.out.println("Urun stok testi PASSED");
        }else {
            System.out.println("Urun stok testi FAİLED");
        }
        ResubleMetods.bekle(3);
        driver.quit();







    }
}
