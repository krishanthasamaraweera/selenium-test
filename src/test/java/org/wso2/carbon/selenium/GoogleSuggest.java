package org.wso2.carbon.selenium;


    import com.saucelabs.selenium.client.factory.SeleniumFactory;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.testng.annotations.AfterClass;
    import org.testng.annotations.BeforeClass;
    import org.testng.annotations.Test;

public class GoogleSuggest {

    private WebDriver driver;

    @BeforeClass()
    public void testBefore(){
        driver = SeleniumFactory.createWebDriver();
        driver.get("http://www.google.com/webhp?complete=1&hl=en");
    }

    @Test()
    public void testGoogle() throws InterruptedException {
        WebElement query = driver.findElement(By.name("q"));
        query.sendKeys("Cheese");
        Thread.sleep(5000);

    }

    @AfterClass()
    public void afterClass(){
        driver.quit();
    }

    }
