package com.example.demilio.myapplication;

public class Negocio {

    private String name;
//    private int phone;
    /** Agregar mas campos, estructura del json que se almacena en firebase
     *
      */
    public Negocio(){}

    public Negocio(String name){
        this.name = name;
//        this.phone = phone;
    }

    public String getName(){ return name; }
    public void setName(String name) {this.name = name; }
/*
    public int getPhone(){ return phone; }
    public void setPhone(int phone){this.phone = phone;}*/

}

