package com.utest.task;

import com.utest.userInterface.utestHomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class utestHomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(utestHomeUI.BTN_UNIRSE)
        );
    }

    public static Performable utestHomeTask(){
        return instrumented(utestHomeTask.class);
    }

}
