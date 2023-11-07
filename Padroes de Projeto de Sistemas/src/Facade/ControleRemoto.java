package Facade;

class ControleRemoto {
    private Amplificador amplificador;
    private TV tv;
    private DVDPlayer dvdPlayer;

    public ControleRemoto() {
        amplificador = new Amplificador();
        tv = new TV();
        dvdPlayer = new DVDPlayer();
    }

    public void assistirFilme() {
        System.out.println("Preparando para assistir um filme...");
        amplificador.ligar();
        amplificador.desligar();  // Amplificador não está sendo utilizado aqui
        tv.ligar();
        dvdPlayer.ligar();
    }

    public void pararFilme() {
        System.out.println("Parando o filme...");
        amplificador.desligar();
        tv.desligar();
        dvdPlayer.desligar();
    }
}
