package Observer;

import java.util.Observable;


public class SensorTemperatura extends Observable {
    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void registrarLeitura(double novaTemperatura) {
        this.temperatura = novaTemperatura;
        setChanged(); // Marca o sensor como tendo mudado
        notifyObservers(); // Notifica os monitores
    }
}