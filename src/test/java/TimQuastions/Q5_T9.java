package TimQuastions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitlies.TestBase;

public class Q5_T9 extends TestBase {
    @Test
    public void t9(){

        // 1. Launch browser
        //Tarayıcıyı başlatın.
        //2. Navigate to url 'http://automationexercise.com'
        //'' adresine gidin.
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        //Ana sayfanın başarılı bir şekilde görüntülendiğini doğrulayın.
        WebElement homaPage=driver.findElement(By.xpath("(//div[@class='col-sm-6'])[3]"));
        homaPage.isDisplayed();

        //4. Click on 'Products' button
        //'Ürünler' düğmesine tıklayın.
        driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        //Kullanıcının TÜM ÜRÜNLER sayfasına başarılı bir şekilde yönlendirildiğini doğrulayın.
        String expectedTitleİcerik="All Products";
        String actualProductPage=driver.getTitle();
        Assert.assertTrue(actualProductPage.contains(expectedTitleİcerik));

        //6. Enter product name in search input and click search button
        //Arama girişine ürün adını girin ve arama düğmesine tıklayın.
        WebElement searchProduct=driver.findElement(By.id("search_product"));
        searchProduct.sendKeys("Men Tshirt");
        driver.findElement(By.id("submit_search")).click();

        //7. Verify 'SEARCHED PRODUCTS' is visible
        //'ARAMA SONUÇLARI' görülebilir olduğunu doğrulayın.
        WebElement searcDsplay=driver.findElement(By.xpath("//h2[@class='title text-center']"));
        searcDsplay.isDisplayed();
        String expectedSonuctext="SEARCHED PRODUCTS";
        String actualSonuctext=searcDsplay.getText();
        Assert.assertTrue(actualSonuctext.contains(expectedSonuctext));
        System.out.println(searcDsplay.getText());

        //8. Verify all the products related to search are visible
        // Arama ile ilgili tüm ürünlerin görülebilir olduğunu doğrulayın.
         driver.navigate().back();
        WebElement searcallDsplay=driver.findElement(By.xpath("//h2[@class='title text-center']"));
        searcallDsplay.isDisplayed();
        String expectedTümSonuctext="ALL PRODUCTS";
        String actualTümSonuctext=searcallDsplay.getText();
        Assert.assertTrue(actualTümSonuctext.contains(expectedTümSonuctext));
        System.out.println(searcallDsplay.getText());









    }
}
