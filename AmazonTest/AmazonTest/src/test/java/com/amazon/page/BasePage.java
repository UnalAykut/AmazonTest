package com.amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    @FindBy(id = "sp-cc-accept")
    private WebElement acceptCookie;
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
        //her sayfada FindBy anatasyonu kullınalacağınan dolayı burada tanımladık.
        PageFactory.initElements( driver,this );
    }

    public void clickAcceptCookie(){
        try {
            acceptCookie.click();
        }catch (Exception e){
            //eğer cookie yoksa devam et
            System.out.println("Cookie bulunamadı");
        }

    }


}



