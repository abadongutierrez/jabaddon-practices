package com.jabaddon.practices.qi4j.compositetutorial.step1;

public interface HelloWorldState {

    public abstract void setName(String name);

    public abstract String getName();

    public abstract void setPhrase(String phrase);

    public abstract String getPhrase();
}
