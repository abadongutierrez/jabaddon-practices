// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.abaddon.practices.powermock.testingsprinroo.dominio;

import java.lang.String;

privileged aspect Persona_Roo_ToString {
    
    public String Persona.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Apellido: ").append(getApellido()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Nombre: ").append(getNombre()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}
