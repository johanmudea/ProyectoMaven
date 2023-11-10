package pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testUserAet {

    private WebDriver driver;
    HomePage homePage;
    TiendaTicketsPage tiendaTicketsPage;
    TicketDetailsPage ticketDetailsPage;

    @Before
    public void setUp() throws Exception{
        homePage = new HomePage(driver);
        ticketDetailsPage = new TicketDetailsPage(driver);
        tiendaTicketsPage = new TiendaTicketsPage(driver);

        driver = homePage.firefoxDriverConection();
        homePage.visit("https://www.aerotechno.com.co");


    }
    @After
    public void tearDown() throws Exception{
        driver.quit();
    }

    public String getDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    @Rule
    public TestRule watcher = new TestWatcher() {
        @Override
        protected void   failed(Throwable throwable, Description description) {
            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File("error_" +description.getMethodName()+getDate()));
            }catch (Exception e){
                e.printStackTrace();
            }
       }
        @Override
        protected void  finished(Description description){
            driver.quit();

        }

    };




    @Test
    public void test() throws InterruptedException {

        ticketDetailsPage = new TicketDetailsPage(driver);
        tiendaTicketsPage = new TiendaTicketsPage(driver);

     homePage.irTienda();
     tiendaTicketsPage.teclearCircoErotico();
     ticketDetailsPage.compararResultado();

    }
}
