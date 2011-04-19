package com.jabaddon.practices.qi4j.compositetutorial.step2;

import org.qi4j.api.composite.TransientComposite;
import org.qi4j.api.mixin.Mixins;

import com.jabaddon.practices.qi4j.compositetutorial.step2.HelloWorld;

@Mixins(value = HelloWorldMixin.class)
public interface HelloWorldComposite extends HelloWorld, TransientComposite {

}
