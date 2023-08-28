package com.utest.task;

import com.utest.userInterface.utestReguistroUI;
import com.utest.util.EsperaImplicita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class utestReguistroPasoDosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        EsperaImplicita espera = new EsperaImplicita();
        espera.esperasImplicitas(5);
        actor.attemptsTo(
                Click.on(utestReguistroUI.BTN_SIGUIENTEDOS)
        );
    }

    public static Performable utestReguistroPasoDosTask(){
        return instrumented(utestReguistroPasoDosTask.class);
    }
}
