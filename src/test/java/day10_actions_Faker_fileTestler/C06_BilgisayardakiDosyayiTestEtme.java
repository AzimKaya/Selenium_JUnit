package day10_actions_Faker_fileTestler;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C06_BilgisayardakiDosyayiTestEtme {
    @Test
    public void test01(){
String dosyaYolu="C:\\Users\\Azim Kaya\\Desktop";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


        String dinamikDosyaYolu=System.getProperty("user.home")+
                "C:\\Users\\Azim Kaya\\Downloads";
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));

    }
}
