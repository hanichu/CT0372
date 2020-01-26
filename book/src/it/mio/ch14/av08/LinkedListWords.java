package it.mio.ch14.av08;
import java.util.LinkedList;
import java.util.ListIterator;


/**
 * Scrivete un ciclo che elimini dalla lista concatenata di stringhe words tutte le stringhe
 * aventi lunghezza inferiore a quattro.
 */

public class LinkedListWords {


    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Diana");
        staff.addLast( "Harry");
        staff.addLast( "Romeo");
        staff.addLast("Tom");

        System.out.println(staff);
        deleteStringsByLength(staff, 6);
        System.out.println(staff);
    }

    public static void deleteStringsByLength(LinkedList<String> stringLinkedList, int length){
        ListIterator<String> iterator = stringLinkedList.listIterator();

        while(iterator.hasNext()){
            if(iterator.next().length()<length){
                iterator.remove();
            }
        }
    }
}
