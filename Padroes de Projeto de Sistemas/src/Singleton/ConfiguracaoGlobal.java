package Singleton;

public class ConfiguracaoGlobal {
    private static ConfiguracaoGlobal instance;

    private String nomeAplicativo;
    private String versao;

    private ConfiguracaoGlobal() {
        // Configurações padrão
        nomeAplicativo = "Meu Aplicativo";
        versao = "1.0";
    }

    public static ConfiguracaoGlobal getInstance() {
        if (instance == null) {
            instance = new ConfiguracaoGlobal();
        }
        return instance;
    }

    public String getNomeAplicativo() {
        return nomeAplicativo;
    }

    public void setNomeAplicativo(String nome) {
        nomeAplicativo = nome;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}
