

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;

public class Data {

    // atributos
    private int dia;
    private int mes;
    private int ano;
    private LocalDate dataUsuario;
    private LocalDate hoje = LocalDate.now();

    // construtores
    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
        this.dataUsuario = LocalDate.of(ano, mes, dia);

    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.dataUsuario = LocalDate.of(ano, mes, dia);
    }

    // metodos

    // escrevendo data
    public void printData() {
        System.out.println("\n" + dataUsuario);
    }

    // diferença entre hoje e a data digitada
    public void diferençaDatas() {
        long diferença = dataUsuario.until(hoje, ChronoUnit.DAYS);
        System.out.println("\nA diferença de dias eh: " + diferença);

    }

    // essa funçãp adiciona dias a data digitada pelo usuario
    public void adicionaDias(Long dias) {
        LocalDate novaData = dataUsuario.plusDays(dias);
        System.out.println("\nA nova data com os dias adicionados eh: " + novaData);
    }

    // essa função altera o mes da data digitada e formata no estilo dd/mmm/yyyy
    //eu preciso alterear essa função
    // é melhor criar uma função formartar e chama-la nessa outra função
    public void AlteraMes(int mes){
         Data dataAlterada = new Data(dia, mes, ano);
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
            String resultado = formatador.format(dataAlterada.dataUsuario);
            System.out.println("\nalterado o mês temos: " + resultado);
       
    }

    









    



}
