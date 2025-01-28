package com.solvd.carina.demo.mobile.swaglabs.ios.components;

import com.solvd.carina.demo.mobile.swaglabs.common.components.HeaderMenuComponentBase;
import com.solvd.carina.demo.mobile.swaglabs.common.pages.CartPageBase;
import com.solvd.carina.demo.mobile.swaglabs.common.pages.LoginPageBase;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class HeaderMenuComponent extends HeaderMenuComponentBase implements ICustomTypePageFactory {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == 'test-Cart'`]/XCUIElementTypeOther")
    private ExtendedWebElement cartIcon;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == 'headerContainer'`]/XCUIElementTypeImage")
    private ExtendedWebElement header;

    public HeaderMenuComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public CartPageBase clickOnCartButton() {
        cartIcon.click();
        return initPage(getDriver(), CartPageBase.class);
    }
}
