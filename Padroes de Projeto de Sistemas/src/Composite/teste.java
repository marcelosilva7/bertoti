package Composite;

public class teste {


    public static void main(String[] args) {
        UnidadeMilitar unidadeTerrestre1 = new UnidadeTerrestre("Exército Terrestre 1");
        UnidadeMilitar unidadeTerrestre2 = new UnidadeTerrestre("Exército Terrestre 2");

        UnidadeMilitar unidadeMaritima1 = new UnidadeMaritima("Marinha 1");
        UnidadeMilitar unidadeMaritima2 = new UnidadeMaritima("Marinha 2");

        FrotaMilitar frotaMaritima = new FrotaMilitar("Frota Marítima");
        frotaMaritima.adicionarUnidade(unidadeMaritima1);
        frotaMaritima.adicionarUnidade(unidadeMaritima2);

        FrotaMilitar frotaPrincipal = new FrotaMilitar("Forças Armadas");
        frotaPrincipal.adicionarUnidade(unidadeTerrestre1);
        frotaPrincipal.adicionarUnidade(unidadeTerrestre2);
        frotaPrincipal.adicionarUnidade(frotaMaritima);

        frotaPrincipal.relatorio();

    }

}
