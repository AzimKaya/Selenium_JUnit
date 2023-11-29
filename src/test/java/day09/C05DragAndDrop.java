package day09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

public class C05DragAndDrop extends TestBase {
    @Test
    public void dragEndDrobTesti(){

        //1- https://testotomasyonu.com/droppable adresine gidelim
        driver.get("https://testotomasyonu.com/droppable");

        // 2- Accept bolumunde “Acceptable” butonunu tutup “Drop here” kutusunun ustune birakalim
        WebElement accetebleElement= driver.findElement(By.id("draggable2"));
        WebElement tasınacakHedfAlan= driver.findElement(By.id("droppable2"));

        Actions actions =new Actions(driver);
        System.out.println("Tasinmadan once:"+tasınacakHedfAlan.getText());
        ResubleMetods.bekle(2);
        actions.dragAndDrop(accetebleElement,tasınacakHedfAlan).perform();
        System.out.println("Tasinmadan sonra:"+tasınacakHedfAlan.getText());

        //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        String expectedAlanYazisi="Dropped!";
        String actualAlanYazisi=tasınacakHedfAlan.getText();
        Assert.assertEquals(expectedAlanYazisi,actualAlanYazisi);

        //4- Sayfayi yenileyin
        driver.navigate().refresh();
        actions =new Actions(driver);
        ResubleMetods.bekle(2);

        //5- “Not Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim
        WebElement notAcceptableElementi=driver.findElement(By.id("draggable-nonvalid2"));
        tasınacakHedfAlan= driver.findElement(By.id("droppable2"));
        actions.dragAndDrop(notAcceptableElementi,tasınacakHedfAlan).perform();
        ResubleMetods.bekle(2);

         //6- “Drop here” yazisinin degismedigini test edin
         ResubleMetods.bekle(2);
         expectedAlanYazisi="Drop Here";
         actualAlanYazisi=tasınacakHedfAlan.getText();
         Assert.assertEquals(expectedAlanYazisi,actualAlanYazisi);

    }
}
