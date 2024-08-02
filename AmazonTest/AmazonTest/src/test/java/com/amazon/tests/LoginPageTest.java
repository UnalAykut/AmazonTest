package com.amazon.tests;


import com.amazon.page.LoginPage;
import com.amazon.page.NavigationBar;
import com.amazon.util.Utils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class LoginPageTest extends BaseTest{
    Assertion assertion=new Assertion();
    private LoginPage loginPage;
    private NavigationBar navigationBar;

    private String expectedData;
    private String actualData;
    private String email="";
    private String password="";
    @BeforeClass
    public void pageSetUp(){
        navigationBar=new NavigationBar( driver );
        loginPage=new LoginPage( driver );
    }

    @Test(priority = 0)
    public void emptyEmailLoginTest() throws InterruptedException {
        expectedData="E-posta adresinizi veya cep telefonu numaranızı girin";
        navigationBar.clickLoginAccountListButton();
        loginPage.inputEmail(email);
        loginPage.clickContinueButton();
        actualData=loginPage.emptyEmailMessage();
        Utils.waitForSeconds(2);
        driver.navigate().refresh();
        assertion.assertEquals(actualData,expectedData);
        Utils.waitForSeconds(2);
    }
    @Test(priority = 1)
    public void wrongEmailLoginTest() throws InterruptedException {
        expectedData="Bu e-posta adresiyle bir hesap bulamıyoruz";
        email="asafa@gmail.com";
        loginPage.inputEmail(email);
        loginPage.clickContinueButton();
        actualData=loginPage.wrongEmailMessage();
        Utils.waitForSeconds(2);
        assertion.assertEquals(actualData,expectedData);
        loginPage.clearEmailInput();
        Utils.waitForSeconds(2);
    }
    @Test(priority = 2)
    public void trueEmailLoginTest() throws InterruptedException {
        expectedData="Bu e-posta adresiyle bir hesap bulamıyoruz";
        email="";//kendi emailinizi girip deneyebilirsiniz
        loginPage.inputEmail(email);
        loginPage.clickContinueButton();

    }
    @Test(priority = 3)
    public void emptyPasswordLoginTest() throws InterruptedException {
        expectedData="Şifrenizi girin";
        Thread.sleep( 2000 );
        loginPage.inputPassword( password );
        loginPage.clickLoginButton();
        actualData=loginPage.emptyPasswordMessage();
        Thread.sleep( 2000 );
        assertion.assertEquals(actualData,expectedData);
        driver.navigate().refresh();
        Thread.sleep( 2000 );
    }
    @Test(priority = 4)
    public void wrongPasswordLoginTest() throws InterruptedException {
        expectedData="Şifreniz yanlış";
        password="asasdasa@?0";
        Utils.waitForSeconds(2);
        loginPage.inputPassword( password );
        loginPage.clickLoginButton();
        Utils.waitForSeconds(2);
        actualData=loginPage.wrongPasswordMessage();
        assertion.assertEquals(actualData,expectedData);
        loginPage.clearPasswordInput();
        Utils.waitForSeconds(2);
    }
    @Test(priority = 5)
    public void trueLoginTest() throws InterruptedException {
        password="";//kendi şifrenizi girip deneyebilirsiniz
        loginPage.inputPassword( password );
        loginPage.clickLoginButton();
        Utils.waitForSeconds(2);
    }


}
