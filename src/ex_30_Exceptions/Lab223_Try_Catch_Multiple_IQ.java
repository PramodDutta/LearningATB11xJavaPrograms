package ex_30_Exceptions;

public class Lab223_Try_Catch_Multiple_IQ {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (Exception e){
            System.out.println("ARE YOU FOOL");
        }
        // Not possible as Big Exception is used before
//        catch (ArithmeticException e){
//            System.out.println("ARE YOU FOOL");
//        }
        System.out.println("2");




    }
}
