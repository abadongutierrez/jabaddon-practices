package com.jabaddon.practices.qi4j.compositetutorial.step0;

/**
 * 
 * @author Abaddon
 *
 */
public class Main {
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.setPhrase("Hola");
        hw.setName("Abaddon");
        System.out.println(hw.say());
    }

}
