package com.abaddon.practices.spring.basicscheduling.servicios.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.abaddon.practices.spring.basicscheduling.dominio.Evento;
import com.abaddon.practices.spring.basicscheduling.servicios.EventosService;

@Service(value = "eventosService")
public class EventosServiceImpl implements EventosService {
    
    public static final Logger LOGGER = LoggerFactory.getLogger(EventosServiceImpl.class); 

    @Scheduled(cron = "0 */2 * * * *")
    public void generarEventoCron() {
        LOGGER.info("Generando el evento CRON...");
        Evento newEvento = Evento.crearEvento(Thread.currentThread().getName() + "-cron");
        newEvento.persist();
        LOGGER.info("Se ha generado el evento CRON con id [{}]", newEvento.getId());
    }
    
    @Scheduled(cron = "0 */2 * * * *")
    public void generarEventoCron2() {
        LOGGER.info("Generando el evento CRON2...");
        Evento newEvento = Evento.crearEvento(Thread.currentThread().getName() + "-cron2");
        newEvento.persist();
        LOGGER.info("Se ha generado el evento CRON2 con id [{}]", newEvento.getId());
    }
    
    @Scheduled(cron = "0 */2 * * * *")
    public void generarEventoCron3() {
        LOGGER.info("Generando el evento CRON3...");
        Evento newEvento = Evento.crearEvento(Thread.currentThread().getName() + "-cron3");
        newEvento.persist();
        LOGGER.info("Se ha generado el evento CRON3 con id [{}]", newEvento.getId());
    }
    
    @Scheduled(fixedDelay = 30000)
    public void generarEventoFixedDelay() {
        LOGGER.info("Generando el evento FIXED DELAY...");
        Evento newEvento = Evento.crearEvento(Thread.currentThread().getName() + "-fidexdelay");
        newEvento.persist();
        LOGGER.info("Se ha generado el evento FIXED DELAY con id [{}]", newEvento.getId());
    }
    
    @Scheduled(cron = "0 */2 * * * *")
    public void generarEventosSincrono() {
        for (int i = 0; i < 100; ++i) {
            Evento newEvento = Evento.crearEvento(Thread.currentThread().getName() + "-cronEventosSinc-" + i);
            newEvento.persist();
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Scheduled(cron = "0 */2 * * * *")
    public void generarEventosAsincrono() {
        for (int i = 0; i < 100; ++i) {
            generarEvento(i);
        }
    }
    
    @Async
    public void generarEvento(int num) {
        Evento newEvento = Evento.crearEvento(Thread.currentThread().getName() + "-cronEventosAsinc-" + num);
        newEvento.persist();
        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
