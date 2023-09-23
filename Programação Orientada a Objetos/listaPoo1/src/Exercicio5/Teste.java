package Exercicio5;

public class Teste {
    public static void main(String[] args) {

        Vector v1 = new Vector(5);
        System.out.println(v1.getArray().length);
        v1.insert("Filling index 0");
        v1.insert("Filling index 1");
        v1.insert("Filling index 2");

        System.out.println(v1.get(0)); // Getting string on index 0
        System.out.println(v1.get(2)); // getting string on index 2
        System.out.println(v1.get(6)); // getting string on a currently non existent index
        System.out.println(v1.size()); // should return 3, because there are only 3 strings on array despite having a capacity of 5

        // adding more strings

        v1.insert("Filling index 3");
        v1.insert("Filling index 4");
        v1.insert("Filling index 5 - SIZE INCREASED");
        v1.insert("Filling index 6- SIZE INCREASED");

        System.out.println(v1.get(6)); // Now i should get the right element
        System.out.println(v1.size()); // should return 7


    }
}
