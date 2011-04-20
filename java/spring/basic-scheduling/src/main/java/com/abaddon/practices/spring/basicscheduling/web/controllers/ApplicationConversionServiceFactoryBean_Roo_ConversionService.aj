// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.abaddon.practices.spring.basicscheduling.web.controllers;

import com.abaddon.practices.spring.basicscheduling.dominio.Evento;
import java.lang.String;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(new EventoConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
    static class com.abaddon.practices.spring.basicscheduling.web.controllers.ApplicationConversionServiceFactoryBean.EventoConverter implements Converter<Evento, String>  {
        public String convert(Evento evento) {
        return new StringBuilder().append(evento.getFechaCreacion()).append(" ").append(evento.getThreadName()).toString();
        }
        
    }
    
}
