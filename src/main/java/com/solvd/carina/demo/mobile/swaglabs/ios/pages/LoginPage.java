package com.solvd.carina.demo.mobile.swaglabs.ios.pages;

import com.solvd.carina.demo.mobile.swaglabs.common.pages.HomePageBase;
import com.solvd.carina.demo.mobile.swaglabs.common.pages.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == 'test-Username'`]")
    private ExtendedWebElement usernameField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeSecureTextField[`name == 'test-Password'`]")
    private ExtendedWebElement passwordField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == 'LOGIN'`][2]")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePageBase login() {
        usernameField.type("standard_user");
        passwordField.type("secret_sauce");
        loginButton.click();
        return initPage(getDriver(), HomePageBase.class);
    }
    @Override
    public void typeUsername(String username) {
        usernameField.type(username);
    }

    @Override
    public void typePassword(String password) {
        passwordField.type(password);
    }

    @Override
    public HomePage clickLoginButton() {
        loginButton.click();
        return new HomePage(getDriver());
    }

}
