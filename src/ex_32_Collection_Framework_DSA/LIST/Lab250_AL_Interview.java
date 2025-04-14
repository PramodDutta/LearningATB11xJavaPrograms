package ex_32_Collection_Framework_DSA.LIST;

import java.util.*;

public class Lab250_AL_Interview {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);


        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        // Collection - Interface
        // Collections - Class (it contains complete methods which list,set, qu may required)

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);






    }
}
