package com.amazon.test;

import com.amazon.page.NavigationBar;
import com.amazon.page.SearchResultPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchResultPageTest extends BaseTest {

    private SearchResultPage searchResultPage;
    private NavigationBar navigationBar;
    @BeforeClass
    public void pageSetUp(){
        navigationBar=new NavigationBar( driver );
        searchResultPage=new SearchResultPage( driver );
    }
    @Test(dependsOnMethods = "com.amazon.test.AmazonTest.searchTest")
    @Parameters({"searchText", "index"})
    public void searchResultDataTest(String searchText,int index) {
        navigationBar.inputSearchTextBox(searchText );
        navigationBar.clickSubmitButton();
        searchResultPage.clickItemSearchResultsData(index);
    }


}
