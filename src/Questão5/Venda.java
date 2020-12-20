package Questão5;

import java.time.LocalDate;
import java.time.format.*;
import java.util.ArrayList;

public class Venda {

    //atributos
    private LocalDate data;
    private String atendente;
    private Cliente cliente;
    private ArrayList <ItemVenda> itensVenda = new ArrayList<>();

    //construtores 
    public Venda(){
        this.data = LocalDate.now();
        this.atendente = "Maria";
    }

    public Venda (LocalDate data, String atendente){
        this.data = data;
        this.atendente = atendente;
    }

    //metodos
    public void setAtendente(String atendente){
        this.atendente = atendente;
    }

    public String getAtendente(){
        return atendente;
    }

    public void setData(String data){
        DateTimeFormatter parserData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        this.data = LocalDate.parse(data, parserData);
    }

    public String getData() {
        DateTimeFormatter parserData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String resultado = parserData.format(data);
        return resultado;
    }

    // associa um cliente a venda
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    //associa os itens a venda
    public void adicionarItem(ItemVenda itemVenda){
        itensVenda.add(itemVenda);
    }

    public double calcularTotal(){
        double soma = 0.0;
        for (int i = 0; i < itensVenda.size(); i++){
            soma += itensVenda.get(i).calcularTotal();
        }
        return soma;       
    }

    public void listarItensVenda(){
        System.out.printf("\n");
        System.out.printf("Data de Venda: %s", getData());
        System.out.printf("\n");
        System.out.printf("Cliente: %s | CPF: %s | Idade: %d", cliente.getNome(), cliente.getCPF(), 
            cliente.calcularIdade());
        System.out.printf("\n");
        System.out.printf("Atendente: %s", atendente);
        System.out.printf("\n");
        System.out.printf("Nome do Produto  | Preço\t| Quantidade |\tTotal\n");

        //divisória
         for (int i = 0; i < 60; i++){
             System.out.printf("-");
             }
        System.out.println("\n");

        //listando produtos
        for (int i = 0; i < itensVenda.size(); i++){
            System.out.printf("%s\t | R$%10.2f |\t%5d|\tR$%8.2f\n", itensVenda.get(i).getProduto(), itensVenda.get(i).getPrecoProduto(), itensVenda.get(i).getQuantidade(), itensVenda.get(i).calcularTotal());
        }

        //divisória
        for (int i = 0; i < 60; i++){
            System.out.printf("-");
            }
        System.out.printf("\n");
        System.out.printf("Total da Venda:\t\t\t\t\tR$%8.2f", calcularTotal());
       

    }  
}