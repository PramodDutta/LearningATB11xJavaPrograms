package ex_32_Collection_Framework_DSA.LIST;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab247_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10);


        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);

        System.out.println(" ---- Normal For Loop ");


        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }


        System.out.println(" ----  For  Each Loop ");
        for (Object o : v) {
            System.out.println(o);
        }

        System.out.println(" ----  Iterator ");

        Iterator iterator  = v.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" ----  Enumeration ");

        Enumeration<Object> enumeration = v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println(" ----  ListIterator ");

        ListIterator listIterator = v.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("\nBackward Direction:");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.hasPrevious());
        }





    }
}
