package it.mio.esami.y2018.gen;
import java.util.Iterator;

public class InsiemeI implements Insieme<Integer>, Iterable<Integer>{
    static boolean[] test = new boolean[2001];
    int index;

    public InsiemeI() {
        index = 0;
    }


    @Override
    public boolean add(Integer x) {
        if((Integer)x>=-1000 && (Integer)x<=1000 && !this.contains(x)){
            index = x + 1000;
            test[index] = true;
            return true;
        }else return false;
    }

    @Override
    public boolean remove(Object x) {
        if((Integer)x>=-1000 && (Integer)x<=1000 && this.contains(x)){
            index = (Integer)x + 1000;
            test[index] = false;
            return true;
        }else return false;
    }

    @Override
    public boolean contains(Object x) {
        if(x instanceof Integer && (Integer)x>=-1000 && (Integer)x<=1000){
            index = (Integer)x + 1000;
            return test[index];
        } else return false;
    }

    public void print(){
        for (int i=0; i<2001; i++){
            if(test[i]){
                System.out.println(i-1000);
            }
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
