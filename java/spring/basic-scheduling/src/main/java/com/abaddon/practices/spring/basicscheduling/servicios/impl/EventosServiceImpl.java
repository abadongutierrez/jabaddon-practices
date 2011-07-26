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

    @Scheduled(cron = "0 */1 * * * *")
    @org.springframework.transaction.annotation.Transactional
    public void generarEventoCron() {
        Long idEvento = generarEvento("-cron1");
        esperaAlgunosSegundos(10);
        terminarEvento(idEvento);
    }
    
    @Scheduled(cron = "0 */1 * * * *")
    @org.springframework.transaction.annotation.Transactional
    public void generarEventoCron2() {
        Long idEvento = generarEvento("-cron2");
        esperaAlgunosSegundos(10);
        terminarEvento(idEvento);     
    }
    
    @Scheduled(cron = "0 */1 * * * *")
    @org.springframework.transaction.annotation.Transactional
    public void generarEventoCron3() {
        Long idEvento = generarEvento("-cron3");
        esperaAlgunosSegundos(10);
        terminarEvento(idEvento);
    }
    
    private void terminarEvento(Long idEvento) {
        Evento.terminarEvento(idEvento);
    }
    
    private void esperaAlgunosSegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Long generarEvento(String postfijo) {
        Evento newEvento = Evento.crearEvento(Thread.currentThread().getName() + postfijo);
        newEvento.persist();
        LOGGER.info("Se ha generado el evento CRON con id [{}]", newEvento.getId());
        return newEvento.getId();
    }
    
    @Scheduled(fixedDelay = 30000)
    @org.springframework.transaction.annotation.Transactional
    public void generarEventoFixedDelay() {
        Long idEvento = generarEvento("-fixeddelay");
        esperaAlgunosSegundos(10);
        terminarEvento(idEvento);
    }
    
    @Scheduled(fixedDelay = 30000)
    @org.springframework.transaction.annotation.Transactional
    public void generarEventoFixedDelay2() {
        Long idEvento = generarEvento("-fixeddelay2");
        esperaAlgunosSegundos(40);
        terminarEvento(idEvento);
    }
    
    //@Scheduled(cron = "0 */2 * * * *")
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
    
    //@Scheduled(cron = "0 */2 * * * *")
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