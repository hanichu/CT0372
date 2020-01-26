package it.mio.ch14.av09;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Scrivete un ciclo che visualizzi tutti gli elementi di posizione dispari (contando le posizioni
 * da zero come gli indici, cioè il secondo elemento, il quarto, ecc.) della lista concatenata
 * di stringhe words.
 */

public class LinkedListDisplayOdds {
    public static void main(String[] args) {

        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Diana");
        staff.addLast( "Harry");
        staff.addLast( "Romeo");
        staff.addLast("Tom");

        System.out.println(staff);
        LinkedList<String> result = listElementsByPosition(staff, true);
        System.out.println(result);
        result = listElementsByPosition(staff, false);
        System.out.println(result);

    }


    public static <T> LinkedList<T> listElementsByPosition(LinkedList<T> tlinkedList, boolean oddPosition){
        LinkedList<T> tempList = new LinkedList<>();
        ListIterator<T> iterator = tlinkedList.listIterator();

        while (iterator.hasNext()){
            if(oddPosition){
                iterator.next();
                tempList.add(iterator.next());
            }else{
                tempList.add(iterator.next());
                iterator.next();
            }
        }

        return tempList;
    }
}
