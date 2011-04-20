package com.abaddon.practices.spring.basicscheduling.web.controllers;

import com.abaddon.practices.spring.basicscheduling.dominio.Evento;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "eventoes", formBackingObject = Evento.class)
@RequestMapping("/eventoes")
@Controller
public class EventoController {
}
