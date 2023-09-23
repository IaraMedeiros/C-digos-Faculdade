package Exercicio2;

import java.time.format.DateTimeFormatter;

public class Teste {
    public static void main(String[] args) {
        Data hoje = new Data(5,9,2023);
        Data eu = new Data(24,6,2003);
        Data clone = new Data(hoje);
        Data bissexto1 = new Data(2,3,2000);
        Data bissexto2 = new Data(2,4,1964);



        /*System.out.println(hoje.toString());
        System.out.println(eu.toString());
        System.out.println(clone.toString());
        System.out.println(bissexto1.toString());
        System.out.println(bissexto2.toString());*/


    }
}
