package it.mio.ch10.e04;

public interface Measurable {
    default double getMeasure(){
        return 0;
    }

    /**
     * Computes the average of the measures of the given objects
     * @param objects an array of Measurable objects
     * @return the average of the measures
     */
    static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj : objects) {
            sum = sum + obj.getMeasure();
        }
        if (objects.length > 0) {
            return sum / objects.length;
        }
        else {
            return 0;
        }
    }

    /**
     * Aggiungete all’interfaccia Measurable i metodi statici largest e smallest, progettati
     * in modo da restituire, rispettivamente, l’oggetto c on misura massima e minima in un array
     * di o ggetti di tipo Measurable.
     * @param obj array che verrà processata
     * @return il measurable più piccolo
     */
    static Measurable getSmallest(Measurable[] obj){
        return obj[0];
    }

    default boolean smallerThan(Measurable other)
    {
        return getMeasure() < other.getMeasure();
    }
}


