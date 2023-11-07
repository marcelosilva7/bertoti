package Facade;

public class teste {

    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        controle.assistirFilme();  // Liga a TV, o player de DVD e o amplificador
        System.out.println("---------------");
        controle.pararFilme();    // Desliga todos os dispositivos
    }

}
