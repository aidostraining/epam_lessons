package _java._se._06.set;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user on 15.02.2020.
 */
public class IteratorExample {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Berlin");
        set.add("New York");
        System.out.println(set);
        // Obtain an iterator for the hash set
        Iterator iterator = set.iterator();
        // Display elements in the hash set
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

    }
}
