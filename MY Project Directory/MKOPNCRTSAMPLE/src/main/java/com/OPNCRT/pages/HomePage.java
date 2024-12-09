package com.OPNCRT.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//span[text()='My Account']")
    WebElement MyAccountDropDown;

    @FindBy(xpath = "//a[text()='Login']")
    WebElement LogIn_Option;

    public HomePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public void click_On_MyAccountDropdown(){
        MyAccountDropDown.click();
    }
    public void ClickLogInLink(){
        LogIn_Option.click();
    }

}
