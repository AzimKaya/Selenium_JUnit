package TimQuastions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

  public  class Q1_T3 {
      // 1.Launch browser
      // 2.Navigate to url 'http://automationexercise.com/'
      // 3. Verify that home page is visible successfully
      // 4. Click on 'Signup / Login' button
      // 5. Verify 'Login to your account' is visible
      // 6. Enter incorrect email address and password
      // 7. Click 'login' button
      // 8. Verify error 'Your email or password is incorrect!' is visible

      // 1. Tarayıcıyı başlat
      // 2. 'http://automationexercise.com' adresine git
      // 3. Ana sayfanın başarıyla görünür olduğunu doğrula
      // 4. 'Üye Ol / Giriş Yap' butonuna tıkla
      // 5. 'Hesabınıza giriş yapın'ın görünür olduğunu doğrula
      // 6. Yanlış e-posta adresi ve şifre gir
      // 7. 'Giriş' butonuna tıkla
      // 8. 'E-posta adresiniz veya şifreniz yanlış!' hatasının görünür olduğunu doğrula

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
        driver.quit();

    }

@Test
    public void test1(){
    // 3. Verify that home page is visible successfully
    WebElement homPagedispley=driver.findElement(By.xpath("//a[@style='color: orange;']"));
    homPagedispley.isDisplayed();
    Assert.assertTrue(homPagedispley.isDisplayed());

    }

    @Test
    public void test2(){

        // 4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        // 5. Verify 'Login to your account' is visible
       WebElement email=driver.findElement(By.xpath("(//input[@type='email'])[1]"));
       email.sendKeys("azimkaya777@gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("5057906735");
        WebElement loginClic=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        loginClic.click();
        WebElement admindisplay=driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        admindisplay.isDisplayed();
        Assert.assertTrue(admindisplay.isDisplayed());
        WebElement logout=driver.findElement(By.xpath("(//a[@style='color:brown;'])[1]"));
        logout.click();
    }

@Test
    public void test3(){

    // 6. Yanlış e-posta adresi ve şifre gir
    WebElement email=driver.findElement(By.xpath("(//input[@type='email'])[1]"));
    email.sendKeys("azimkaya77@gmail.com");
    WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
    password.sendKeys("5057906736");

    // 7. 'Giriş' butonuna tıkla
    WebElement loginClic=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
    loginClic.click();


    // 8. 'E-posta adresiniz veya şifreniz yanlış!' hatasının görünür olduğunu doğrula
    WebElement verifyError=driver.findElement(By.xpath("//h2[@class='or']"));
    verifyError.isDisplayed();
    Assert.assertTrue(verifyError.isDisplayed());







    }


}
