package day06_JUnitAssortion;

import org.junit.Assert;
import org.junit.Test;

public class C03Asortions {


   @Test
   public void test01(){

       //emekli yasi 65
       //70 yasindaki bir kişinin emekli olabildigini test edin

       int yas=70;

       Assert.assertTrue(yas>65);//test passed

       int sayi1=20;
       int sayi2=30;

       Assert.assertTrue(sayi1>sayi2);

       String actualUrl="htts://www.testotomasyonu.com";





   }







}
