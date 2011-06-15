package com.jabaddon.practices.restassured;

import java.text.MessageFormat;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.path.xml.XmlPath;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class RestAssuredTest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(RestAssuredTest.class);
    
    @Test
    public void debeValidarElTextoDeUnaEtiquetaXml() {
        String xml = "<data><name>Rafael</name></data>";
        String name = XmlPath.with(xml).get("data.name");
        LOGGER.info(MessageFormat.format("El nombres es [{0}]", name));
        assertThat(name, is(notNullValue()));
        assertThat(name, is("Rafael"));
    }
    
    @Test
    public void debeValidarElTextoDeUnaPropiedadEnUnJson() {
        String json = "{ cliente: { nombre: 'Rafael' } }";
        String name = JsonPath.with(json).get("cliente.nombre");
        LOGGER.info(MessageFormat.format("El nombres es [{0}]", name));
        assertThat(name, is(notNullValue()));
        assertThat(name, is("Rafael"));
    }
}
