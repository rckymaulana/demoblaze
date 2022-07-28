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
public class CategoriesMonitorsTest {
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
  public void categoriesMonitors() {
    driver.Navigate().GoToUrl("https://www.demoblaze.com/");
    driver.Manage().Window.Size = new System.Drawing.Size(1366, 728);
    js.ExecuteScript("window.scrollTo(0,37)");
    driver.FindElement(By.LinkText("Monitors")).Click();
    driver.FindElement(By.LinkText("Apple monitor 24")).Click();
    driver.FindElement(By.LinkText("Add to cart")).Click();
  }
}
