package com.abaddon.practices.powermock.testingsprinroo.dominio;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooEntity
public class Persona {

    @NotNull
    @Size(max = 50)
    private String nombre;

    @NotNull
    @Size(max = 50)
    private String apellido;
}
