package com.amazon.page;

import com.amazon.util.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super( driver );
    }

    @FindBy(xpath = "//span[@id='productTitle']")
    private WebElement productName;
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;

    public String expectedProductName(){
        return Utils.waitForElementToBeVisible( driver,productName ).getText();
    }
    public void addCart(){
        addToCartButton.click();
    }



}
