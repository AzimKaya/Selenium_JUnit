package Practice1;

import org.junit.*;

public class P02 {

   @BeforeClass
    public static void  setup(){
       System.out.println("Test işlemleri başlatıldı");

    }
    @AfterClass
    public static void tearDwn(){
        System.out.println("Test işlemleri tamamlandi");

//Dikkat.
    }

    @Before
    public void before(){
        System.out.println("Yeni test çalıştırıldı");

    }
@After
public void after(){

    System.out.println("After çalıştırıldı");
}

    @Test
    public void Test01(){

        System.out.println("Azim1");
    }
    @Test
    public void Test05(){
        System.out.println("Azim2");

    }


    @Test
    public void Test03(){
        System.out.println("Azim3");


    }

    @Test
    public void Test04(){
        System.out.println("Azim4");


    }
    @Test
    public void Test02(){
        System.out.println("Azim5");


    }
}
