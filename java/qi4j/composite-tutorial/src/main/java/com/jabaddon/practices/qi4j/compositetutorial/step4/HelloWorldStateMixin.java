package com.jabaddon.practices.qi4j.compositetutorial.step4;

public class HelloWorldStateMixin implements HelloWorldState {
    
    private String name;
    private String phrase;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }

}
