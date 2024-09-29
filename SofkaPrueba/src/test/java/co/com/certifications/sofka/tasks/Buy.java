package co.com.certifications.sofka.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.certifications.sofka.userinterfaces.ProductsPage.*;


public class Buy {
    public static Performable dosObjetos(List<Map<String, String>> datos) {
        return Task.where("{0} Compra de la maleta y camiseta",
                actor -> {
                    actor.attemptsTo(
                            Click.on(BTN_ADD_BACKPACK),
                            Click.on(BTN_ADD_SHIRT),
                            Click.on(BTN_CART),
                            Click.on(BTN_CHECKOUT),
                            Enter.theValue(datos.get(0).get("name")).into(INPUT_NAME),
                            Enter.theValue(datos.get(0).get("lastName")).into(INPUT_LAST_NAME),
                            Enter.theValue(datos.get(0).get("zip")).into(INPUT_ZIP),
                            Click.on(BTN_CONTINUE),
                            Click.on(BTN_FINISH)

                    );
                }
        );
    }
}
