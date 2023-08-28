package com.utest.task;

import com.utest.userInterface.utestReguistroUI;
import com.utest.util.EsperaImplicita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.CheckCheckbox;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class utestReguistroPasoCuatroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        EsperaImplicita espera = new EsperaImplicita();
        actor.attemptsTo(
                SendKeys.of("123456789A-Raul34567").into(utestReguistroUI.TXT_CONTRASENA),
                SendKeys.of("123456789A-Raul34567").into(utestReguistroUI.TXT_VERIFICACIONCONTRASENA),
                CheckCheckbox.of(utestReguistroUI.CHK_TERMINOSCONDICIONES),
                CheckCheckbox.of(utestReguistroUI.CHK_PRIVACIDAD),
                Click.on(utestReguistroUI.BTN_SIGUIENTECUATRO)
        );
        espera.esperasImplicitas(5);
    }

    public static Performable utestReguistroPasoCuatroTask(){
        return instrumented(utestReguistroPasoCuatroTask.class);
    }
}
