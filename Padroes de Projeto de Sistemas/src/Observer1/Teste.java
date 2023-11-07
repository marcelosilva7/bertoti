package Observer;

public class Teste {

    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();
        MonitorEstufa monitor1 = new MonitorEstufa("Monitor 1");
        MonitorEstufa monitor2 = new MonitorEstufa("Monitor 2");

        sensor.addObserver(monitor1);
        sensor.addObserver(monitor2);

        sensor.registrarLeitura(25.5); // Notifica os monitores sobre a mudança de temperatura
        sensor.registrarLeitura(26.0); // Notifica os monitores novamente

        sensor.deleteObserver(monitor2); // Remove o monitor2
        sensor.registrarLeitura(27.5); // Apenas monitor1 será notificado
    }


}
