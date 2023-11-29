package TimQuastions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

public class Q07_T11Benzeri extends TestBase {

    @Test
    public void test11() {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully


        WebElement homaPage = driver.findElement(By.xpath("(//div[@class='col-sm-6'])[3]"));
        homaPage.isDisplayed();

        //4. Click 'Cart' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        email.sendKeys("azimkaya777@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("5057906735");
        WebElement loginClic = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        loginClic.click();


        //5. Scroll down to footer
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)

                .sendKeys(Keys.PAGE_DOWN).perform();
        ResubleMetods.bekle(10);
        //6. Verify text 'SUBSCRIPTION'
        //7. Enter email address in input and click arrow button
        //8. Verify success message 'You have been successfully subscribed!' is visible
    }

}
