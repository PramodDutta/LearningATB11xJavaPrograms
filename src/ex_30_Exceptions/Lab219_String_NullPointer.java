package ex_30_Exceptions;

public class Lab219_String_NullPointer {
    public static void main(String[] args) {
        String name= null;
        name.trim(); // java.lang.NullPointerException
    }
}
