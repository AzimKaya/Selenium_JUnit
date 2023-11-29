package day07_testBse_Drropdwn;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitlies.TestBase;

public class JsAlert extends TestBase {
    //3 test method’u olusturup asagidaki gorevi tamamlayin
    //1. Test
    // https://testotomasyonu.com/javascriptAlert adresine gidin
    // 1.alert’e tiklayin
    // Alert’deki yazinin “I am a JS Alert” oldugunu test edin
    //OK tusuna basip alert’i kapatin
    //2.Test
    //https://testotomasyonu.com/javascriptAlert adresine gidin
    // 2.alert’e tiklayalim
    // Cancel’a basip, cikan sonuc yazisinin “You clicked: Cancel” oldugunu test edin
    //3.Test
    //https://testotomasyonu.com/javascriptAlert adresine gidin
    //3.alert’e tiklayalim
    //Cikan prompt ekranina “Abdullah” yazdiralim
    //OK tusuna basarak alert’i kapatalim
    //Cikan sonuc yazisinin Abdullah icerdigini test edelim.
@Test
    public void jsBasicAlert01() throws InterruptedException {

        //1. Test
        // https://testotomasyonu.com/javascriptAlert adresine gidin
        driver.get("https://testotomasyonu.com/javascriptAlert");
        // 1.alert’e tiklayin
    driver.findElement(By.xpath("//*[@onclick='jsAlert()'] ")).click();

    // Alert’deki yazinin “I am a JS Alert” oldugunu test edin
    String expectedAlertYazisi="I am a JS Alert";
    String actualAlertYazisi=driver.switchTo().alert().getText();
    Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);



    driver.switchTo().alert().accept();
    System.out.println(actualAlertYazisi);

}
@Test
public void jsComfirimAlert02(){


    //2.Test
    //https://testotomasyonu.com/javascriptAlert adresine gidin


    driver.get("https://testotomasyonu.com/javascriptAlert");
    // 2.alert’e tiklayalim
    driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();
    // Cancel’a basip, cikan sonuc yazisinin “You clicked: Cancel” oldugunu test edin
    driver.switchTo().alert().dismiss();
    WebElement resultYaziElementi= driver.findElement(By.xpath("//p[@id='result']"));

    String expectedYaziElementi="You clicked: Ok";
    String actuelYaziElementi=resultYaziElementi.getText();
    System.out.println(actuelYaziElementi);


}
@Test
public void jsPromptTesti03() throws InterruptedException {

    //3.Test
    //https://testotomasyonu.com/javascriptAlert adresine gidin

    driver.get("https://testotomasyonu.com/javascriptAlert");
    //3.alert’e tiklayalim
    driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();
    //Cikan prompt ekranina “Abdullah” yazdiralim
     driver.switchTo().alert().sendKeys("Abdullah");
    //OK tusuna basarak alert’i kapatalim

     driver.switchTo().alert().accept();
    //Cikan sonuc yazisinin Abdullah icerdigini test edelim

    WebElement resultYazi=driver.findElement(By.xpath("//p[@id='result']"));


    String expectedResultİcerik="Abdullah";

    String actuelResultYazisi=resultYazi.getText();

    Assert.assertTrue(actuelResultYazisi.contains(expectedResultİcerik));

    System.out.println(resultYazi.getText());

    Thread.sleep(3000);
}

}

