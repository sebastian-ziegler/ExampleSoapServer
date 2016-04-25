/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastian.soapserver.models;

/**
 *
 * @author sebastian
 */
public class Person {
    String ci;
    String name;
    String lastName;
    String statusCode;

    public Person() {
    }

    public Person(String ci, String name, String lastName, String statusCode) {
        this.ci = ci;
        this.name = name;
        this.lastName = lastName;
        this.statusCode = statusCode;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    
    
}
