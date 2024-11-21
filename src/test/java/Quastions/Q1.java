package Quastions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {

    // 1. Tarayıcıyı başlat
// 2. 'http://automationexercise.com' adresine git
// 3. Ana sayfanın başarıyla görünür olduğunu doğrula
// 4. 'Üye Ol / Giriş Yap' butonuna tıkla.
// 5. 'Hesabınıza giriş yapın'ın görünür olduğunu doğrula
// 6. Yanlış e-posta adresi ve şifre gir
// 7. 'Giriş' butonuna tıkla
// 8. 'E-posta adresiniz veya şifreniz yanlış!' hatasının görünür olduğunu doğrula


    WebDriver driver;

    @Test
public void test() {

    WebDriverManager.chromedriver();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    // 1.Launch browser
    // 2.Navigate to url 'http://automationexercise.com'
    driver.get("http://automationexercise.com");

    // 3. Verify that home page is visible successfully
        WebElement homPagedispley=driver.findElement(By.xpath("//a[@style='color: orange;']"));
        homPagedispley.isDisplayed();
    // 4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
    // 5. Verify 'Login to your account' is visible
    // 6. Enter incorrect email address and password
    // 7. Click 'login' button
    // 8. Verify error 'Your email or password is incorrect!' is visible
   }
}
