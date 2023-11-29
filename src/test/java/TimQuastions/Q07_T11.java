package TimQuastions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

public class Q07_T11 extends TestBase {
    @Test
    public void test11(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully

        WebElement homaPage=driver.findElement(By.xpath("(//div[@class='col-sm-6'])[3]"));
        homaPage.isDisplayed();

        //4. Click 'Cart' button
        driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[1]")).click();



        //5. Scroll down to footer
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.DOWN).perform();


        //6. Verify text 'SUBSCRIPTION'
        driver.findElement(By.tagName("h2"));
        //7. Enter email address in input and click arrow button
        driver.findElement(By.id("susbscribe_email")).sendKeys("azimkaya777@gmail.com"+Keys.ENTER);
        //8. Verify success message 'You have been successfully subscribed!' is visible
          WebElement sonucYazisi= driver.findElement(By.xpath("//div[@class='alert-success alert']"));
        String expectedSonucYazisi="You have been successfully subscribed!";
        String actualSonucYazisi=sonucYazisi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));
        System.out.println(sonucYazisi.getText());

        ResubleMetods.bekle(5);





    }
}
