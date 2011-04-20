package com.abaddon.practices.spring.basicscheduling.servicios;

public interface EventosService {

    public abstract void generarEvento(int num);

    public abstract void generarEventosAsincrono();

    public abstract void generarEventosSincrono();

    public abstract void generarEventoFixedDelay();

    public abstract void generarEventoCron3();

    public abstract void generarEventoCron2();

    public abstract void generarEventoCron();

}
