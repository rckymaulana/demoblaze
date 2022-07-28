// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class AboutUsTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void aboutUs() {
    driver.get("https://www.demoblaze.com/");
    driver.manage().window().setSize(new Dimension(516, 728));
    driver.findElement(By.linkText("About us")).click();
    driver.findElement(By.cssSelector("#videoModal .modal-header span")).click();
    driver.findElement(By.linkText("About us")).click();
    {
      WebElement element = driver.findElement(By.linkText("About us"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".vjs-big-play-button > .vjs-icon-placeholder")).click();
    driver.findElement(By.cssSelector(".vjs-play-control > .vjs-icon-placeholder")).click();
    driver.findElement(By.cssSelector(".vjs-mute-control > .vjs-icon-placeholder")).click();
    driver.findElement(By.cssSelector(".vjs-play-control > .vjs-icon-placeholder")).click();
    driver.findElement(By.cssSelector(".vjs-mute-control > .vjs-icon-placeholder")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".vjs-volume-level"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".vjs-volume-level"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".vjs-volume-level"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".vjs-volume-level")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".vjs-volume-control"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".vjs-volume-control"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".vjs-volume-control"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".vjs-volume-control")).click();
    driver.findElement(By.cssSelector(".vjs-fullscreen-control > .vjs-icon-placeholder")).click();
    driver.findElement(By.cssSelector(".vjs-fullscreen-control")).click();
    driver.findElement(By.cssSelector("#videoModal .btn")).click();
    driver.findElement(By.linkText("About us")).click();
    driver.findElement(By.cssSelector(".vjs-play-control > .vjs-icon-placeholder")).click();
    driver.findElement(By.cssSelector(".vjs-mute-control > .vjs-icon-placeholder")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".vjs-progress-control"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".vjs-progress-control"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".vjs-progress-control"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".vjs-control-bar")).click();
    driver.findElement(By.cssSelector(".vjs-mouse-display")).click();
    driver.findElement(By.cssSelector(".vjs-mouse-display")).click();
    driver.findElement(By.cssSelector(".vjs-picture-in-picture-control > .vjs-icon-placeholder")).click();
    driver.findElement(By.cssSelector(".vjs-picture-in-picture-control > .vjs-icon-placeholder")).click();
    driver.findElement(By.id("example-video_html5_api")).click();
    driver.findElement(By.cssSelector(".vjs-fullscreen-control > .vjs-icon-placeholder")).click();
    driver.findElement(By.cssSelector(".vjs-progress-control")).click();
    driver.findElement(By.cssSelector(".vjs-fullscreen-control > .vjs-icon-placeholder")).click();
    driver.findElement(By.cssSelector("#videoModal .btn")).click();
    driver.findElement(By.linkText("About us")).click();
    driver.findElement(By.cssSelector(".vjs-play-control > .vjs-icon-placeholder")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".vjs-play-control > .vjs-icon-placeholder"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".vjs-play-control > .vjs-icon-placeholder"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".vjs-play-control > .vjs-icon-placeholder"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".vjs-control-bar")).click();
    driver.findElement(By.cssSelector("#videoModal .modal-body")).click();
    driver.findElement(By.cssSelector("#videoModal .modal-header span")).click();
  }
}