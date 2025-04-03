package ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab189_MOverriding {

    public static void main(String[] args) {
        Dog d1  = new Dog();
        d1.sound();
    }


}

class Animal{
    void sound(){
        System.out.println("Animal Sound!");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!");
    }
}