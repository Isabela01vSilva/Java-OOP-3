package br.com.exerciciomodulo3.exe5;

public class Circulo implements Forma{
    double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
