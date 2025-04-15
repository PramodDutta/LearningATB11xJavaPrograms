package ex_32_Collection_Framework_DSA.SET;

import java.util.*;
import java.util.HashSet;

public class Lab254_SET_P1 {
    public static void main(String[] args) {
            Set hs = new HashSet();
            Set lhs = new LinkedHashSet();
            Set ts = new TreeSet();

            hs.add("Pramod");
            hs.add("Pramod");
            hs.add("Dutta");
            System.out.println(hs);

    }
}
