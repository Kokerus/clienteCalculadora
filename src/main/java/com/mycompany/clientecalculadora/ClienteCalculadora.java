/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clientecalculadora;

/**
 *
 * @author Felix
 */
public class ClienteCalculadora {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        try { // Call Web Service Operation
            com.mycompany.ejemplows.CalculadoraService_Service service = new com.mycompany.ejemplows.CalculadoraService_Service();
            com.mycompany.ejemplows.CalculadoraService port = service.getCalculadoraServicePort();
            // TODO initialize WS operation arguments here
            int n1 = 5;
            int n2 = 5;
            // TODO process result here
            java.lang.Integer result = port.suma(n1, n2);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        
        try { // Call Web Service Operation
            com.mycompany.ejemplows.CalculadoraService_Service service = new com.mycompany.ejemplows.CalculadoraService_Service();
            com.mycompany.ejemplows.CalculadoraService port = service.getCalculadoraServicePort();
            // TODO initialize WS operation arguments here
            int n1 = 10;
            int n2 = 5;
            // TODO process result here
            java.lang.Integer result = port.resta(n1, n2);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        
        try { // Call Web Service Operation
            com.mycompany.ejemplows.CalculadoraService_Service service = new com.mycompany.ejemplows.CalculadoraService_Service();
            com.mycompany.ejemplows.CalculadoraService port = service.getCalculadoraServicePort();
            // TODO initialize WS operation arguments here
            java.lang.String name = "Felix";
            // TODO process result here
            java.lang.String result = port.hello(name);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
}
