package com.amazon.test.login;
import com.amazon.driver.DriverManager;
import com.amazon.page.BasePage;
import com.amazon.page.LoginPage;
import com.amazon.page.NavigationBarPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
public class LoginBaseTest {
    protected WebDriver driver;
    protected NavigationBarPage navigationBarPage;
    private BasePage basePage;
    private LoginPage loginPage;

    @BeforeClass
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) {
        driver = DriverManager.getDriver(browser);
        driver.get("https://www.amazon.com.tr");
        basePage = new BasePage(driver);
        basePage.clickAcceptCookie();
        navigationBarPage = new NavigationBarPage(driver);
        loginPage = new LoginPage(driver);
        // Check if login is necessary
        if (!navigationBarPage.isLoginSuccessful()) {
            performLogin();
        }
    }

    protected void performLogin() {
        navigationBarPage.clickLoginAccountListButton();
        loginPage.inputEmail("");//emailiniz ile deneyebilirsiniz
        loginPage.clickContinueButton();
        loginPage.inputPassword("");//şifreniz ile deneyebilirsiniz
        loginPage.clickLoginButton();
    }
    protected boolean isLoginSuccessful() {
        return navigationBarPage.isLoginSuccessful();
    }

    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
