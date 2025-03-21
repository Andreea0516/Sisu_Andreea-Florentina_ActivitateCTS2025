package main;

import rezervare.ARezervare;
import rezervare.Rezervare;

public class Main {
    public static void main(String[] args) {
        ARezervare r1 = new Rezervare("Andrei", 13, 2, 12, true);
        ARezervare r2 = r1.clonare(20);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }

}
