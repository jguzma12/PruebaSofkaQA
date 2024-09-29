package co.com.certifications.sofka.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StartBrowser implements Performable {

    @Override
    @Step("{0} inicia el navegador y navega a la pagina")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().thePageNamed("pages.URLSAUCEDEMO"));
    }

    public static StartBrowser navigateToSpecifiedPage() {
        return instrumented(StartBrowser.class);
    }
}
