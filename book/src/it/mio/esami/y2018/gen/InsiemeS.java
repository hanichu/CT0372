package it.mio.esami.y2018.gen;

import java.util.ArrayList;
import java.util.Iterator;

public class InsiemeS extends ArrayList<String> implements Insieme<String>, Iterable<String> {


    @Override
    public boolean add(String x) {
        if(!this.contains(x)){
            this.add(x);
            return true;
        }else return false;
    }

    @Override
    public boolean remove(Object x) {
        if(this.contains(x) && x instanceof String){
            this.remove(x);
            return true;
        }else return false;
    }

    @Override
    public boolean contains(Object x) {
        if(x instanceof String)
        return this.contains(x);
        else return false;
    }




    @Override
    public Iterator iterator() {
        return null;
    }
}
