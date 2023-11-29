package day11_wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ExpilicitWait {
    public void expilicitliWait(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // 3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        // 4. Textbox’in etkin olmadigini(enabled) dogrulayın

        // 5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        // 6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
        // 7. Textbox’in etkin oldugunu(enabled) dogrulayın.

    }
}
