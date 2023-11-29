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

public class Q3_T6 {

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Contact Us' button
    //5. Verify 'GET IN TOUCH' is visible
    //6. Enter name, email, subject and message
    //7. Upload file
    //8. Click 'Submit' button
    //9. Click OK button
    //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
    //11. Click 'Home' button and verify that landed to home page successfully

 static WebDriver driver;
    @BeforeClass
    public static void setup(){

        // 1.Launch browser
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2.Navigate to url 'http://automationexercise.com/'
        driver.get("http://automationexercise.com");

    }
    @AfterClass
    public static void teardown(){
        //driver.quit();


    }
    @Test
    public void test1(){
        //Url testi


        //3. Verify that home page is visible successfully
        WebElement homaPagedisplay=driver.findElement(By.xpath("//div[@class='logo pull-left']"));
        homaPagedisplay.isDisplayed();
        Assert.assertTrue(homaPagedisplay.isDisplayed());

        //4. Click on 'Contact Us' button
        WebElement contactButton=driver.findElement(By.xpath("//i[@class='fa fa-envelope']"));
        contactButton.click();

        //5. Verify 'GET IN TOUCH' is visible
        WebElement getİnTouchdisplay=driver.findElement(By.xpath("//h2[@class='title text-center']"));
        getİnTouchdisplay.isDisplayed();
        Assert.assertTrue(getİnTouchdisplay.isDisplayed());


    }

    @Test
    public void test2() throws InterruptedException {

        //6. Enter name, email, and message
        WebElement name= driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
        name.sendKeys("Azim");
        WebElement email=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        email.sendKeys("azimkaya777@gmail.com");
        WebElement subject = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
        subject.sendKeys("subject ");
        WebElement mesage = driver.findElement(By.xpath("//textarea[@name='message']"));
        mesage.sendKeys("Merhaba");

        //8. Click 'Submit' button
        driver.findElement(By.xpath("//input[@type='submit']")).submit();
        Thread.sleep(10000);



    }
    @Test
    public void test3(){
        //9. Click OK button

        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
        //11. Click 'Home' button and verify that landed to home page successfully


    }


}
