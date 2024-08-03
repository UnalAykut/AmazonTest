package com.amazon.test.login;

import com.amazon.page.SearchResultPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class LoginSearchTest extends LoginBaseTest {
    private SearchResultPage searchResultPage;

    @BeforeClass
    public void pageSetUp() {
        searchResultPage = new SearchResultPage(driver);
    }

    @Test(priority = 1)
    public void searchItemTest() throws InterruptedException {
        performLogin(); //login işlemi
        if (!isLoginSuccessful()) {
            throw new IllegalStateException("User is not logged in. Login is required to perform this test.");
        }
        navigationBarPage.inputSearchTextBox("laptop");
        navigationBarPage.clickSubmitButton();
        searchResultPage.clickItemSearchResultsData(10); // İlk sonucu tıklama
    }
}
