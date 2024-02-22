/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estructura.listassimplesjezer;

/**
 *
 * @author JEZER ESTRADA
 */
public class Nodo {
    int dato;
    Nodo siguiente; //referencia al siguiente nodo en la lista
    
    //constructor para crear un nuevo nodo para el valor que le vamos a proporcionar
    public Nodo(int dato){
        //inicializamos como un valor nulo
        this.dato=dato; //inicializamos el nodo
        this.siguiente=null; //inicializamos el siguiente nodo como nulo
    }
}
