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
public class ContactTest {
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
  public void contact() {
    // Test name: Contact
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://www.demoblaze.com/");
    // 2 | setWindowSize | 1382x744 | 
    driver.manage().window().setSize(new Dimension(1382, 744));
    // 3 | mouseOver | id=login2 | 
    {
      WebElement element = driver.findElement(By.id("login2"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 4 | mouseOut | id=login2 | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 5 | click | linkText=Contact | 
    driver.findElement(By.linkText("Contact")).click();
    // 6 | click | id=recipient-email | 
    driver.findElement(By.id("recipient-email")).click();
    // 7 | type | id=recipient-email | rickynsackhbaschabac
    driver.findElement(By.id("recipient-email")).sendKeys("rickynsackhbaschabac");
    // 8 | click | id=recipient-name | 
    driver.findElement(By.id("recipient-name")).click();
    // 9 | type | id=recipient-name | dsbcjsdbhcjsdh
    driver.findElement(By.id("recipient-name")).sendKeys("dsbcjsdbhcjsdh");
    // 10 | click | id=message-text | 
    driver.findElement(By.id("message-text")).click();
    // 11 | type | id=message-text | bsdicbsjdbhcjsd
    driver.findElement(By.id("message-text")).sendKeys("bsdicbsjdbhcjsd");
    // 12 | click | css=#exampleModal .btn-primary | 
    driver.findElement(By.cssSelector("#exampleModal .btn-primary")).click();
    // 13 | assertAlert | Thanks for the message!! | 
    assertThat(driver.switchTo().alert().getText(), is("Thanks for the message!!"));
    // 14 | click | linkText=Contact | 
    driver.findElement(By.linkText("Contact")).click();
    // 15 | click | id=recipient-email | 
    driver.findElement(By.id("recipient-email")).click();
    // 16 | type | id=recipient-email | rickymaulana026@gmail.com
    driver.findElement(By.id("recipient-email")).sendKeys("rickymaulana026@gmail.com");
    // 17 | type | id=recipient-name | ricky
    driver.findElement(By.id("recipient-name")).sendKeys("ricky");
    // 18 | click | id=message-text | 
    driver.findElement(By.id("message-text")).click();
    // 19 | mouseDownAt | id=message-text | 461.5,56
    {
      WebElement element = driver.findElement(By.id("message-text"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 20 | mouseMoveAt | css=#exampleModal .modal-body | 396.5,320
    {
      WebElement element = driver.findElement(By.cssSelector("#exampleModal .modal-body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 21 | mouseUpAt | css=#exampleModal .modal-body | 396.5,320
    {
      WebElement element = driver.findElement(By.cssSelector("#exampleModal .modal-body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 22 | click | id=message-text | 
    driver.findElement(By.id("message-text")).click();
    // 23 | type | id=message-text | haloooooooooooooooooooooooooooooooo
    driver.findElement(By.id("message-text")).sendKeys("haloooooooooooooooooooooooooooooooo");
    // 24 | click | css=#exampleModal .btn-primary | 
    driver.findElement(By.cssSelector("#exampleModal .btn-primary")).click();
    // 25 | assertAlert | Thanks for the message!! | 
    assertThat(driver.switchTo().alert().getText(), is("Thanks for the message!!"));
    // 26 | click | linkText=Contact | 
    driver.findElement(By.linkText("Contact")).click();
    // 27 | click | id=recipient-email | 
    driver.findElement(By.id("recipient-email")).click();
    // 28 | type | id=recipient-email | rickymaulana026@gmaaaaaaail.com
    driver.findElement(By.id("recipient-email")).sendKeys("rickymaulana026@gmaaaaaaail.com");
    // 29 | type | id=recipient-name | ricky1223
    driver.findElement(By.id("recipient-name")).sendKeys("ricky1223");
    // 30 | click | css=#exampleModal .form-group:nth-child(3) | 
    driver.findElement(By.cssSelector("#exampleModal .form-group:nth-child(3)")).click();
    // 31 | click | id=message-text | 
    driver.findElement(By.id("message-text")).click();
    // 32 | click | css=#exampleModal .btn-primary | 
    driver.findElement(By.cssSelector("#exampleModal .btn-primary")).click();
    // 33 | assertAlert | Thanks for the message!! | 
    assertThat(driver.switchTo().alert().getText(), is("Thanks for the message!!"));
    // 34 | click | linkText=Contact | 
    driver.findElement(By.linkText("Contact")).click();
    // 35 | click | css=#exampleModal .btn-primary | 
    driver.findElement(By.cssSelector("#exampleModal .btn-primary")).click();
    // 36 | assertAlert | Thanks for the message!! | 
    assertThat(driver.switchTo().alert().getText(), is("Thanks for the message!!"));
    // 37 | click | linkText=Contact | 
    driver.findElement(By.linkText("Contact")).click();
    // 38 | click | id=recipient-email | 
    driver.findElement(By.id("recipient-email")).click();
    // 39 | type | id=recipient-email | 1
    driver.findElement(By.id("recipient-email")).sendKeys("1");
    // 40 | click | css=#exampleModal .btn-primary | 
    driver.findElement(By.cssSelector("#exampleModal .btn-primary")).click();
    // 41 | assertAlert | Thanks for the message!! | 
    assertThat(driver.switchTo().alert().getText(), is("Thanks for the message!!"));
    // 42 | click | id=recipient-name | 
    driver.findElement(By.id("recipient-name")).click();
    // 43 | type | id=recipient-name | 2
    driver.findElement(By.id("recipient-name")).sendKeys("2");
    // 44 | click | css=#exampleModal .btn-primary | 
    driver.findElement(By.cssSelector("#exampleModal .btn-primary")).click();
    // 45 | assertAlert | Thanks for the message!! | 
    assertThat(driver.switchTo().alert().getText(), is("Thanks for the message!!"));
    // 46 | click | linkText=Contact | 
    driver.findElement(By.linkText("Contact")).click();
    // 47 | click | id=message-text | 
    driver.findElement(By.id("message-text")).click();
    // 48 | type | id=message-text | 123
    driver.findElement(By.id("message-text")).sendKeys("123");
    // 49 | click | css=#exampleModal .btn-primary | 
    driver.findElement(By.cssSelector("#exampleModal .btn-primary")).click();
    // 50 | assertAlert | Thanks for the message!! | 
    assertThat(driver.switchTo().alert().getText(), is("Thanks for the message!!"));
    // 51 | click | linkText=Contact | 
    driver.findElement(By.linkText("Contact")).click();
    // 52 | mouseOver | linkText=Contact | 
    {
      WebElement element = driver.findElement(By.linkText("Contact"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 53 | mouseOut | linkText=Contact | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 54 | mouseDownAt | id=recipient-email | 412.5,17
    {
      WebElement element = driver.findElement(By.id("recipient-email"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 55 | mouseMoveAt | id=recipient-email | 412.5,17
    {
      WebElement element = driver.findElement(By.id("recipient-email"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 56 | mouseUpAt | id=recipient-email | 412.5,17
    {
      WebElement element = driver.findElement(By.id("recipient-email"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 57 | click | css=#exampleModal form | 
    driver.findElement(By.cssSelector("#exampleModal form")).click();
    // 58 | click | css=#exampleModal .btn-secondary | 
    driver.findElement(By.cssSelector("#exampleModal .btn-secondary")).click();
    // 59 | click | linkText=Contact | 
    driver.findElement(By.linkText("Contact")).click();
    // 60 | click | css=#exampleModal span | 
    driver.findElement(By.cssSelector("#exampleModal span")).click();
  }
}
