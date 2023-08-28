package com.utest.stepDefinition;

import com.utest.task.*;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;



public class reguistroUtestStepDefinition {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("Que estoy en la pagina")
    public void queEstoyEnLaPagina() {
        theActorCalled("Robot").wasAbleTo(Open.url("https://utest.com/"));
        theActorInTheSpotlight().attemptsTo(utestHomeTask.utestHomeTask());
    }
    @Cuando("Reguistrare mis datos")
    public void reguistrareMisDatos() {
        theActorInTheSpotlight().attemptsTo(utestReguistroPasoUnoTask.utestReguistroPasoUnoTask());
        theActorInTheSpotlight().attemptsTo(utestReguistroPasoDosTask.utestReguistroPasoDosTask());
        theActorInTheSpotlight().attemptsTo(utestReguistroPasoTresTask.utestReguistroPasoTresTask());
        theActorInTheSpotlight().attemptsTo(utestReguistroPasoCuatroTask.utestReguistroPasoCuatroTask());
    }
    @Entonces("valido si el usuario esta creado")
    public void validoSiElUsuarioEstaCreado() {
        theActorInTheSpotlight().attemptsTo(utestFinalReguistroTask.utestFinalReguistroTask());
    }


}
