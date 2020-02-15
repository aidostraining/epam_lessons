package _java._se._06.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by user on 13.02.2020.
 */
public class LinkedHashSetExample {
    public static void main(String[] args){
        Set<String> set = new LinkedHashSet<String>();
        set.add("New York");
        set.add("London");
        set.add("Berlin");
        set.add("San Francisco");
        set.add("Paris");
        set.add("New York");
        System.out.println(set);
        for (Object element : set)
            System.out.println(element.toString() + " ");
    }
}
