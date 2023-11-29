package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilitlies.ResubleMetods;

import java.time.Duration;

public class C04_GogleAramaTesti {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com");
       // 3- cookies uyarisini kabul ederek kapatin
        String expectedTitleİcerik="Google";
        String actuelTitle=driver.getTitle();
        // 4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        if (actuelTitle.contains(expectedTitleİcerik)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
        }

        //5- Arama cubuguna “Nutella” yazip aratin
        WebElement aramaKutusu=driver.findElement(By.id("APjFqb"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // 6- Bulunan sonuc sayisini yazdirin
        WebElement sonucElementi=driver.findElement(By.id("result-stats"));
        String sonucsayisiStr= sonucElementi.getText();
        System.out.println("Bulunan sonuc yazisi:"+sonucsayisiStr);

        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String[] sonucYazısıArr=sonucsayisiStr.split(" ");
        String sonucSayisiStr=sonucYazısıArr[1];//163.000.000

        sonucSayisiStr=sonucSayisiStr.replaceAll("\\D","");

        int sonucSayisiİnt=Integer.parseInt(sonucSayisiStr);

        if (sonucSayisiİnt>10000000){
            System.out.println("Arama sonuc sayisi testi PASSED");
        }else       System.out.println("Arama sonuc sayisi testi FAİLED");


        // 8- Sayfayi kapatin
        ResubleMetods.bekle(2);
        driver.quit();

    }
}
