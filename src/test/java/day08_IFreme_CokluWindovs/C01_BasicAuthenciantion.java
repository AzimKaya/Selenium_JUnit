package day08_IFreme_CokluWindovs;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitlies.TestBase;

public class C01_BasicAuthenciantion extends TestBase {

    // 1- Bir class olusturun : BasicAuthentication
    //2- https://testotomasyonu.com/basicauth sayfasina gidin
    //3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
    //Html komutu : https://username:password@URL
    //Username    : membername
    //password     : sunflower
    //4- Basarili sekilde sayfaya girildigini dogrulayin

    @Test
    public void basicAutoticatios(){

        driver.get("https://membername:sunflower@testotomasyonu.com/basicauth");


        WebElement basariliGirisYaziElementi= driver.findElement(By.tagName("h3"));

        String expectedYazi="Congratulations! You are logged in as: membername";
        String actuelYazi=basariliGirisYaziElementi.getText();
        Assert.assertEquals(expectedYazi,actuelYazi);
        System.out.println(basariliGirisYaziElementi.getText());



    }
}
