package se.lexicon;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayToCollections {

    public static void arraysToCollection() {




        int[] nums = {1, 4, 4, 2, 6, 7};
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        System.out.println(set);


    }
}
