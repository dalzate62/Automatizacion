package com.utest.Questions;

import com.utest.userInterface.utestHomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class utestValidacionReguistro implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return utestHomeUI.MJS_EXITOSOREGUISTRO.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new utestValidacionReguistro();
    }


}
