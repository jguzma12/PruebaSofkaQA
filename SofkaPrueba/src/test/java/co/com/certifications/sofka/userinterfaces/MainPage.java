package co.com.certifications.sofka.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target INPUT_USER = Target.the("Input para ingresar el usuario")
            .located(By.id("user-name"));
    public static final Target INPUT_PASS = Target.the("Input para ingresar la contraseña")
            .located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Boton para logearse")
            .located(By.id("login-button"));
}
