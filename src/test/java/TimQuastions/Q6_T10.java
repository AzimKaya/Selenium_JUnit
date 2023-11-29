package TimQuastions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitlies.TestBase_BforeClass;

public class Q6_T10 extends TestBase_BforeClass {
@Test
    public void test10(){

        //1. Launch browser
        //Tarayıcıyı başlatın
        //2. Navigate to url 'http://automationexercise.com'
        //'http://automationexercise.com' adresine gidin
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        //Ana sayfanın başarılı bir şekilde görüntülendiğini doğrulayın
        WebElement homaPage=driver.findElement(By.xpath("(//div[@class='col-sm-6'])[3]"));
        homaPage.isDisplayed();
        //4. Scroll down to footer
        //Altbilgiye kadar kaydırın
        WebElement footer = driver.findElement(By.tagName("footer"));
        footer.click();

        //5. Verify text 'SUBSCRIPTION'
        //'ABONELİK' metnini doğrulayın
          WebElement subsrictionsText= driver.findElement(By.xpath("//div[@class='single-widget']"));
          String expectedSubsrictionText="SUBSCRIPTION";
          String actualSubsrictionText=subsrictionsText.getText();
          System.out.println(actualSubsrictionText);


        //6. Enter email address in input and click arrow button
        //Girişe e-posta adresini girin ve ok işaretli düğmesine tıklayın
         WebElement input=driver.findElement(By.id("susbscribe_email"));
         input.sendKeys("azimkaya777@gmail.com");
         input.click();

        //7. Verify success message 'You have been successfully subscribed!' is visible
        //'Başarıyla abone oldunuz!' başarılı mesajının görülebilir olduğunu doğrulayın

    WebElement footer2 = driver.findElement(By.tagName("footer"));
    footer.click();









    }



}
