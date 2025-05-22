package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Handler h1 = new HandlerReteta();
        Handler h2 = new HandlerStoc();
        Handler h3 = new HandlerCardSanatate();


        h1.setNext(h2);
        h2.setNext(h3);

        Client client1 = new Client(true, true, true);
        System.out.println("=== Verificare client 1 ===");
        h1.verifica(client1);

        Client client2 = new Client(false, true, true);
        System.out.println("\n=== Verificare client 2 ===");
        h1.verifica(client2);
        Client client3 = new Client(true, false, true);
        System.out.println("\n=== Verificare client 2 ===");
        h1.verifica(client2);

    }
}