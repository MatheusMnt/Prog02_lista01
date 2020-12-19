package Questão5;

public class ItemVenda {

    //atributos
    private int quantidade;


    //construtores 
    ItemVenda(){
        this.quantidade = 0;
    }

    ItemVenda(int quantidade){
        this.quantidade = quantidade;
    }

    //metodos
    public double calcularTotal(){
        
        return quantidade * produto.getPreco();
    }
    
}
