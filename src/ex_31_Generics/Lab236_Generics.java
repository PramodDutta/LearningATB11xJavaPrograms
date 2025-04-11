package ex_31_Generics;

public class Lab236_Generics {
    public static void main(String[] args) {

        temp_sum(3,4);
        temp_sum(3.34,4.45);
        temp_sum("Pramod","Dutta");


    }

    static int temp_sum(int a, int b){
        return a+b;
    }
    static double temp_sum(double a, double b){
        return a+b;
    }
    static String temp_sum(String a, String b){
        return a+b;
    }
}
