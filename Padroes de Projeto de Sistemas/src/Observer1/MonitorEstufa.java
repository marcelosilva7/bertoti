package Observer1;

import java.util.Observable;
import java.util.Observer;

public class MonitorEstufa implements Observer {
    private String nome;

    public MonitorEstufa(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable observado, Object arg) {
        if (observado instanceof SensorTemperatura) {
            SensorTemperatura sensor = (SensorTemperatura) observado;
            System.out.println("Monitor " + nome + " - Temperatura atual: " + sensor.getTemperatura() + "°C");
        }
    }


}

