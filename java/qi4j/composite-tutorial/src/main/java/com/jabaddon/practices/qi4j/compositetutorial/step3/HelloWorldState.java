package com.jabaddon.practices.qi4j.compositetutorial.step3;

import org.qi4j.api.mixin.Mixins;

@Mixins(value = HelloWorldStateMixin.class)
public interface HelloWorldState {

    public abstract void setName(String name);

    public abstract String getName();

    public abstract void setPhrase(String phrase);

    public abstract String getPhrase();
}
