package edu.fatec.lp2.exercicio2;

import jdk.jfr.DataAmount;


public class ItemCompra implements Calculavel{
    private Integer quantidade;

    private Produto produto;

    private double desconto;

    Cada item de compra terá a quantidade adquirida e um desconto que pode variar de 0 ao descontoMaximo

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if(desconto <= produto.getDescontoMaximo()){
            this.desconto = desconto;
        }
    }


    @Override
    public double calcularPreco(){
        return 0;
    }

}
