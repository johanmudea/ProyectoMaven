package aerotechnotest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;


public class AerotechnoTest {

    private WebDriver driver;
    public static String URL ="https://www.aerotechno.com.co";

    By ticketsMenu = By.linkText("TICKETS");
    By cajaTexto = By.xpath("//*[@id=\"wc-block-search__input-1\"]");


    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/driver/geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-private");
        this.driver = new FirefoxDriver(options); // Utiliza la variable de instancia, no declares una nueva local.
        this.driver.manage().window().maximize();
        this.driver.get(URL);
        this.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testAerotechnoPage() throws InterruptedException {

        //WebElement Tickets = this.driver.findElement(By.xpath("//*[@id=\"menu-item-1230\"]/a"));
        driver.findElement(ticketsMenu).isDisplayed();
        driver.findElement(ticketsMenu).click();
        //Tickets.isDisplayed();
        //Tickets.click();

        if(driver.findElement(cajaTexto).isDisplayed()){
            driver.findElement(cajaTexto).click();
            driver.findElement(cajaTexto).sendKeys("Circo Erótico");
            driver.findElement(cajaTexto).submit();
        }else {
            System.out.println("Paila");
        }

        WebElement AssertionComparator = this.driver.findElement(By.xpath("//*[@id=\"product-2047\"]/div[2]/h1"));
        AssertionComparator.isDisplayed();
        Thread.sleep(1000);
        List<WebElement> fonts = driver.findElements(By.xpath("//*[@id=\"product-2047\"]/section/ul"));
        assertEquals("ANIVERSARIO III Aerotechno Present: Circo Erótico 2024. - aerotechno.com.co", this.driver.getTitle());


    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
