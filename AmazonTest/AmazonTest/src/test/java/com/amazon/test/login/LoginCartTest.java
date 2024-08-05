package com.amazon.test.login;

import com.amazon.page.CartPage;
import com.amazon.page.ProductPage;
import com.amazon.util.Utils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginCartTest extends LoginBaseTest{
    private ProductPage productPage;
    private CartPage cartPage;

    @BeforeClass
    public void pageSetUp() {
        cartPage=new CartPage( driver );
        productPage=new ProductPage( driver );
    }
    @Test(dependsOnMethods = {"com.amazon.test.login.LoginSearchTest.searchItemTest"})
    public void addToCartTest(){
        productPage.addCart();
        String actualData="Sepete Eklendi";
        if(Utils.nameControl( cartPage.addTextControl(), actualData)){
            System.out.println("Sepete Eklendi");
        }else {
            System.out.println("Sepete eklenmede sorun oluştu");
        }

    }


}
