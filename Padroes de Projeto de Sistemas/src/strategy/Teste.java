package Strategy;

public class Teste {

    public static void main(String[] args) {

        Programador programador = new Programador();

        programador.setPrograma(new Java());

        programador.realizarPrograma();

    }
}
