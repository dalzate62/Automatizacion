package com.utest.stepDefinition;

import com.utest.Questions.utestValidacionReguistro;
import com.utest.task.*;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;


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

    @Cuando("^Reguistrare mis datos (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void reguistrareMisDatos(String nombre,String apellido, String email, String mes, Integer dia, Integer ano,String contrasena, String confcontrasena){
            theActorInTheSpotlight().attemptsTo(utestReguistroPasoUnoTask.utestReguistroPasoUnoTasks(nombre,apellido,email,mes,dia,ano));
            theActorInTheSpotlight().attemptsTo(utestReguistroPasoDosTask.utestReguistroPasoDosTask());
            theActorInTheSpotlight().attemptsTo(utestReguistroPasoTresTask.utestReguistroPasoTresTask());
            theActorInTheSpotlight().attemptsTo(utestReguistroPasoCuatroTask.utestReguistroPasoCuatroTask(contrasena,confcontrasena));
    }

    @Entonces("valido si el usuario esta creado")
    public void validoSiElUsuarioEstaCreado() {
        String Texto = "Welcome to the world's largest community of freelance software testers!";
        theActorInTheSpotlight().should(
                seeThat("Comparacion de reguistro", utestValidacionReguistro.value(),equalTo(Texto))
        );
    }

}
