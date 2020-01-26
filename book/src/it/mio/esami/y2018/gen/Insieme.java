package it.mio.esami.y2018.gen;

import java.util.ArrayList;

public interface Insieme<T>  {
    //aggiunge x, ritorna true se ha aggiunto x (ovvero se non c’era già)
    boolean add(T x);

    //elimina x, ritornatruese ha eliminato x (ovvero se c’era effettivamente)
    boolean remove(Object x);

    //verifica se x è presente nell’insieme
    boolean contains(Object x);

    //stampa su System.out tutti gli elementi presenti nell’insieme
    default void print(){
        System.out.println("\nRIP\n");
    }
}
