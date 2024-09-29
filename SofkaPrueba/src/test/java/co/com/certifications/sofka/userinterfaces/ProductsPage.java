package co.com.certifications.sofka.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage {

    public static final Target BTN_ADD_BACKPACK = Target.the("Boton para agregar al carrito la maleta")
            .located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target BTN_ADD_SHIRT = Target.the("Boton para agregar al carrito")
            .located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    public static final Target BTN_CHECKOUT = Target.the("Boton para checkout")
            .located(By.id("checkout"));
    public static final Target BTN_CONTINUE = Target.the("Boton para continuar")
            .located(By.id("continue"));
    public static final Target BTN_FINISH = Target.the("Boton para finalizar la compra")
            .located(By.id("finish"));
    public static final Target INPUT_NAME = Target.the("Input para nombre")
            .located(By.id("first-name"));
    public static final Target INPUT_LAST_NAME = Target.the("Input para apellido")
            .located(By.id("last-name"));
    public static final Target INPUT_ZIP = Target.the("Input para zip")
            .located(By.id("postal-code"));
    public static final Target BTN_CART = Target.the("Boton para ingresar al carrito")
            .locatedBy("//a[@class='shopping_cart_link']");
    public static final Target TEXT_ORDER = Target.the("Texto que contiene compra exitosa")
            .locatedBy("//h2[@class='complete-header']");
}
