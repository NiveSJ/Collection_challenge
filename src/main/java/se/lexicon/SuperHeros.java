package se.lexicon;

import java.util.Comparator;
import java.util.Objects;

public class SuperHeros implements Comparable<SuperHeros> {


    private int id;
    private String Name;
    private int Age;

    public SuperHeros(int id, String Name, int Age) {
        this.id = id;
        this.Name = Name;
        this.Age = Age;


    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }





    @Override
    public int compareTo(SuperHeros heros) {  // it uses Signum function

        if (Age > heros.getAge())
            return -1;
        else if (Age < heros.getAge())
            return 1;
        else
            return 0;

    }

    @Override
    public String toString() {
        return "SuperHeros{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
