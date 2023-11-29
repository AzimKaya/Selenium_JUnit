package TimQuastions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilitlies.TestBase;

import java.time.Duration;

public class Q9_T13  {

          // 1. Launch browser
          //2. Navigate to url 'http://automationexercise.com'
          //3. Verify that home page is visible successfully
          //4. Click 'View Product' for any product on home page
          //5. Verify product detail is opened
          //6. Increase quantity to 4
          //7. Click 'Add to cart' button
          //8. Click 'View Cart' button
          //9. Verify that product is displayed in cart page with exact quantity


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
