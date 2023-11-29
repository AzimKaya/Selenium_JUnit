package TimQuastions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

public class Q08_T12 extends TestBase {

    @Test
    public void test12(){


        driver.get("http://automationexercise.com");



        //1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homaPage=driver.findElement(By.xpath("(//div[@class='col-sm-6'])[3]"));
        homaPage.isDisplayed();
        //4. Click 'Products' button
        driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN).perform();

        //5. Hover over first product and click 'Add to cart'
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();
        //6. Click 'Continue Shopping' button
        driver.findElement(By.xpath("(//button[@class='btn btn-success close-modal btn-block'])[1]")).click();
        //7. Hover over second product and click 'Add to cart'
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[3]")).click();

        ResubleMetods.bekle(10);
        //8. Click 'View Cart' button

        //9. Verify both products are added to Cart
        //10. Verify their prices, quantity and total price






    }
}
