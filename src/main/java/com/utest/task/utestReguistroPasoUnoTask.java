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

    private final String nombre;
    private final String apellido;
    private final String email;
    private final String mes;
    private final Integer dia;
    private final Integer ano;
    public utestReguistroPasoUnoTask(String nombre, String apellido, String email, String mes, Integer dia, Integer ano){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(nombre).into(utestReguistroUI.TXT_NOMBRE),
                SendKeys.of(apellido).into(utestReguistroUI.TXT_APELLIDO),
                SendKeys.of(email).into(utestReguistroUI.TXT_EMAIL),
                SelectFromOptions.byVisibleText(mes).from(utestReguistroUI.SELECT_MES),
                SelectFromOptions.byVisibleText(String.valueOf(dia)).from(utestReguistroUI.SELECT_DIA),
                SelectFromOptions.byVisibleText(String.valueOf(ano)).from(utestReguistroUI.SELECT_ANO),
                Click.on(utestReguistroUI.BTN_SIGUIENTEUNO)
        );
    }

    public static Performable utestReguistroPasoUnoTasks(String nombre,String apellido, String email, String mes, Integer dia, Integer ano){
        return instrumented(utestReguistroPasoUnoTask.class,nombre,apellido,email,mes,dia,ano);
    }
}
