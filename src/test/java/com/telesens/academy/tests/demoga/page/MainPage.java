package com.telesens.academy.tests.demoga.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    @FindBy(className = "account_icon")
    private WebElement myAccountLink;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage goToHome() {
        driver.get(baseUrl);
        return this;
    }

    public YourAccountPage clickToMyAccount() {
        myAccountLink.click();
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        return yourAccountPage;
    }

    public MainPage mainPage() {
        return this;
    }
}
