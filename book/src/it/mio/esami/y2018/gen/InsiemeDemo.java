package it.mio.esami.y2018.gen;

public class InsiemeDemo {
    public static void main(String[] args) {
        InsiemeI prova = new InsiemeI();
        prova.add(4);
        prova.add(20);
        prova.add(-4);
        prova.add(-1000);
        prova.add(550);
        prova.add(1000);
        prova.print();

        System.out.println("\n\nNuovo Ciclo");
        prova.remove(-1000);
        prova.print();
    }
}
