package com.telesens.academy.tests.demoga.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAccountPage extends BasePage{
    @FindBy(id="log")
    private WebElement usernameField;

    public YourAccountPage(WebDriver driver) {
        super(driver);
    }

    public YourAccountPage enterLogin(String login) {
        input(usernameField, login);

        return this;
    }

    public YourAccountPage yourAccountPage() {
        return this;
    }
}
