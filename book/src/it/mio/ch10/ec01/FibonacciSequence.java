package it.mio.ch10.ec01;

public class FibonacciSequence implements Sequence {
    private int  f1, f2, c;
    @Override
    public int next() {

        //TODO da completare, magari prova con un arrayList

        f1=+f2;
        f2++;
        c = f1+f2;
        return c;

    }
}
