package ex_31_Generics;

public class Lab237_Generics_Method_Fix {
    public static void main(String[] args) {

        temp_sum(3,4);
        temp_sum(3.34,4.45);
        temp_sum("Pramod","Dutta");


    }

    static <G> G temp_sum(G a, G b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

}
