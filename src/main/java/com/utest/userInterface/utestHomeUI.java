package com.utest.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class utestHomeUI {
    public static Target BTN_UNIRSE = Target.the("Boton Unirse").
            locatedBy("//ul[@class='nav navbar-nav']/li/a[contains(text(),'Join Today')]");
    public static Target MJS_EXITOSOREGUISTRO = Target.the("Mensaje Exitoso Reguistro").
            locatedBy("//div[@class='image-box-header']/h1[contains(text(),\"Welcome to the world's largest community of freelance software testers!\")]");
}
