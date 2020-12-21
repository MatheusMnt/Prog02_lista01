package Questão4;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Data {

    // atributos
    private LocalDate dataUsuario;
    private LocalDate hoje = LocalDate.now();
    private LocalDate dataBase;
    private LocalDate dataFinal;

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
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String resultado = formatador.format(novaData);
        System.out.println("\nA nova data com os dias adicionados eh: " + resultado);
    }

    //essa função altera o me da data digitada pelo usuario 
    public void AlteraMes(int novoMes){
        LocalDate dataAlterada = dataUsuario.withMonth(novoMes);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String resultado = formatador.format(dataAlterada);
        System.out.println("\nalterado o mês temos: " + resultado + "\n");
    }

    public void CalculaDiasUteis(){
        Scanner dataDiferença = new Scanner(System.in);

        System.out.println("Digite a data Base: ");
            String diaBase = dataDiferença.nextLine();
        System.out.println("Digite a data Final: ");
            String diaFinal = dataDiferença.nextLine();

        DateTimeFormatter parserData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
         this.dataBase = LocalDate.parse(diaBase, parserData);
         this.dataFinal = LocalDate.parse(diaFinal, parserData);

         long DiferencaDeDatas = dataBase.until(dataFinal, ChronoUnit.DAYS);
         int primeiroDia = dataBase.getDayOfWeek().getValue();
         int diasUteis = (int) DiferencaDeDatas;
         int DiasDoMes[] = new int[(int) DiferencaDeDatas];
        
         dataDiferença.close();

         for (int i = 0; i < DiferencaDeDatas; i++) {
             if (primeiroDia <= 7){
                DiasDoMes[i] = primeiroDia;
             }
             else {
                primeiroDia = 1;
             }
             primeiroDia++;
         }
         for (int j = 0; j < DiferencaDeDatas; j++) {
             if (DiasDoMes [j] == 6 || DiasDoMes [j] == 7){
                 diasUteis-=1;
             }
         }

         System.out.println("A quantidade de dias Uteis é: " + diasUteis);
         


    }

    

    









    



}
