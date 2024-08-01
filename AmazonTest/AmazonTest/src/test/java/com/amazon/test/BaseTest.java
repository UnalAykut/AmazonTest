package com.amazon.test;



import com.amazon.driver.DriverManager;
import com.amazon.page.BasePage;
import com.amazon.page.NavigationBar;
import com.fasterxml.jackson.databind.ser.Serializers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    private BasePage basePage;
    private NavigationBar navigationBar;
    @BeforeClass
    @Parameters("browser")
    public void setUp(@Optional("chrome")String browser){
        navigationBar=new NavigationBar( driver );
        driver= DriverManager.getDriver( browser );
        driver.get( "https://www.amazon.com.tr" );
        basePage=new BasePage( driver );
        basePage.clickAcceptCookie();
    }

    @AfterClass
    public void tearDown(){
        DriverManager.quitDriver();
    }
}
