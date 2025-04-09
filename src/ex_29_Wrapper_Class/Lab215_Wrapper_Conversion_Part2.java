package ex_29_Wrapper_Class;

public class Lab215_Wrapper_Conversion_Part2 {
    public static void main(String[] args) {
        String num  = "10";
        int aaa = 10;

        // String -> Wrapper -> parseX()  ,   Integer.parseInt(num);Double.parseDouble()
        Integer a  = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);

        // String to Primitive
        int aa = Integer.parseInt(num);

        // String to Wrapper


        // Wrapper to String (toString method)
        System.out.println(a.toString());

        // Primitive to String
        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());










    }
}
