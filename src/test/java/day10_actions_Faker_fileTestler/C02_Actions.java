package day10_actions_Faker_fileTestler;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

public class C02_Actions extends TestBase {
    @Test
    public void iframetesti(){

        //2- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");
        //3- video’yu gorecek kadar asagi inin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN)
        .sendKeys(Keys.PAGE_DOWN)
                .perform();


        //4- videoyu izlemek icin Play tusuna basin
        //5- videoyu calistirdiginizi test edin

        WebElement iframeElementi= driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        ResubleMetods.bekle(5);
        driver.switchTo().frame(iframeElementi);

       driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();






    }


}
