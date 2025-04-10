package ex_30_Exceptions;

public class Lab235_Custom_Exception_Example {
    public static void main(String[] args) {

        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);
        Bank jp_chase = new Bank("USD",101);
//        int total = sbi.add(icici);
        int total = sbi.add(jp_chase);
        System.out.println(total);




    }
}
