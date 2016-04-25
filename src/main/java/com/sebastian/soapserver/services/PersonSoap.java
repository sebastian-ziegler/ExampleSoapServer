/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastian.soapserver.services;

import com.sebastian.soapserver.models.Person;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sebastian
 */
@WebService(serviceName = "PersonSoap")
public class PersonSoap {
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchPerson")
    public Person searchPerson(@WebParam(name = "identification") String identification) {
        Person person = new Person();
        if (identification.equals("12345")) {
            person.setCi("12345");
            person.setName("Jon");
            person.setLastName("Snow");
            person.setStatusCode("0");
            
            return person;
        } else {
            person.setStatusCode("-1");
            return person;
        }
    }
}
