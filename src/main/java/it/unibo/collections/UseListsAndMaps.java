package it.unibo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private static final int ELEMS= 1_000_000;

    private UseListsAndMaps() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
       /* */ /* 
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */

         /* 

         ArrayList<Integer> Arrlist = new ArrayList<>();

         for (int i = 1000; i <= 2000 ; i++){
            Arrlist.add(i);
         }

         */

        // System.out.println(Arrlist);

        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */

         LinkedList<Integer> Linklist = new LinkedList<>();

        // Linklist.addAll(Arrlist); //Dalla javadoc, ho trovato il comando che prende in input gli elementi di una collezione

        // System.out.println(Linklist);

        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */

         /* 

         int t = Arrlist.getFirst();
         System.out.println(t);
         System.out.println(Arrlist.getLast());
         Arrlist.set(0, Arrlist.getLast());
         Arrlist.set(Arrlist.size()-1, t);
         System.out.println(Arrlist.getFirst());
         System.out.println(Arrlist.getLast());

         */

        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */

         /* 

         for(int a: Arrlist){
            System.out.println(a);
         }

         */

        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */

          /* 

        // long time = System.nanoTime();
         for (int i = 1; i <= ELEMS; i++) {
            Arrlist.addFirst(i);
        }

        */
        
        /* 

        final var millis = TimeUnit.NANOSECONDS.toMillis(time);
        System.out.println(// NOPMD
            "Converting "
                + Arrlist.size()
                + " Inserting "
                + ELEMS
                + " elements took "
                + millis/1000
                + "s"
        );

        

        // long time2 = System.nanoTime();
         for (int i = 1; i <= ELEMS; i++) {
            Linklist.addFirst(i);
        }

        */


        /* 
        
        final var millis2 = TimeUnit.NANOSECONDS.toMillis(time2);
        System.out.println(// NOPMD
            "Converting "
                + Linklist.size()
                + " Inserting "
                + ELEMS
                + " elements took "
                + millis2/1000
                + "s"
        );

        */

        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */

         /* 

         long time3 = System.nanoTime();

         for (int i = 0; i<=1000; i++){
            Arrlist.get(Arrlist.size()/2);
         }

         final var millis3 = TimeUnit.NANOSECONDS.toMillis(time3);

        System.out.println(
                " Reading the middle element"
                + " took "
                + millis3/1000000
                + "s"
        );

        long time4 = System.nanoTime();

         for (int i = 0; i<=1000; i++){
            Linklist.get(Linklist.size()/2);
         }

        final var millis4 = TimeUnit.NANOSECONDS.toMillis(time4);
        
           System.out.println(
                " Reading the middle element"
                + " took "
                + millis4/1000000
                + "s"
        );

        */


        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */

         Map<String, Long> ContinentMap = new HashMap<>();

         ContinentMap.put("Africa",1_110_635_000L);
         ContinentMap.put("Americas",972_005_000L);
         ContinentMap.put("Antarctica",0L );
         ContinentMap.put("Asia",4_298_723_000L);
         ContinentMap.put("Europe",742_452_000L);
         ContinentMap.put("Oceania",38_304_000L);

        /*
         * 8) Compute the population of the world
         */

        long tot = 0;
         for (Long t : ContinentMap.values()){
            tot += t;
         }
         System.out.println(tot);

    }
}
