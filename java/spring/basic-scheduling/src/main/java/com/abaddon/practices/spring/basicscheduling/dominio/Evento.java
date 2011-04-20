package com.abaddon.practices.spring.basicscheduling.dominio;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooEntity
public class Evento {

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "S-")
    private Date fechaCreacion;

    @NotNull
    @Size(max = 100)
    private String threadName;

    public static Evento crearEvento(String threadName) {
        Evento newEvento = new Evento();
        newEvento.setThreadName(threadName);
        newEvento.setFechaCreacion(new Date());
        return newEvento;
    }
}
