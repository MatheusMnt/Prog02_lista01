package Questão4;


import java.util.Scanner;


public class TesteDataMain {
     public static <LocaleDate> void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("\nDigite o Dia no formato dd/MM/aaaa: ");
        String dataEntrada = data.nextLine();

        Data dataDigitada = new Data(dataEntrada);

        dataDigitada.printData();
        dataDigitada.adicionaDias((long) 110);
        dataDigitada.AlteraMes(8);

        dataDigitada.CalculaDiasUteis();
        


        data.close();
        
        
        

        
    }

    
}
