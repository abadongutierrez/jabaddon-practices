package com.jabaddon.practices.qi4j.compositetutorial.step3;

import org.qi4j.api.injection.scope.This;

public class HelloWorldBehaviourMixin implements HelloWorldBehaviour {
    
    @This
    private HelloWorldState state;

    public String say() {
        return this.state.getPhrase() + " " + this.state.getName();
    }

}
