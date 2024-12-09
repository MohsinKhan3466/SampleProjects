package com.OPNCRT.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
   WebDriver driver;

   @FindBy(id="input-email")
    WebElement emailInput;

   @FindBy(id="input-password")
    WebElement passwordInput;

   @FindBy(xpath = "//input[@type='submit']")
    WebElement logInButton;

   public LogInPage(WebDriver driver){
       this.driver = driver;
       PageFactory.initElements(driver,this);
   }


   public void enterUserName(String userName){
       emailInput.sendKeys(userName);
   }
   public void enterPassword(String password){
       passwordInput.sendKeys(password);
   }
   public void click_Login(){
       logInButton.click();
   }
}
