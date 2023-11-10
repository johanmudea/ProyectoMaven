package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TicketDetailsPage extends Base{
    public TicketDetailsPage(WebDriver driver) {
        super(driver);
    }

    By assertionComparator = By.xpath("//*[@id=\"product-2047\"]/div[2]/h1");

    public void  compararResultado (){

        if(isDisplayed(assertionComparator)){

            assertEquals("ANIVERSARIO III Aerotechno Present: Circo Erótico 2024. - aerotechno.com.co", getText(assertionComparator));
            System.out.println("Bien Hecho, lo has logrado");

        }else {
            System.out.println("Error Comparando Resultados de Busqueda");
        }

    }
}
