package Exercicio3;

import Exercicio2.Data;

public class Teste {
    public static void main(String[] args) {
        Data today = new Data(6,9,2023);

        Flight v1 = new Flight(1,today);
        v1.isSeatTaken[0] = true;
        v1.isSeatTaken[1] = true;
        v1.isSeatTaken[45] = true;
        v1.isSeatTaken[98] = true;

        System.out.println("The next flight available is: " + v1.nextAvailable());
        System.out.println(v1.isNumberTaken(1));
        System.out.println(v1.isNumberTaken(3));
        System.out.println("The numbers of seats available is " + v1.numberAvailable());
        v1.takeSeat(2);
        System.out.println(v1.isNumberTaken(2));
        System.out.println("The next flight available is: " +v1.nextAvailable() + " and the numbers of seats available is " + v1.numberAvailable());





    }




}
