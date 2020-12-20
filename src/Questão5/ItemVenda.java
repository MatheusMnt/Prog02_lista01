package Questão5;

public class ItemVenda {

    //atributos
    private int quantidade;
    private Produto produto;

    //construtores 
    ItemVenda(){
        this.quantidade = 0;
    }

    ItemVenda(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }

    //metodos

    //relaciona a uma quantidade
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;        
    }

    //retorna a quantidade 
    public int getQuantidade() {
        return quantidade;        
    }

    // associa um preço 
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    // retorna o nome do produto da venda 
    public String getProduto(){
        return produto.getNome();
    }

    public double getPrecoProduto(){
        return produto.getPreco();
    }
    
    // calcula o total 
    public double calcularTotal(){
            return quantidade * produto.getPreco();     
    }
    
}
