package TimQuastions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitlies.TestBase_BforeClass;

import java.util.List;

public class Q4_T8 extends TestBase_BforeClass {

    @Test
    public void t8(){


        // 1. Launch browse
        //     Tarayıcıyı başlat

        // 2. Navigate to url 'http://automationexercise.com'
        //    'http://automationexercise.com' adresine git
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        //     Ana sayfanın başarılı bir şekilde görüntülendiğini doğrula
        WebElement homaPage=driver.findElement(By.xpath("(//div[@class='col-sm-6'])[3]"));
        homaPage.isDisplayed();
       // Assert.assertTrue(homaPage.isDisplayed());

        // 4. Click on 'Products' button
        //    'Ürünler' düğmesine tıkla
        driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
        // 5. Verify user is navigated to ALL PRODUCTS page successfully
        //     Kullanıcının BAŞKA BÜTÜN ÜRÜNLER sayfasına başarılı bir şekilde yönlendirildiğini doğrula

         String expectedTitleİcerik="All Products";
         String actualProductPage=driver.getTitle();
         Assert.assertTrue(actualProductPage.contains(expectedTitleİcerik));
        // 6. The products list is visible
        //     Ürünler listesi görünür durumda
        driver.findElement(By.xpath("//h2[@class='title text-center']"));


        // 7. Click on 'View Product' of first product
        //    İlk ürünün 'Ürünü Görüntüle' düğmesine tıkla

         driver.findElement(By.xpath("(//i[@class='fa fa-plus-square'])[1]")).click();

        // 8. User is landed to product detail page
        //      Kullanıcı ürün detay sayfasına yönlendirildi

        String expectedDetalPage="product_details";
        String actualDetalPage=driver.getTitle();
        Assert.assertEquals(actualDetalPage,expectedDetalPage);




         // 9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
         //     Detayların görünür olduğunu doğrula: ürün adı, kategori, fiyat, mevcudiyet, durum, marka

          WebElement productDisplay=driver.findElement(By.xpath("//div[@class='product-information']"));
          driver.findElement(By.tagName("Blue Top"));
          driver.findElement(By.tagName("Category: Women > Tops"));
           // 10.Print the texts on each button on the page.
           // Sayfadaki herbir button üzerindeki yazilari yazdirin
          List<WebElement> buttonListesi=driver.findElements(By.tagName("button"));
          buttonListesi.size();

        for (WebElement each:buttonListesi
             ) {
            System.out.println(each.getText());
        }












    }
}
