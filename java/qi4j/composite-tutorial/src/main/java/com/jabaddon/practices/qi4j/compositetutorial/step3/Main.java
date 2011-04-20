package com.jabaddon.practices.qi4j.compositetutorial.step3;

import org.qi4j.bootstrap.ApplicationAssembler;
import org.qi4j.bootstrap.ApplicationAssembly;
import org.qi4j.bootstrap.ApplicationAssemblyFactory;
import org.qi4j.bootstrap.AssemblyException;
import org.qi4j.bootstrap.Energy4Java;
import org.qi4j.bootstrap.LayerAssembly;
import org.qi4j.bootstrap.ModuleAssembly;
import org.qi4j.spi.structure.ApplicationSPI;

/**
 * <p>
 * La clase HelloWorld ahora no es utilizada via la implementacion sino via la interfaz.
 * </p>
 * @author Abaddon
 *
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Energy4Java qi4j = new Energy4Java();
        ApplicationSPI application = qi4j.newApplication( new ApplicationAssembler() {

            public ApplicationAssembly assemble(ApplicationAssemblyFactory assemblyFactory)
                    throws AssemblyException {
                ApplicationAssembly appAssembly = assemblyFactory.newApplicationAssembly();
                LayerAssembly la = appAssembly.layerAssembly("qi4j-tutorial");
                ModuleAssembly ma = la.moduleAssembly("qi4j-tutorial");
                ma.addTransients(HelloWorldComposite.class);
                return appAssembly;
            }
            
        });
        
        application.activate();
        HelloWorld hw = 
            (HelloWorld) application.findModule("qi4j-tutorial", "qi4j-tutorial")
                .transientBuilderFactory().newTransient(HelloWorldComposite.class);
        hw.setName("Abadon");
        hw.setPhrase("Hola");
        System.out.println(hw.say());
        
        HelloWorldState state = hw;
        state.setName("Abadon2");
        state.setPhrase("Hola de nuevo");
        System.out.println(((HelloWorldBehaviour) hw).say());        
    }

}
