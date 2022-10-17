package Pages;

import Utilities.GWD;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Parent {

    public void sendKeysFunction(WebElement element, String value) {

        waitUntilVisible(element);
        scrollToElemment(element);
        element.clear();
        element.sendKeys(value);
    }

    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElemment(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElemment(element);
        element.click();


    }

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions
                .invisibilityOfElementLocated(By.xpath("//div[contains(text(),'successfully')]")));
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public void waitUntilLoading() {
        WebDriverWait wait = new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
    }

    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));

        return elementList;
    }
}