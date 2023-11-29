package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

public class T2Drop extends TestBase {
    @Test
    public void test02(){


        //1- https://testotomasyonu.com/droppable adresine gidelim
        driver.get("https://testotomasyonu.com/droppable");

        // 2- Accept bolumunde “Drag me” butonunu tutup “Outer droppable” kutusunun ustune birakalim
       WebElement acceptableElementi= driver.findElement(By.id("draggable3"));
       WebElement tasınacakHedefAlan= driver.findElement(By.id("droppable3"));
       ResubleMetods.bekle(1);
       Actions actions=new Actions(driver);
                  actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResubleMetods.bekle(1);

       actions.dragAndDrop(acceptableElementi,tasınacakHedefAlan).perform();

        //3- “Outer droppable” yazisi yerine “Dropped!” oldugunu test edin
       String expectedAlanYazisi="Dropped!";
       String actualAlanYazisi=tasınacakHedefAlan.getText();
       Assert.assertTrue(actualAlanYazisi.contains(expectedAlanYazisi));
        System.out.println(tasınacakHedefAlan.getText());
        ResubleMetods.bekle(1);

        //4- Sayfayi yenileyin
        driver.navigate().refresh();
        actions =new Actions(driver);
        ResubleMetods.bekle(1);
        //5- “Drag me” butonunu tutup “Outer droppable” kutusunun ustune birakalim
        WebElement acceptableElementi2= driver.findElement(By.id("draggable3"));
        WebElement tasinacakAlan2=driver.findElement(By.id("droppable4"));
        ResubleMetods.bekle(1);
        actions.dragAndDrop(acceptableElementi2,tasinacakAlan2).perform();

        String expectedAlanYazisi2="Dropped!";
        String actualAlanYazisi2=tasinacakAlan2.getText();
        Assert.assertTrue(actualAlanYazisi2.contains(expectedAlanYazisi2));
        System.out.println(tasinacakAlan2.getText());

        ResubleMetods.bekle(1);

        //6- “Not Revert” butonunu tutup “Drop me here” kutusunun ustune birakalim
        driver.navigate().refresh();
        actions =new Actions(driver);

        ResubleMetods.bekle(1);
        WebElement acceptableElementi3= driver.findElement(By.id("draggable6"));
        WebElement tasinacakAlan3=driver.findElement(By.id("droppable5"));
        ResubleMetods.bekle(1);
        actions.dragAndDrop(acceptableElementi3,tasinacakAlan3).perform();

        String expectedAlanYazisi3="Dropped!";
        String actualAlanYazisi3=tasinacakAlan3.getText();
        Assert.assertTrue(actualAlanYazisi3.contains(expectedAlanYazisi3));
        System.out.println(tasinacakAlan3.getText());

        ResubleMetods.bekle(1);

        //7- “Will Revert” butonunu tutup “Drop me here” kutusunun ustune birakalim
        driver.navigate().refresh();
        actions =new Actions(driver);

        ResubleMetods.bekle(1);
        WebElement acceptableElementi4= driver.findElement(By.id("draggable5"));
        WebElement tasinacakAlan4=driver.findElement(By.id("droppable5"));
        ResubleMetods.bekle(1);
        actions.dragAndDrop(acceptableElementi4,tasinacakAlan4).perform();

        String expectedAlanYazisi4="Dropped!";
        String actualAlanYazisi4=tasinacakAlan4.getText();
        Assert.assertTrue(actualAlanYazisi4.contains(expectedAlanYazisi4));
        System.out.println(tasinacakAlan4.getText());


        ResubleMetods.bekle(2);



    }

}




