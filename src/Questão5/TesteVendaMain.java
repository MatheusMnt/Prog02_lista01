package Questão5;

public class TesteVendaMain {
    public static void main(String[] args) {
        
        // geranedo objetos Produto
        Produto produto01 = new Produto(01, "Produto 01", "Produto01", 10.00);
        Produto produto02 = new Produto(02, "Produto 02", "Produto02", 5.00);
        Produto produto03 = new Produto(03, "Produto 03", "Produto03", 20.00);
        Produto produto04 = new Produto(04, "Produto 04", "Produto04", 15.00);

        //gerando itemVenda
        ItemVenda itemVenda01 = new ItemVenda();
            itemVenda01.setQuantidade(10); itemVenda01.setProduto(produto01);
        ItemVenda itemVenda02 = new ItemVenda();
            itemVenda02.setQuantidade(5); itemVenda02.setProduto(produto02);
        ItemVenda itemVenda03 = new ItemVenda();
            itemVenda03.setQuantidade(10); itemVenda03.setProduto(produto03);
        ItemVenda itemVenda04 = new ItemVenda();
            itemVenda04.setQuantidade(2); itemVenda04.setProduto(produto04);

        //gerando cliente
        Cliente cliente = new Cliente();
            cliente.setCPF("12345678910");
            cliente.setNome("José Maria Marques");
            cliente.SetDataDeNascimento("21/09/1994");

        //gerando venda
        Venda venda = new Venda();
            venda.setAtendente("Maria Dolores Sampaio");
            venda.setData("23/12/2020");

        //associando cliente   
        venda.setCliente(cliente);

        //associando itens a venda 
        venda.adicionarItem(itemVenda01);
        venda.adicionarItem(itemVenda02);
        venda.adicionarItem(itemVenda03);
        venda.adicionarItem(itemVenda04);


        //listando compra
        venda.listarItensVenda();

        
    }
}
