package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    By ticketsMenu = By.linkText("TICKETS");

    public void irTienda () throws InterruptedException {
        isDisplayed(ticketsMenu);
        click(ticketsMenu);
        Thread.sleep(20000);

    }

}
