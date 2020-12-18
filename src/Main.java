

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("\nDigite o Dia: ");
        int dia = data.nextInt();

        System.out.println("\nDigite O Mês: ");
        int mes = data.nextInt();

        System.out.println("\nDigite O Ano: ");
        int ano = data.nextInt();
        
        
        Data usuario = new Data (dia, mes, ano);

        usuario.printData();

        usuario.diferençaDatas();

        usuario.adicionaDias( (long) 110);



        
    }

    
}
