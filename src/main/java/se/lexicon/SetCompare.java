package se.lexicon;

import java.util.*;

public class SetCompare {



    public void setCompare() {

        // As in set Performing Intersection operation between two set
        Set<String> Weekdays = new HashSet<>();
        Set<String> Weekends = new HashSet<>();
        String[] temp = new String[7];

        // Populating set 1
        //Week
        Weekdays.add("Monday");
        Weekdays.add("Tuesday");
        Weekdays.add("Wednesday");
        Weekdays.add("Thursday");
        Weekdays.add("Friday");
        Weekdays.add("Saturday");
        Weekdays.add("Sunday");
        // Populating set 2
        Weekends.add("Saturday");
        Weekends.add("Sunday");


        // using inbuilt:
        //Weekdays.retainAll(Weekends);
        //System.out.println(Weekdays);

        // Comparing manually

        int i = 0;
        for (String set2 : Weekends) {

            for (String set1 : Weekdays) {

                if (set2 == set1) {

                    temp[i] = set1;
                    i++;
                }
            }


        }
        Weekdays.clear();
        Weekdays.addAll(Arrays.asList(temp));
        System.out.println("Set with manual Intersection operation");
        for (String set1 : Weekdays) {
            if (set1 != null) {

                System.out.println(set1);
            }

        }


    }


}
