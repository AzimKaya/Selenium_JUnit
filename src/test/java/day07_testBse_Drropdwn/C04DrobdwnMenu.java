package day07_testBse_Drropdwn;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilitlies.TestBase;

public class C04DrobdwnMenu extends TestBase {
    @Test
    public void drobdwnMenu(){
    // 1. http://zero.webappsecurity.com/ Adresine gidin
     driver.get("http://zero.webappsecurity.com");

     //2. Sign in butonuna basin
       driver.findElement(By.xpath("//i[@class='icon-signin']")).click();

     //3. Login kutusuna “username” yazin
        WebElement loginkutusu=driver.findElement(By.id("user_login"));
        loginkutusu.sendKeys("username");

     //4. Password kutusuna “password” yazin
       WebElement paswordKutusu= driver.findElement(By.id("user_password"));
       paswordKutusu.sendKeys("password");

     //5. Sign in tusuna basin, back tusuna basarak sayfaya donun
        driver.findElement(By.xpath("//*[@name='submit']")).click();

     //6. Online banking menusunden Pay Bills sayfasina gidin
        driver.navigate().back();
        driver.findElement(By.id("onlineBankingMenu")).click();
        driver.findElement(By.id("pay_bills_link")).click();

        //7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.linkText("Purchase Foreign Currency")).click();

     //8. “Currency” drop down menusunden Eurozone’u secin
        WebElement currencyDdm=driver.findElement(By.id("pc_currency"));

        Select selectCurrency=new Select(currencyDdm);
        selectCurrency.selectByValue("EUR");

     //9. “amount” kutusuna bir sayi girin
        driver.findElement(By.id("pc_amount")).sendKeys("100");

     //10. “US Dollars” in secilmedigini test edin
        String uneexpectedOptionYazısı="Us Dollars";
        String actuelOptionYazisi=selectCurrency.getFirstSelectedOption().getText();
        Assert.assertNotEquals(uneexpectedOptionYazısı,actuelOptionYazisi);
        // Radio button U.S Dollars'ın secilmedigini test edin

      WebElement usDollersradioButtonelementi=driver.findElement(By.id("pc_inDollars_true"));
      Assert.assertFalse(usDollersradioButtonelementi.isSelected());
     //11. “Selected currency” butonunu secin
        driver.findElement(By.id("pc_inDollars_false")).click();

     //12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
       driver.findElement(By.id("pc_calculate_costs")).click();
       driver.findElement(By.id("purchase_cash")).click();
     //13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin.
         WebElement uyariyazisiElementi=driver.findElement(By.id("alert_content"));

        String expectedUyariYaziElementi="Foreign currency cash was successfully purchased.";
        String actuelUyariYaziElementi=uyariyazisiElementi.getText();
        Assert.assertEquals(expectedUyariYaziElementi,actuelUyariYaziElementi);


    }

}
