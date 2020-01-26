package it.mio.esami.y2017.dicA;

public class MagicBoxDemo {
    public static void main(String[] args) {
        MagicBox<String> mb1 = new MagicBox<>();
        mb1.add("Pippo");
        mb1.add("Pluto");
        mb1.add("Paperino");
        MagicBox<String> mb2 = mb1.filterWith((x)->(((String)x).length()<6));
        for(String s : mb2)
            System.out.println(s);
    }
}
