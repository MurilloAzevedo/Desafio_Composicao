package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class compra {
    
    final List<item> itens = new ArrayList<>();

    void adicionarItem (produto p, int quantidade){
        this.itens.add(new item(p, quantidade));
    }

    void adicionarItem (String nome, double preco, int quantidade){
        var produto = new produto(nome, preco);
        this.itens.add(new item(produto, quantidade));
    }

    double obterValorTotal(){
        double total = 0;

        for(item item: itens){
            total += item.quantidade * item.produtos.preco;
        }

        return total;
    }
}
