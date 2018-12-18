package com.telesens.academy.tests.demoga.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected final WebDriver driver;
    protected String baseUrl  = "http://store.demoqa.com";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void input(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
}
