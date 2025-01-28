package com.solvd.carina.demo.mobile.swaglabs.ios.pages;

import com.solvd.carina.demo.mobile.swaglabs.common.components.HeaderMenuComponentBase;
import com.solvd.carina.demo.mobile.swaglabs.common.pages.HomePageBase;
import com.solvd.carina.demo.mobile.swaglabs.ios.components.HeaderMenuComponent;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {


    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == 'test-Cart'`]/XCUIElementTypeOther")
    private ExtendedWebElement cartButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == 'ADD TO CART'`][%s]")
    private ExtendedWebElement addToCartButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == 'test-Menu'`]/XCUIElementTypeOther")
    private ExtendedWebElement menuBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == 'headerContainer'`]/XCUIElementTypeImage")
    private HeaderMenuComponent headerMenuComponent;

    public HomePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(cartButton);
    }

    @Override
    public boolean isCartButtonPresent() {
        return cartButton.isElementPresent();
    }

    @Override
    public HeaderMenuComponentBase getHeaderMenuComponent() {
        return null;
    }
}
