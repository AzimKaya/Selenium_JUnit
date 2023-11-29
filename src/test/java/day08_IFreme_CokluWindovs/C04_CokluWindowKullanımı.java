package day08_IFreme_CokluWindovs;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilitlies.TestBase;

public class C04_CokluWindowKullanımı extends TestBase {
   @Test
    public void test01() throws InterruptedException {
        //Biz driver ile yaptıgımız tum islemlerde
        //aynı vindowda calıstık
        //driver bu sebeble yaptıgımız her islemi
        //aynı window icerisinde arastırır
        //isterseniz siz yeni bir tab veya window olusturabilirsiniz



       driver.get("https://www.testotomasyonu.com");
       System.out.println(driver.getWindowHandle());
       driver.switchTo().newWindow(WindowType.WINDOW).getWindowHandle();
       Thread.sleep(1000);


       driver.get("https://www.wisequarter.com");
       System.out.println(driver.getWindowHandle());
       Thread.sleep(1000);

       driver.navigate().back();
       System.out.println(driver.getWindowHandle());
       Thread.sleep(1000);










    }

}
