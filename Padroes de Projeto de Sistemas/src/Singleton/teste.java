package Singleton;

public class teste {
    public static void main(String[] args) {
        ConfiguracaoGlobal configuracao = ConfiguracaoGlobal.getInstance();

        // Acesse e modifique as configurações em qualquer lugar do aplicativo
        System.out.println("Nome do Aplicativo: " + configuracao.getNomeAplicativo());
        System.out.println("Versão: " + configuracao.getVersao());

        configuracao.setNomeAplicativo("Novo Aplicativo");
        configuracao.setVersao("2.0");

        // Verifique as alterações
        System.out.println("Nome do Aplicativo: " + configuracao.getNomeAplicativo());
        System.out.println("Versão: " + configuracao.getVersao());
    }
}
