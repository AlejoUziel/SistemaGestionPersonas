package com.mycompany.personas;

public class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "deporte='" + deporte + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                '}';
    }
}
