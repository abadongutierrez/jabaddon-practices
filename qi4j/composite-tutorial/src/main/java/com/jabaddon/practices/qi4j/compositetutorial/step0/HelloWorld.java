package com.jabaddon.practices.qi4j.compositetutorial.step0;

/**
 * <p>Clase normal que tiene estado (atributos) y comportamiento (metodos).</p>
 * <p>A tipical class with estate (attributes) and behaviour (methods).</p>
 * 
 * @author Abaddon
 */
public class HelloWorld {
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