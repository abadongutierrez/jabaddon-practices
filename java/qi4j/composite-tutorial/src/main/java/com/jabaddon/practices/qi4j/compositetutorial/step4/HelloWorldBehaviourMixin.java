package com.jabaddon.practices.qi4j.compositetutorial.step4;

import org.qi4j.api.concern.Concerns;
import org.qi4j.api.injection.scope.This;

/**
 * Se agrega los Concerns que tendra este mixin usando la anotacion @Concers
 * 
 * @author Abaddon
 */
@Concerns(HelloWorldBehaviourConcern.class)
public class HelloWorldBehaviourMixin implements HelloWorldBehaviour {
    
    @This
    private HelloWorldState state;

    public String say() {
        return this.state.getPhrase() + " " + this.state.getName();
    }

}
