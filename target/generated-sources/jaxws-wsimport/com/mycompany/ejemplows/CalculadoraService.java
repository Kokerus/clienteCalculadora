
package com.mycompany.ejemplows;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculadoraService", targetNamespace = "http://ejemplows.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculadoraService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ejemplows.mycompany.com/", className = "com.mycompany.ejemplows.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ejemplows.mycompany.com/", className = "com.mycompany.ejemplows.HelloResponse")
    @Action(input = "http://ejemplows.mycompany.com/CalculadoraService/helloRequest", output = "http://ejemplows.mycompany.com/CalculadoraService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param n1
     * @param n2
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suma", targetNamespace = "http://ejemplows.mycompany.com/", className = "com.mycompany.ejemplows.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://ejemplows.mycompany.com/", className = "com.mycompany.ejemplows.SumaResponse")
    @Action(input = "http://ejemplows.mycompany.com/CalculadoraService/sumaRequest", output = "http://ejemplows.mycompany.com/CalculadoraService/sumaResponse")
    public Integer suma(
        @WebParam(name = "n1", targetNamespace = "")
        int n1,
        @WebParam(name = "n2", targetNamespace = "")
        int n2);

    /**
     * 
     * @param n1
     * @param n2
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resta", targetNamespace = "http://ejemplows.mycompany.com/", className = "com.mycompany.ejemplows.Resta")
    @ResponseWrapper(localName = "restaResponse", targetNamespace = "http://ejemplows.mycompany.com/", className = "com.mycompany.ejemplows.RestaResponse")
    @Action(input = "http://ejemplows.mycompany.com/CalculadoraService/restaRequest", output = "http://ejemplows.mycompany.com/CalculadoraService/restaResponse")
    public Integer resta(
        @WebParam(name = "n1", targetNamespace = "")
        int n1,
        @WebParam(name = "n2", targetNamespace = "")
        int n2);

}
