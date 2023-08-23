package strategy;

public class Teste {

    public static void main(String[] args) {

        Programador programador = new Programador();

        programador.setProgramar(new Java());

        programador.realizarProgramar();

    }
}
