package Questão4;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Data {

    // atributos
    private LocalDate dataUsuario;
    private LocalDate hoje = LocalDate.now();

    // construtores
    public Data() {
        this.dataUsuario = LocalDate.of(2000, 01, 01);

    }

    public Data(String dataEntrada) {
        DateTimeFormatter parserData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
         this.dataUsuario = LocalDate.parse(dataEntrada, parserData);
    }

    // escrevendo data
    public void printData() {
        System.out.println("\n" + dataUsuario);
    }

    // diferença entre hoje e a data digitada
    public void diferençaDatas() {
        long diferença = dataUsuario.until(hoje, ChronoUnit.DAYS);
        System.out.println("\nA diferença de dias eh: " + diferença);

    }

    //a seguinte função adiciona dias a uma determinada data
    public void adicionaDias(Long dias) {
        LocalDate novaData = dataUsuario.plusDays(dias);
        System.out.println("\nA nova data com os dias adicionados eh: " + novaData);
    }

    // a seguinte função altera o mes da data 
    public void AlteraMes(int mesAlterado){
        int diaMes = dataUsuario.getDayOfMonth();
        int Ano = dataUsuario.getYear();
        String novaData;

        if (mesAlterado <10){
            novaData = diaMes + "/" + 0 + mesAlterado + "/" + Ano;
        } else {
            novaData = diaMes + "/" + mesAlterado + "/" + Ano;
        }
            Data dataAlterada = new Data(novaData);
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
            String resultado = formatador.format(dataAlterada.dataUsuario);
            System.out.println("\nalterado o mês temos: " + resultado);
       
    }

    

    









    



}
