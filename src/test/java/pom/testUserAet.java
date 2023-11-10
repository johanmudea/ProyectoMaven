package pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

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
    @Test
    public void test() throws InterruptedException {

     homePage.irTienda();
     tiendaTicketsPage.teclearCircoErotico();
     ticketDetailsPage.compararResultado();

    }
}
