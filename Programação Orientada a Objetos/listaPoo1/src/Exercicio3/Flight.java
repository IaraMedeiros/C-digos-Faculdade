package Exercicio3;

import Exercicio2.Data;

public class Flight {
    private int numFlight;
    private Data dateFlight;
    boolean [] isSeatTaken = new boolean [100]; // A flight contain 100 seats available

    public Data getDateFlight() {
        return dateFlight;
    }

    public int getNumFlight() {
        return numFlight;
    }

    public Flight(int numFlight, Data dateFlight) {
        this.numFlight = numFlight;
        this.dateFlight = dateFlight;
    }

    public Flight(Flight myFlight){
       this.numFlight = myFlight.getNumFlight();
       this.dateFlight = myFlight.getDateFlight();
    }

    public int nextAvailable(){ // This method returns the next index where the seat is not taken
        for(int i = 0; i < isSeatTaken.length; i++){
            if (!isSeatTaken[i]){
                return i; // returns the index where isSeatTaken is false;
            }
        }
        System.out.println("Error! There's no more seats available");
        return -1; // Returns -1 if the flight is full;
    }

    public boolean isNumberTaken(int numSeat){ // Returns the availability of seat on certain index
        return isSeatTaken[numSeat];
    }

    public void takeSeat(int numSeat){
        if(!isSeatTaken[numSeat]){
            isSeatTaken[numSeat] = true;
        }
    }

    public int numberAvailable(){ // counts the number of seats that are not taken
        int count = 0;
        for (boolean s: isSeatTaken) {
            if(!s){
                count++;
            }
        }
        return count;
    }

    public Flight clone() {
        return new Flight(this);
    }

}
