package oo.composicao.desafio;

public class clienteTeste {
    
    public static void main(String[] args) {
        cliente cliente = new cliente("Murillo José");

        compra compra1 = new compra();
        compra1.adicionarItem("Caneta", 9.58, 4);
        compra1.adicionarItem("PC", 2578.50, 2);
        
        compra compra2 = new compra();
        compra2.adicionarItem("Caderno", 15, 3);
        compra2.adicionarItem("Mochila", 90.90, 1);

        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
