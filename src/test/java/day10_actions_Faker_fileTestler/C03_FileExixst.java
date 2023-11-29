package day10_actions_Faker_fileTestler;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilitlies.ResubleMetods;
import utilitlies.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExixst  extends TestBase {

@Test
    public void dosyaİndirmeTesti(){
    //2. https://the-internet.herokuapp.com/download adresine gidelim.
    driver.get("https://the-internet.herokuapp.com/download");
    //3. logo.png dosyasını indirelim
    driver.findElement(By.xpath("//a[text()='logo.png']")).click();
    ResubleMetods.bekle(5);
    //4. Dosyanın başarıyla indirilip indirilmediğini test edelim
    String dosyaYolu="C:\\Users\\Azim Kaya\\Downloads";
    Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


    }
}
