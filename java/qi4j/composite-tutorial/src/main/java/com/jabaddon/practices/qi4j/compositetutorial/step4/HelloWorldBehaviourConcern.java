package com.jabaddon.practices.qi4j.compositetutorial.step4;

import org.qi4j.api.concern.ConcernOf;

/**
 * El Concern es creado heredando de la clase ConcernOf y especificando el tipo de la interfaz
 * que interceptara.
 * 
 * @author Abaddon
 */
public class HelloWorldBehaviourConcern 
    extends ConcernOf<HelloWorldBehaviour> implements HelloWorldBehaviour {

    public String say() {
        return "Simon dice:" + this.next.say();
    }

}
