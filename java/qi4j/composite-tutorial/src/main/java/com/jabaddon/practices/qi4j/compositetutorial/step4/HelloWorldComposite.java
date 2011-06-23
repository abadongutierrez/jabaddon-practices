package com.jabaddon.practices.qi4j.compositetutorial.step4;

import org.qi4j.api.composite.TransientComposite;
import org.qi4j.api.mixin.Mixins;

import com.jabaddon.practices.qi4j.compositetutorial.step4.HelloWorld;

public interface HelloWorldComposite extends HelloWorld, TransientComposite {

}
