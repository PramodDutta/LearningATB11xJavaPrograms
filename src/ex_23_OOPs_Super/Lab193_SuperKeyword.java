package ex_23_OOPs_Super;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {

        Car c1 = new Car(100);
        c1.display();





    }
}

class Vehicle{
    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("Default Const");
    }

    Vehicle(int a ){
        System.out.println("Param Con");
    }

    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("PC - arguemnt");
    }

    void display(){
        System.out.println("Vehicle Parent");
    }





}

class Car extends Vehicle{
    private int maxSpeed = 281;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Car(){
        super(); // DC
    }

    Car(int a){
        super(10); // PC of Parent
    }

    // Method Overloading


    @Override
    void display() {

        System.out.println(this.maxSpeed);

        // Parent
        System.out.println(super.maxSpeed);
        super.message();
        super.message(10);
        super.display();




        System.out.println("Override");
    }
}