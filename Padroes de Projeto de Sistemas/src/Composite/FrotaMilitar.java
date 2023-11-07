package Composite;

import java.util.ArrayList;
import java.util.List;

class FrotaMilitar implements UnidadeMilitar {
    private String nome;
    private List<UnidadeMilitar> unidades = new ArrayList<>();

    public FrotaMilitar(String nome) {
        this.nome = nome;
    }

    public void adicionarUnidade(UnidadeMilitar unidade) {
        unidades.add(unidade);
    }

    @Override
    public void relatorio() {
        System.out.println("Frota Militar: " + nome);
        for (UnidadeMilitar unidade : unidades) {
            unidade.relatorio();
        }
    }
}
