package it.mio.ch10.ec01;

public class SequenceDemo {
    public static void main(String[] args){


        System.out.println();
        LastDigitDistribution dist2 = new LastDigitDistribution();
        FibonacciSequence fibs = new FibonacciSequence();
        for (int i=0;i<10;i++){
            System.out.println(fibs.next()+" ");
        }

    }
}