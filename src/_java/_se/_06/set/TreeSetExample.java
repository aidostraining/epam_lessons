package _java._se._06.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by user on 14.02.2020.
 */
public class TreeSetExample {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Berlin");
        set.add("New york");
        TreeSet<String> treeSet = new TreeSet<String>(set);
        System.out.println(treeSet);
        for (Object element : set)
            System.out.println(element.toString() + " ");
    }
}
