package br.com.exerciciomodulo3.exe5;

public class Quadrado implements Forma{
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
