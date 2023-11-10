package pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;

public class Base {

    private WebDriver driver;

    public Base(WebDriver driver){
        this.driver=driver;
    }

    public WebDriver firefoxDriverConection(){
        //System.setProperty("webdriver.gecko.driver", "./src/main/resources/driver/geckodriver.exe");
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        //options.addArguments("-private");
        driver = new FirefoxDriver(options);
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public Boolean isDisplayed(By locator){
        try {
            return driver.findElement(locator).isDisplayed();

        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void submit(By locator){
        driver.findElement(locator).submit();
    }

    public void clear(By locator){
        driver.findElement(locator).clear();
    }


    public void visit(String url){
        driver.get(url);
    }


    public String getTitle(By locator){
        return driver.getTitle();
    }




}
