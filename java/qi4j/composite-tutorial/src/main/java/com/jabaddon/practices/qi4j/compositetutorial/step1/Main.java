package com.jabaddon.practices.qi4j.compositetutorial.step1;

/**
 * <p>
 * La clase HelloWorld ahora no es utilizada via la implementacion sino via la interfaz.
 * </p>
 * @author Abaddon
 *
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Ejemplo usando la interface que mezcla el comportamiento y el estado del objeto
         */
        HelloWorld hw = new HelloWorldMixin();
        hw.setPhrase("Hola");
        hw.setName("Abaddon");
        System.out.println(hw.say());
        
        /*
         * Ejemplo usando individualmente las interfaces que muestran los metodos
         * necesarios para modificar el estado del objeto y los metodos para ejecutar
         * el comportamiento del objeto
         */
        HelloWorldMixin hw2 = new HelloWorldMixin();
        HelloWorldState hw2State = hw2;
        hw2State.setPhrase("Hola de nuevo");
        hw2State.setName("Abaddon");
        System.out.println(((HelloWorldBehaviour) hw2).say());
    }

}
