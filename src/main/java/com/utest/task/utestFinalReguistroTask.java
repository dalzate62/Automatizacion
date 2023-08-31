package com.utest.task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
//import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;


import static com.utest.userInterface.utestHomeUI.MJS_EXITOSOREGUISTRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class utestFinalReguistroTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
               // Ensure.that(Text.of(MJS_EXITOSOREGUISTRO).asString().answeredBy(actor)).isEqualTo("Welcome to the world's largest community of freelance software testers!")
        );
    }

    public static Performable utestFinalReguistroTask(){
        return instrumented(utestFinalReguistroTask.class);
    }
}
