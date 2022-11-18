package se.lexicon;

import java.util.*;

import static java.util.Collection.*;
import static java.util.Collections.sort;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("-----Compare Set challenge 1------\n");
        SetCompare comp = new SetCompare();
        comp.setCompare();
        System.out.println("\n----Map to set Set challenge---- 2\n");

        MaptoSet Mp = new MaptoSet();
        Mp.maptoset();

        System.out.println("\n------Challenge 3---------\n");
        Set<SuperHeros> superHeros = new HashSet<>();

        superHeros.add(new SuperHeros(100, "Nive", 30));
        superHeros.add(new SuperHeros(101, "Jay", 35));
        superHeros.add(new SuperHeros(102, "Anika", 5));

        List<SuperHeros> SH = new ArrayList<>(superHeros);
        sort(SH);
        for (SuperHeros heros1 : SH)
            System.out.println(heros1);


        System.out.println("\n------Array content with out duplicates Challenge 4---------\n");
        ArrayToCollections ar = new ArrayToCollections();
        ar.arraysToCollection();
    }


}
