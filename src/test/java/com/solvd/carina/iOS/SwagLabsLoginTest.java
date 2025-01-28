package com.solvd.carina.iOS;

import com.solvd.carina.demo.mobile.swaglabs.common.pages.HomePageBase;
import com.solvd.carina.demo.mobile.swaglabs.common.pages.LoginPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsLoginTest implements IAbstractTest {


    @Test
    public void testLogin(){
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);

        Assert.assertTrue(loginPageBase.isPageOpened(), "The Login Page was not open");

        HomePageBase homePage = loginPageBase.login("standard_user", "secret_sauce");

        Assert.assertTrue(homePage.isPageOpened(), "The Home Page was not open");

        Assert.assertTrue(homePage.isCartButtonPresent(), "Cart button is not visible on Home Page");
    }

}
