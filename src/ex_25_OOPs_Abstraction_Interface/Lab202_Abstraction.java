package ex_25_OOPs_Abstraction_Interface;

public class Lab202_Abstraction {
}


class ConcreateClass implements Incomplete_Interface{

    @Override
    public void display() {
        System.out.println("Hi");
    }
}

interface Incomplete_Interface{
    int a = 10;
    void display();
}

abstract class Incomplete_abstract{
    abstract void display1();
}