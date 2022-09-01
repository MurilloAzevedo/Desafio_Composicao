package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class cliente {
    
    final String nome;
    final List<compra> compras = new ArrayList<>();

    cliente(String nome){
        this.nome = nome;
    }

    void adicionarCompra(compra compra){
        this.compras.add(compra);
    }


    double obterValorTotal(){
        double total = 0;

        for(compra compra: compras){
            total += compra.obterValorTotal();
        }

        return total;
    }
}
