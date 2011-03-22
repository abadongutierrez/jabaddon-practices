package com.jabaddon.practices.qi4j.compositetutorial.step1;

/**
 * <p>
 * Ahora la clase implementa una interfaz que define los metodos que contiene la clase y estos
 * metodos seran utilizados via la interfaz y no la clase misma.
 * </p>
 * 
 * @author Abaddon
 */
public class HelloWorldMixin implements HelloWorld {
    private String phrase;
    private String name;

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String say() {
        return this.getPhrase() + " " + this.getName();
    }
}