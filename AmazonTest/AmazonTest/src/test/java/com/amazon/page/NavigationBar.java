package com.amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NavigationBar extends BasePage{

    public NavigationBar(WebDriver driver) {
        super( driver );
    }
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;
    @FindBy(id = "nav-search-submit-button")
    private WebElement submitButton;
    @FindBy(id = "nav-link-accountList")
    private WebElement loginAccountListButton;
    @FindBy(id = "nav-cart")
    private WebElement cartButton;
    @FindBy(id = "searchDropdownBox")
    private WebElement categoryDropdown;

    public void inputSearchTextBox(String searchText){
        searchTextBox.sendKeys(searchText);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }
    //liste oluşturma hesabım ve siparişlerim gibi ek olayları görebilmek için
    public void onHoverLoginAccountListButton(){
        Actions actions =new Actions( driver );
        actions.moveToElement( loginAccountListButton ).perform();
    }
    //giriş yapabilmek için
    public void clickLoginAccountListButton(){
        loginAccountListButton.click();
    }

    public void selectCategory(String category){
        Select dropdown = new Select(categoryDropdown);
        dropdown.selectByVisibleText( category );
    }






}
