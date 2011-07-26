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
    private Date fechaInicio;
    
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "S-")
    private Date fechaTermino;

    @NotNull
    @Size(max = 100)
    private String threadName;

    @org.springframework.transaction.annotation.Transactional
    public static Evento crearEvento(String threadName) {
        Evento newEvento = new Evento();
        newEvento.setThreadName(threadName);
        newEvento.setFechaInicio(new Date());
        return newEvento;
    }
    
    @org.springframework.transaction.annotation.Transactional
    public static void terminarEvento(Long idEvento) {
        Evento evento = Evento.findEvento(idEvento);
        evento.setFechaTermino(new Date());
        evento.persist();
    }
}
