package Composite;

class UnidadeMaritima implements UnidadeMilitar {
    private String nome;

    public UnidadeMaritima(String nome) {
        this.nome = nome;
    }

    @Override
    public void relatorio() {
        System.out.println("Unidade Marítima: " + nome);
    }
}
