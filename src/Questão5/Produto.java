package Questão5;


public class Produto {
    
    //Atributos 
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;


    //cosntrutores
    public Produto(){
        this.codigo = 00;
        this.nome = "produto";
        this.descricao = "Produto qualquer";
        this.preco = 0.0;
    }

    public Produto(int codigo, String nome, String descricao, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    //metodos 

    //retorna o código do produto 
    public int getCodigo() {
        return codigo; 
    }

    //associa um código ao produto 
    public void setCodigo(int codigo) {
        this.codigo = codigo;   
    }

    //retrona o nome do produto 
    public String getNome() {
        return nome;    
    }

    //associa um nomme ao produto
    public void setNome(String nome){
        this.nome = nome;
    }

    //retorna a descrição do produto
    public String getDescricao(){
        return descricao;
    }

    //associa uma descrição ao produto 
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    //retorna o preço do produto 
    public double getPreco() {
        return preco; 
    }

    //associa um preço ao produto 
    public void setPreco(double preco){
        this.preco = preco;
    }
}
