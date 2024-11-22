package Practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P3 {
     /*
BeforeClass ile driver'i oluşturun ve class icinde static yapin.
Maximize edin ve 10 sn bekletin
http://www.babayigit.net/testdocs adresine gidin
1-arama kutusuna "12 Angry Men" yaz ip, cikan sonuc şayisini yazdinin
2-arama kutusuna "Vizontele" yaz ip, cikan sonuc şayisini yazdirin
3-arama kutusuna "Saving Private Ryan" yazip, cikan sonuc şayisini yazdirin
4-arama kutusuna "3 idiots" yaz ip, cikan sonuc şayisini yazdirin
AfterClass ile kapatin.
     */

    static WebDriver driver;
    WebElement searchBox;
    String filmName;
    @BeforeClass
    public static void setup(){

        WebDriverManager.chromedriver();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterClass
    public static void terdown(){
        driver.quit();
    }
    @Before
    public void bfore(){
        driver.get("http://www.babayigit.net/testdocs ");
        searchBox=driver.findElement(By.xpath("//input[@id='search']"));

    }

@After
    public void After(){

    System.out.println(filmName+"Sonuc Sayisi"+driver.findElement(By.xpath("//*[@id='result-stats']")).getText());
    System.out.println("Windov Hendler:"+driver.getWindowHandle());
}
@Test
public void test1(){
       filmName ="12 Angry Men";
        searchBox.sendKeys(filmName+"12 Angry Men"+ Keys.ENTER);


   }

    @Test
    public void test2(){
        filmName="Vizontele";
        searchBox.sendKeys("Vizontele"+ Keys.ENTER);


    }
    @Test
    public void test3(){
        filmName="Savin Private ";
        searchBox.sendKeys("Saving Private Ryan"+ Keys.ENTER);


    }
    @Test
    public void test4(){
        filmName="12 3 idiots";
        searchBox.sendKeys("3 idiots"+ Keys.ENTER);


    }

}
