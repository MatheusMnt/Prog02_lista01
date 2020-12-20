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
    
    //retorna o cpf do cliente
    public String getCPF(){
        return cpf;
    }

    // associa um cpf ao cliente
    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    //retrona o nome do cliente
    public String getNome() {
        return nome;    
    }

    //associa um nome ao cliente
    public void setNome(String nome){
        this.nome = nome;
    }

    //retorna a data de nascimento 
    public LocalDate GetDataDeNascimento(){
        return dataDeNascimento;
    }

    //relaciona uma string dadata de nascimento com uma localDate e associa ao cliente
    public void SetDataDeNascimento(String dataDeNascimento){
        DateTimeFormatter parserData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        this.dataDeNascimento = LocalDate.parse(dataDeNascimento, parserData);
    }

    //calcula e retorna a idade do cliente
    public int calcularIdade(){
        LocalDate hoje = LocalDate.now();
        int idade = (int) dataDeNascimento.until(hoje, ChronoUnit.YEARS);
        return idade;
    }


    
}
