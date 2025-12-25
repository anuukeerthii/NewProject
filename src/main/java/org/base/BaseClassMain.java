package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassMain {
  public static WebDriver driver;

  public void browserLaunch() {
    driver = new ChromeDriver();

  }

  public void enterApplnUrl(String url) {
    driver.get(url);

  }

  public void maximizeWindow() {
    driver.manage().window().maximize();
  }

  public void elementSendKeys(WebElement element, String data) {
    element.sendKeys(data);
  }

  public void elementClick(WebElement element) {
    element.click();
  }

  public String getApplnTitle() {
    String title = driver.getTitle();
    return title;
  }

  public WebElement findLocatorById(String attributeValue) {
    WebElement element = driver.findElement(By.id(attributeValue));
    return element;
  }

  public WebElement findLocatorByName(String attributeValue) {
    WebElement element = driver.findElement(By.name(attributeValue));
    return element;
  }

  public WebElement findLocatorByClassName(String attributeValue) {
    WebElement element = driver.findElement(By.className(attributeValue));
    return element;
  }

  public WebElement findLocatorByXpath(String exp) {
    WebElement element = driver.findElement(By.xpath(exp));
    return element;
  }

  public String getApplnUrl() {
    String currentUrl = driver.getCurrentUrl();
    return currentUrl;
  }

  public void closeWindow() {
    driver.close();
  }

  public boolean elementIsDisplayed(WebElement element) {
    boolean displayed = element.isDisplayed();
    return displayed;
  }

  public boolean elementIsEnabled(WebElement element) {
    boolean enabled = element.isEnabled();
    return enabled;
  }

  public boolean elementIsSelected(WebElement element) {
    boolean selected = element.isSelected();
    return selected;
  }

  public String elementGetText(WebElement element) {
    String text = element.getText();
    return text;
  }

  public String elementGetDomProperty(WebElement element) {
    String domProperty = element.getDomProperty("value");
    return domProperty;

  }

  public String elementGetDomProperty(WebElement element, String attributeName) {
    String domProperty = element.getDomProperty(attributeName);
    return domProperty;

  }

}
