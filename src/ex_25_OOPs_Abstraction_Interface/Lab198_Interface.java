package ex_25_OOPs_Abstraction_Interface;

public class Lab198_Interface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(10,10);

        Square s1 = new Square();
        s1.getArea(3,4);

    }
}








class Square implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area od Square -> "+3.14*length*breadth);
    }
}

class Rectangle implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));

    }
}















interface Polygon{
    void getArea(int length, int breadth);
}