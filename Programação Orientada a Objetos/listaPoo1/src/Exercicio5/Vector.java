package Exercicio5;

public class Vector {
    private String [] array;
    private static int sizeOccupied = 0;  // Total of String on my array

    public Vector(int initialSize) { // Creating an array with a initial size on constructor
        this.sizeOccupied = sizeOccupied;
        array =  new String[initialSize];
    }

    public String[] getArray() {
        return array;
    }

    public void insert(String str){ // insert a new string on the array
        if(sizeOccupied == array.length) { // if the array is already full
            int newSize = array.length +1; // increases size by one

            String [] newArray = new String[newSize]; // new array with new size
            for(int i = 0; i< array.length; i++){ // Transfers content of the original array to new array
                newArray[i] = array[i];
            }
            array = newArray; // original array is now new array
            array[sizeOccupied] = str; // inserts string
        }
        else{
           array[sizeOccupied] = str; // inserts string
        }
        sizeOccupied++; // increases sizeOccupied since i inserted another string
    }

    public String get(int arrayIndex){ // gets the value of the string in certain index of array
        try {
            if(array[arrayIndex] != null || arrayIndex > sizeOccupied){ // if the value is not null
                return array[arrayIndex];
            }
        } catch (ArrayIndexOutOfBoundsException e){ // error exception if arrayIndex size if bigger than array capacity
            e.getStackTrace();
            System.out.println("Error! You tried to get a string on a non existent array index");
        }

        return null;
    }

    public int size(){ // return number of string on array
        return sizeOccupied;
    }
}
