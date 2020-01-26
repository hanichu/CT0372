package it.mio.esami.y2017.dicA;
import java.util.ArrayList;

public class MagicBox<T> extends ArrayList<T> {
    public interface Filter {
        boolean accept(Object x);
    }


    public ArrayList<T> toArrayList(){
        return (ArrayList<T>) this.clone();
    }

    public MagicBox<T> filterWith(Filter f){
        MagicBox<T> copy = (MagicBox<T>)this.clone();
        copy.removeIf((x)->!f.accept(x));
        return copy;
    }

}
