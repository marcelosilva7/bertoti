package Composite;

class UnidadeTerrestre implements UnidadeMilitar {
    private String nome;

    public UnidadeTerrestre(String nome) {
        this.nome = nome;
    }

    @Override
    public void relatorio() {
        System.out.println("Unidade Terrestre: " + nome);
    }
}