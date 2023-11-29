package TimQuastions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


                //1. Launch browser
                // 2. Navigate to url 'http://automationexercise.com'
                //3. Verify that home page is visible successfully
                // 4. Click on 'Signup / Login' button
                //5. Verify 'Login to your account' is visible
                //6. Enter correct email address and password
                //7. Click 'login' button
               // 8. Verify that 'Logged in as username' is visible
               // 9. Click 'Logout' button
                //10. Verify that user is navigated to login page

public class Q2_T4 {

    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        //1. Launch browser
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

        // 2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homPagedispley=driver.findElement(By.xpath("//a[@style='color: orange;']"));
        System.out.println(homPagedispley.isDisplayed());
        Assert.assertTrue(homPagedispley.isDisplayed());

        // 4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        // 5. Verify 'Login to your account' is visible

        WebElement email=driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        email.sendKeys("azimkaya777@gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("5057906735");

        //7. Click 'login' button
        WebElement loginClic=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        loginClic.click();

        // 8. Verify that 'Logged in as username' is visible
        WebElement admindisplay=driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        admindisplay.isDisplayed();

        //10. Verify that user is navigated to login page
        Assert.assertTrue(admindisplay.isDisplayed());
        WebElement logout=driver.findElement(By.xpath("(//a[@style='color:brown;'])[1]"));
        logout.click();



    }

}
