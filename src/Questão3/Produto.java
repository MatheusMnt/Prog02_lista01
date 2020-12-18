package Questão3;

public class Produto {
    
    // Atríbutos
    public int codigo;
    public String nome;

    //COSTRUTORES
    public Produto () {
         this.codigo = 0000;
         this.nome = "produto";
     }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    //métodos
    public void mudarNome (String nome){
        this.nome = nome;
    }
}
