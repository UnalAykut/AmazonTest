package com.amazon.test;

import com.amazon.page.NavigationBar;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
    private NavigationBar navigationBar;
    @BeforeClass
    public void pageSetUp(){
        navigationBar=new NavigationBar( driver );
    }
    @Test
    public void searchTest(){

        navigationBar.inputSearchTextBox( "laptop" );
        navigationBar.clickSubmitButton();
    }


}
