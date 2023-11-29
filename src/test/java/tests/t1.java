package tests;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

public class t1 extends TestBase {
@Test
    public void testler01(){

    driver.get("http://automationexercise.com");

WebElement contacusKutusu= driver.findElement(By.xpath("//i[@class='fa fa-envelope']"));
/*WebElement nameKutusu=driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));

    Actions actions=new Actions(driver);
    Faker faker=new Faker();
    actions.click(nameKutusu)
            .sendKeys(faker.name().firstName())
            .sendKeys(Keys.TAB)
            .sendKeys(faker.internet().emailAddress())
            .sendKeys(Keys.TAB)
            .sendKeys(faker.internet().avatar())
            .sendKeys(Keys.TAB)
            .sendKeys("Merhaba dünya").perform();
    ResubleMetods.bekle(10);



 */










}


}
