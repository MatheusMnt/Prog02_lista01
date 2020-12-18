

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Data {
    
    //atributos 
    private int dia;
    private int mes;
    private int ano;
    private LocalDate dataUsuario;
    private LocalDate hoje = LocalDate.now(); ;

    //construtores
    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
        this.dataUsuario = LocalDate.of(ano, mes, dia);
         
    }

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.dataUsuario = LocalDate.of(ano, mes, dia);
    }


    //metodos

    //escrevendo data
    public void printData(){
        System.out.println("\n" + dataUsuario);
    }

    //diferença entre hoje e a data digitada
    public void diferençaDatas(){
        long diferença = dataUsuario.until(hoje, ChronoUnit.DAYS);
        System.out.println("\nA diferença de dias eh: " + diferença);
        
    }

    public void adicionaDias(Long dias) {
        LocalDate novaData = dataUsuario.plusDays(dias);
        System.out.println("\nA nova data eh: " + novaData);        
    }









    



}
