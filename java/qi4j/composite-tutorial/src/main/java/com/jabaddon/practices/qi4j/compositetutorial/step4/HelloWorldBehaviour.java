package com.jabaddon.practices.qi4j.compositetutorial.step4;

import org.qi4j.api.mixin.Mixins;

@Mixins(value = HelloWorldBehaviourMixin.class)
public interface HelloWorldBehaviour {

    public abstract String say();
}
