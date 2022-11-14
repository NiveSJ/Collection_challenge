package se.lexicon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaptoSet {


    public void maptoset(){

        Map<String,String> map1= new HashMap<>();
        Set<String> set1 = new HashSet<>();

        map1.put("Test1@gmail.com","Test1");
        map1.put("Test1@gmail.com","Test1");
        map1.put("Test3@gmail.com","Test3");

        for(Map.Entry e:map1.entrySet()){


            System.out.println();
        }





    }




}
