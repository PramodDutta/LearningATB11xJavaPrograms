package ex_17_OOPs;

public class Lab166_OOPs {

    public static void main(String[] args) {
        Person amit;
        Person p2 = new Person();
        // Person - Class
        // p2 - Object Ref
        // new Person() -> Object

        p2.name = "Lucky";
        System.out.println(p2.name);

        Person p3  = new Person();
        p3.name = "Pramod";
        System.out.println(p3.name);


        new Person().name = "Not Ref name";



    }


}

class Person{
    // Attribute | Properties |  Data Members | Instance variables
    String name;
    String phone;
    String color_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean isMale;

    // Behaviour | Function | Method
    void sleep(){
        System.out.println("I am sleeping");
    }

    String greet(String name){
        return "Hello" +name;
    }

    void talk(){
        System.out.println("Talking");
    }
    int remaining_amount_sal(int salary,int tax){
        return salary-tax;
    }
}