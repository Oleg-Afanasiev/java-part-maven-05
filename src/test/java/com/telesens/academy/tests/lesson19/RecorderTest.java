package com.telesens.academy.tests.lesson19;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RecorderTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "d:/distribs/selenium/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("http://automationpractice.com/index.php");
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("oleg.kh81@gmail.com");
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("123qwerty");
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("vlrevlor");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("123qwerty");
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("123qwerty");
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("7520vlrevlor");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("123qwerty");
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("123qwerty");
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("qwerty123");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("123qwerty");
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("123qwerty");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
    driver.findElement(By.linkText("Sign out")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

  private void actionDemo() {
    Actions actions = new Actions(driver);
    actions.sendKeys("message ");
  }
}
