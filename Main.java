package com.mycompany.personas;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Persona persona = new Persona("Juan", 30);
        Doctor doctor = new Doctor("Ana", 45, "Cardiologia");
        Deportista deportista = new Deportista("Luis", 25, "Futbol");

        // Imprimir las instancias
        System.out.println(persona);
        System.out.println(doctor);
        System.out.println(deportista);
    }
}
