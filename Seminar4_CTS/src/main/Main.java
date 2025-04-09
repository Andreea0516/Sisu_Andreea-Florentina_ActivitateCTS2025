package main;


import clase.ARezervare;
import clase.Rezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ARezervare r1 = new Rezervare("Andrei", 13, 2, 12, true);
        ARezervare r2 = r1.clonare(20);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}