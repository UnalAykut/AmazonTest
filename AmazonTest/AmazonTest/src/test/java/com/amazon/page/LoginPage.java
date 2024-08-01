package com.amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super( driver );
    }
    @FindBy(id = "ap_email")
    private WebElement emailInput;
    @FindBy(id = "continue")
    private WebElement continueButton;
    @FindBy(id = "auth-email-missing-alert")
    private WebElement emailMessage;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]")
    private WebElement wrongEmailmessage;

    @FindBy(id = "ap_password")
    private WebElement passwordInput;
    @FindBy(id = "signInSubmit")
    private WebElement loginButton;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement emptyPasswordMessage;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]")
    private WebElement wrongPasswordMessage;
    public void inputEmail(String emailText){
        emailInput.sendKeys( emailText );
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public String emptyEmailMessage(){
        return emailMessage.getText();
    }
    public void inputPassword(String password){
        passwordInput.sendKeys( password );
    }
    public String wrongEmailMessage(){
        return wrongEmailmessage.getText();
    }
    public String emptyPasswordMessage(){
        return emptyPasswordMessage.getText();
    }
    public String wrongPasswordMessage(){
        return wrongPasswordMessage.getText();
    }
    public void clearEmailInput(){
            emailInput.clear();
    }

    public void clearPasswordInput(){
            passwordInput.clear();
    }
    public void clickLoginButton(){
        loginButton.click();
    }


}
