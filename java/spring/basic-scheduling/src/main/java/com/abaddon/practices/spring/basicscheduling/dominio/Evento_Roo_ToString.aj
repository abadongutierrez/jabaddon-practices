// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.abaddon.practices.spring.basicscheduling.dominio;

import java.lang.String;

privileged aspect Evento_Roo_ToString {
    
    public String Evento.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FechaCreacion: ").append(getFechaCreacion()).append(", ");
        sb.append("ThreadName: ").append(getThreadName());
        return sb.toString();
    }
    
}
