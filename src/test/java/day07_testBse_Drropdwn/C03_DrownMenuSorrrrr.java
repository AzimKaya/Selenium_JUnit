package day07_testBse_Drropdwn;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

import java.util.List;

public class C03_DrownMenuSorrrrr extends TestBase {

    @Test
    public void dropdwnTesti() throws InterruptedException {

//● https://testotomasyonu.com/form adresine gidin.
        driver.get("https://testotomasyonu.com/form");
// 1.Dogum tarihi gun seçeneğinden index kullanarak 5’i secin
        //1-Adım:Kullanacagımız ddm lacate edip kaydedelim
        WebElement dogumGunuDdm=driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));

        //2-Adım:Bir select objesi olusturalım
        //        parametre olarak locate ettigimiz ddmyi yazalım.
        Select selectGun=new Select(dogumGunuDdm);
        //3-Adim:Olusturdugumuz select objesi ile istenen islemleri yapalim
        Thread.sleep(2000);
        selectGun.selectByIndex(5);
       // 2. Dogum tarihi ay seçeneğinden visible tex kullanarak Nisan’i secin
        WebElement ayDdm=driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
        Select selectAy=new Select(ayDdm);
        Thread.sleep(2000);
        selectAy.selectByVisibleText("Nisan");
        // 3. Dogum tarihi yil seçeneğinden visible text kullanarak 1990’i secin
        WebElement yilDdm=driver.findElement(By.xpath("(//select[@class='form-control'])[3]"));
        Select selectYil=new Select(yilDdm);
        selectYil.selectByVisibleText("1990");
        //4.Secilen degerleri konsolda yazdirin
        //  Drobdown menude secim yaptiktan sonra
        // yapilan seçimi yazdirmak isterseniz
        System.out.println("Secilen tarih:"+selectGun.getFirstSelectedOption().getText()+
                           " "+selectAy.getFirstSelectedOption().getText()+
                           " "+selectYil.getFirstSelectedOption().getText());

        //5. Ay dropdown menüdeki tum değerleri(value) yazdırın
        List<WebElement>ayOpsiyonlariElementleriList=selectAy.getOptions();
        System.out.println(ResubleMetods.stringListeDonustur(ayOpsiyonlariElementleriList));

        //6. Ay Dropdown menusunun boyutunun 30 olduğunu test edin
        //Assert.assertEquals(30,ayOpsiyonlariElementleriList.size());
        ResubleMetods.bekle(5);
        WebElement footer =driver.findElement(By.xpath("//*[@*='footer']"));
         footer.click();
        ResubleMetods.bekle(5);
    }
}
