package com.utest.task;

import com.utest.userInterface.utestReguistroUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class utestReguistroPasoTresTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(utestReguistroUI.BTN_SIGUIENTETRES)
        );
    }

    public static Performable utestReguistroPasoTresTask(){
        return instrumented(utestReguistroPasoTresTask.class);
    }
}
