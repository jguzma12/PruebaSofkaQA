package co.com.certifications.sofka.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.certifications.sofka.userinterfaces.MainPage.*;


public class Login {
    public static Performable autentication(List<Map<String,String>> datos) {
        return Task.where("{0} inicio de sesion",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(datos.get(0).get("user")).into(INPUT_USER),
                            Enter.theValue(datos.get(0).get("pass")).into(INPUT_PASS),
                            Click.on(BTN_LOGIN)
                     );
                }
        );
    }
}
