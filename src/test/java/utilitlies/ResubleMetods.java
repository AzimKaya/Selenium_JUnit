package utilitlies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ResubleMetods {

    public static List<String> stringListeDonustur(List<WebElement> elementListesi){

        List<String> stringlerListesi=new ArrayList<>();
        for (WebElement each:elementListesi
        ) {
            stringlerListesi.add(each.getText());

        }
        return stringlerListesi;
    }
    public static void bekle(int saniye) {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public static WebDriver titleİleSayfaDegistir(WebDriver driver,String hedefSayfaTitle){




        Set <String> tumSayfaWHDSeti=driver.getWindowHandles();

        for (String each:tumSayfaWHDSeti
             ) {
            String eachTitle=driver.switchTo().window(each).getTitle();

            if (eachTitle.equals(hedefSayfaTitle)){

                return driver;
            }
        }

        return driver;
    }

    public static String ilkSayfaWhdİleİkinciSayfaWhdBul(WebDriver driver,String ilkSayfaWHD){

      Set<String> tumWHDSayfaSeti=driver.getWindowHandles();

      tumWHDSayfaSeti.remove(ilkSayfaWHD);

        for (String each:tumWHDSayfaSeti
             ) {
            return each;


        }
        return null;
    }

}
