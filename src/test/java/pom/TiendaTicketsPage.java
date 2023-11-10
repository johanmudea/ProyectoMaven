package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TiendaTicketsPage extends Base{
    public TiendaTicketsPage(WebDriver driver) {
        super(driver);
    }

    By cajaTexto = By.xpath("//*[@id=\"wc-block-search__input-1\"]");
    By assertionComparator = By.xpath("//*[@id=\"product-2047\"]/div[2]/h1");


    public void teclearCircoErotico () throws InterruptedException {

        if(isDisplayed(cajaTexto)){
            type("Circo Erótico",cajaTexto );
            submit(cajaTexto);
            System.out.println("Bien Hecho has escrito en la caja de texto");
            Thread.sleep(2000);

        }else {
            System.out.println("Error Buscando en caja de texto");
        }

    }

}
