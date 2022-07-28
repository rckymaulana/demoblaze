// Generated by Selenium IDE
using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.Remote;
using OpenQA.Selenium.Support.UI;
using OpenQA.Selenium.Interactions;
using NUnit.Framework;
[TestFixture]
public class ChartFillYearTest {
  private IWebDriver driver;
  public IDictionary<string, object> vars {get; private set;}
  private IJavaScriptExecutor js;
  [SetUp]
  public void SetUp() {
    driver = new ChromeDriver();
    js = (IJavaScriptExecutor)driver;
    vars = new Dictionary<string, object>();
  }
  [TearDown]
  protected void TearDown() {
    driver.Quit();
  }
  [Test]
  public void chartFillYear() {
    driver.Navigate().GoToUrl("https://www.demoblaze.com/");
    driver.Manage().Window.Size = new System.Drawing.Size(1366, 728);
    {
      var element = driver.FindElement(By.LinkText("Next"));
      Actions builder = new Actions(driver);
      builder.MoveToElement(element).Perform();
    }
    driver.FindElement(By.Id("cartur")).Click();
    driver.FindElement(By.CssSelector(".btn-success")).Click();
    driver.FindElement(By.Id("year")).Click();
    driver.FindElement(By.Id("year")).SendKeys("2022");
    driver.FindElement(By.CssSelector("#orderModal .btn-primary")).Click();
    Assert.That(driver.SwitchTo().Alert().Text, Is.EqualTo("Please fill out Name and Creditcard."));
    driver.FindElement(By.CssSelector("#orderModal .btn-secondary")).Click();
  }
}
