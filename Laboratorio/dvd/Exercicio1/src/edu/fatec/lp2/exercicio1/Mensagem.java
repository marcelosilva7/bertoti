package edu.fatec.lp2.exercicio1;

 abstract class Mensagem {
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    abstract Mensagem sendMensagem(String mensagem);

    public String toString(){
        return null;
    }
}
