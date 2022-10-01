package com.example.manejo_de_cuestionarios;

public class Respuestas {


  private String nombre;
  private int punteo;
  private int pin;


    public Respuestas(String nombre, int pin) {
        this.nombre = nombre;
        this.punteo = punteo;
        this.pin = pin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }




}
