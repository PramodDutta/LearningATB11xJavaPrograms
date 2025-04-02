package ex_19_OOps_Inheritance;

public class Lab180_Inheritance {

    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();
//        f1.bhk3();




        Son s1 = new Son();
        s1.bhk3();
        System.out.println(s1.gold_f); // Father gold can son - extend
        s1.bhk2(); // Father 2 BHK
    }

}

class Father{
    int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables

    void bhk2() { //  Behaviour |  Method | Function | Data members
        System.out.println("Father - 2BHK");
    }
}

class Son extends Father {

//    int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables
//
//    void bhk2() { //  Behaviour |  Method | Function | Data members
//        System.out.println("Father - 2BHK");
//    }


    void bhk3() {
        System.out.println("3BHK Son");
    }
}

