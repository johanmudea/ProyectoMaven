package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TiendaTicketsPage extends Base{
    public TiendaTicketsPage(WebDriver driver) {
        super(driver);
    }

    By cajaTexto = By.xpath("//*[@id=\"wc-block-search__input-1\"]");

    public void teclearCircoErotico () throws InterruptedException {

        if(isDisplayed(cajaTexto)){
            type("Circo Erótico",cajaTexto );
            submit(cajaTexto);
            System.out.println("Bien Hecho, lo has logrado");

        }else {
            System.out.println("Error Buscando en caja de texto");
        }

    }

}
