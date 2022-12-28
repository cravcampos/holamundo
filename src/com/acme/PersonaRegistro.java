package com.acme;

public record PersonaRegistro (String nombre, String apellidos){

    @Override
    public String toString() {
        //victor comente la linea de codigo la cual considero eliminar
        //System.out.println("Esta instruccion es inservible");
        return "%s %s".formatted(nombre, apellidos);
    }
}
