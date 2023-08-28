package com.utest.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class utestReguistroUI {
    //Paso uno
    public static Target TXT_NOMBRE= Target.the("Texto Nombre").located(By.id("firstName"));
    public static Target TXT_APELLIDO= Target.the("Texto Apellido").located(By.id("lastName"));
    public static Target TXT_EMAIL= Target.the("Texto Email").located(By.id("email"));
    //Año de nacimiento
    public static Target SELECT_MES= Target.the("Texto Email").located(By.id("birthMonth"));
    public static Target SELECT_DIA= Target.the("Texto Email").located(By.id("birthDay"));
    public static Target SELECT_ANO= Target.the("Texto Email").located(By.id("birthYear"));
    public static Target BTN_SIGUIENTEUNO= Target.the("Boton Siguiente Uno").locatedBy("//div/a[@aria-label='Next step - define your location']");
    //Paso dos
    public static Target BTN_SIGUIENTEDOS= Target.the("Boton Siguiente Dos").locatedBy("//div/a[@aria-label='Next step - select your devices']");
    //Paso tres
    public static Target BTN_SIGUIENTETRES= Target.the("Boton Siguiente Tres").locatedBy("//div/a[@aria-label='Next - final step']");
    //Paso cuatro
    public static Target TXT_CONTRASENA= Target.the("Texto CONTRASENA").located(By.id("password"));
    public static Target TXT_VERIFICACIONCONTRASENA= Target.the("Texto VECONTRASENA").located(By.id("confirmPassword"));
    public static Target BTN_SIGUIENTECUATRO= Target.the("Boton Siguiente Tres").locatedBy("//div/a[@aria-label='Complete Setup']");
    public static Target CHK_TERMINOSCONDICIONES= Target.the("Check Terminos condiciones").located(By.id("termOfUse"));
    public static Target CHK_PRIVACIDAD= Target.the("Check Privacidad").located(By.id("privacySetting"));


}
