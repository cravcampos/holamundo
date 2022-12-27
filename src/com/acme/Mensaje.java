package com.acme;

import java.util.Scanner;

public class Mensaje {

    public String solicitaDatos(String mensaje){
        System.out.print(mensaje);
        Scanner sn = new Scanner(System.in);
        return sn.nextLine();
    }

    public void saludar(String nombre) {
        System.out.printf("Hola %s, bienvenido a java \n", nombre);
    }
}
