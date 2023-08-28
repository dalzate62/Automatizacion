package com.utest.task;

import com.utest.userInterface.utestReguistroUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class utestReguistroPasoUnoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("kuy").into(utestReguistroUI.TXT_NOMBRE),
                SendKeys.of("bf").into(utestReguistroUI.TXT_APELLIDO),
                SendKeys.of("fz@zx.com").into(utestReguistroUI.TXT_EMAIL),
                SelectFromOptions.byVisibleText("October").from(utestReguistroUI.SELECT_MES),
                SelectFromOptions.byVisibleText("12").from(utestReguistroUI.SELECT_DIA),
                SelectFromOptions.byVisibleText("1998").from(utestReguistroUI.SELECT_ANO),
                Click.on(utestReguistroUI.BTN_SIGUIENTEUNO)
        );
    }

    public static Performable utestReguistroPasoUnoTask(){
        return instrumented(utestReguistroPasoUnoTask.class);
    }
}
