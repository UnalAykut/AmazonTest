package com.amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage{
    public SearchResultPage(WebDriver driver) {
        super( driver );
    }
    @FindBy(xpath = "//div[contains(@class, 's-result-item') and @data-index]")
    private List<WebElement> searchResultsData;




    public void clickItemSearchResultsData(int index){
        boolean elements=searchResultsData.isEmpty();
        if(elements==false && index<= searchResultsData.size()){
            searchResultsData.get( index ).click();
        }else {
            throw new IllegalArgumentException("Data bulunamadı , index değeri yanlış girilmiş olabilir.");
        }
    }


}
