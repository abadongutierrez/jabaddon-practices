package com.jabaddon.practices.hamcrest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.isOneOf;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;

/**
 * Prueba para validar el uso de Hamcrest para expresar mejor los asserts.
 * @author Rafael Antonio Guti&eacute;rrez Turullols
 */
public class HamcrestTest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(HamcrestTest.class);

    @Test
    public void debeCompararUsandoIs() {
        Long longValue = new Long(5);
        // Usando junit
        assertEquals(new Long(5L), longValue);
        // Usando hamcrest
        assertThat(longValue, is(4L));
    }
    
    @Test
    public void debeCompararUsandoEqualTo() {
        Long longValue = new Long(10L);
        assertThat(longValue, equalTo(10L));
    }
    
    @Test
    public void debeCompararCadenasExactamente() {
        String cadena = "Esta es una cadena";
        assertThat(cadena, equalTo("Esta es una cadena"));        
    }
    
    @Test
    public void debeCompararCadenasIgnorandoMayusculasYMinusculas() {
        String cadena = "Esta es una cadena";
        assertThat(cadena, equalToIgnoringCase("Esta es UNa CADENa"));        
    }
    
    @Test
    public void debeValidarQueLaListaContengaElElemento() {
        List<String> lista = new ArrayList<String>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");        
        assertThat(lista, hasItem("Uno"));
        assertThat(lista, hasItems("Dos", "Tres"));
    }
    
    @Test
    public void debeValidarQueSeaAlgunoDe() {
        assertThat(5L, isOneOf(4L, 3L, 5L));
    }
    
    @Test
    public void debeValidarNulosYNoNulos() {
        String cadena = null;
        assertThat(cadena, is(nullValue()));
        cadena = "valor";
        assertThat(cadena, is(not(nullValue())));
        assertThat(cadena, is(notNullValue()));
    }
    
    @Test
    public void debeValidarUsandoTodosLosMatchers() {
        List<String> lista = org.op4j.Op.on(new String[]{"1", "2", "3"}).toList().get();        
        assertThat(lista, allOf(hasItems("1", "3"), hasItem("3")));
    }
    
    @Test
    public void debeValidarUsandoAlgunoDeLosMatchers() {
        List<String> lista = org.op4j.Op.on(new String[]{"1", "2", "3"}).toList().get();
        assertThat(lista, anyOf(hasItem("5"), hasItem("10"), hasItem("1")));
    }
    
    @Test
    public void debeValidarCualquiercosa() {
        String cadena = "cadena";
        assertThat(cadena, is(anything()));
    }
    
    @Test
    public void debeValidarUnaCadenaQueComienzaConYTerminaCon() {
        String cadena = "isCadenaNot";
        assertThat(cadena, startsWith("is"));
        assertThat(cadena, endsWith("Not"));
        assertThat(cadena, allOf(startsWith("is"), endsWith("Not")));
    }
}
