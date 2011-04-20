// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.abaddon.practices.spring.basicscheduling.web.controllers;

import com.abaddon.practices.spring.basicscheduling.dominio.Evento;
import java.io.UnsupportedEncodingException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.joda.time.format.DateTimeFormat;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect EventoController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST)
    public String EventoController.create(@Valid Evento evento, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("evento", evento);
            addDateTimeFormatPatterns(uiModel);
            return "eventoes/create";
        }
        uiModel.asMap().clear();
        evento.persist();
        return "redirect:/eventoes/" + encodeUrlPathSegment(evento.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String EventoController.createForm(Model uiModel) {
        uiModel.addAttribute("evento", new Evento());
        addDateTimeFormatPatterns(uiModel);
        return "eventoes/create";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String EventoController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("evento", Evento.findEvento(id));
        uiModel.addAttribute("itemId", id);
        return "eventoes/show";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String EventoController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            uiModel.addAttribute("eventoes", Evento.findEventoEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Evento.countEventoes() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("eventoes", Evento.findAllEventoes());
        }
        addDateTimeFormatPatterns(uiModel);
        return "eventoes/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String EventoController.update(@Valid Evento evento, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("evento", evento);
            addDateTimeFormatPatterns(uiModel);
            return "eventoes/update";
        }
        uiModel.asMap().clear();
        evento.merge();
        return "redirect:/eventoes/" + encodeUrlPathSegment(evento.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
    public String EventoController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("evento", Evento.findEvento(id));
        addDateTimeFormatPatterns(uiModel);
        return "eventoes/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String EventoController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Evento.findEvento(id).remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/eventoes";
    }
    
    @ModelAttribute("eventoes")
    public Collection<Evento> EventoController.populateEventoes() {
        return Evento.findAllEventoes();
    }
    
    void EventoController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("evento_fechacreacion_date_format", DateTimeFormat.patternForStyle("S-", LocaleContextHolder.getLocale()));
    }
    
    String EventoController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        }
        catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}