package it.mio.ch10.ec01;

public class SquareSequence implements Sequence
{
    private int n;
    public int next()
    {
        n++;
        return n * n;
    }
}