// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.abaddon.practices.spring.basicscheduling.dominio;

import java.lang.String;
import java.util.Date;

privileged aspect Evento_Roo_JavaBean {
    
    public Date Evento.getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void Evento.setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public String Evento.getThreadName() {
        return this.threadName;
    }
    
    public void Evento.setThreadName(String threadName) {
        this.threadName = threadName;
    }
    
}