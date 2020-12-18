package Questão3;

public class Estoque{

    //Atríbutos
    private Produto produto;
     private int qtdAtual;
     private int qtdMinima;
   

    //construtores 
    public Estoque (){
        this.produto = new Produto();
        this.qtdAtual = 0;
        this.qtdMinima = 0;
        
    }

    public Estoque (Produto produto,int qtdAtual ,int qtdMinima ){
        this.produto = produto;
        this.qtdMinima = qtdMinima;
        this.qtdAtual = qtdAtual;
    }

    //métodos
    public void mudarQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void reporEstoque (int qtd) {
       this.qtdAtual += qtd;
    }

    public void darBaixa(int qtd) {
        this.qtdAtual -= qtd;   
    }

    public void relatorio() {
        System.out.print("\n");
        System.out.println("Nome do Produto: " + produto.nome);
        System.out.println("Codigo do Produto: " + produto.codigo);
        System.out.println("Quantidade Atual: " + qtdAtual);
        System.out.println("Quantidade Mínima: " + qtdMinima);
        System.out.print("\n");
        
    }
}