package Questão5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cliente {

    //atributos 
    private String cpf;
    private String nome;
    private LocalDate dataDeNascimento;

    //construtores 
    public Cliente(){
        this.cpf = "00000000000";
        this.nome = "José Maria da Silva";
        this.dataDeNascimento = LocalDate.of(2000, 1, 1);

    }

    public Cliente(String cpf, String nome, LocalDate dataDeNascimmento){
        this.cpf = cpf;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimmento;
    }

    //metodos
    public String getCPF(){
        return cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;    
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate GetDataDeNascimento(){
        return dataDeNascimento;
    }

    //provavelmente não vai funcionar
    public void SetDataDeNascimento(String dataDeNascimento){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate dataLocalDate = LocalDate.parse(dataDeNascimento, formatter);
    }

    public int calcularIdade(){
        LocalDate hoje = LocalDate.now();
        int idade = (int) dataDeNascimento.until(hoje, ChronoUnit.YEARS);
        return idade;
    }


    
}
