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
    public int getCodigo() {
        return codigo; 
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;   
    }

    public String getNome() {
        return nome;    
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco; 
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
}
