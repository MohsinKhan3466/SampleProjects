package com.OPNCRT.test;

import com.OPNCRT.base.BaseTest;
import com.OPNCRT.pages.HomePage;
import com.OPNCRT.pages.LogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class LogInTest extends BaseTest {

    FileReader loader;
    Properties prop;

    {
        try {
            loader = new FileReader("D:\\Projects\\MY Project Directory\\MKOPNCRTSAMPLE\\src\\test\\java\\com\\OPNCRT\\dataProvider\\LogIn_utilities.properties");
             prop= new Properties();
             prop.load(loader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void validLogINTest(){
        HomePage homePage = new HomePage(driver);
        homePage.click_On_MyAccountDropdown();
        homePage.ClickLogInLink();

        LogInPage logInPage= new LogInPage(driver);
        logInPage.enterUserName(prop.getProperty("Valid_Email"));
        logInPage.enterPassword(prop.getProperty("Valid_Password"));
        logInPage.click_Login();

        System.out.println(driver.getTitle());

    }
}
