package day11_wait;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilitlies.TestBase;

import java.util.Set;

public class C03_Cookies extends TestBase {

    @Test
    public  void cookies(){

        //1- amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //2- tum cookie’leri listeleyin

        Set<Cookie>cookieSeti=driver.manage().getCookies();
        int siraNo=1;
        for (Cookie each:cookieSeti
             ) {
            System.out.println(siraNo+"==========>"+each);
            siraNo++;
        }


        //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        int expectedMinumumCookieSayisi=5;
        int actualCookeSayisi=cookieSeti.size();
        //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin


        //6- eklediginiz cookie’nin sayfaya eklendigini test edin
        // 7- ismi skin olan cookie’yi silin ve silindigini test edin
        //8- tum cookie’leri silin ve silindigini test edin

    }
}
