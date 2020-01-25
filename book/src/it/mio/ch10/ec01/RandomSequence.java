package it.mio.ch10.ec01;

public class RandomSequence implements Sequence {
    public int next()
    {
        return (int) ( Integer.MAX_VALUE * Math.random());
    }
}