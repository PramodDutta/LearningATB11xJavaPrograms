package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab183_Multil_LEVLE {
    public static void main(String[] args) {


//        Son s1 = new GrandFather();
//        Son s1 = new Father();
        Son amit = new Son();

        GrandFather g1 = new Son(); // Dynamic Dispatch
        g1.gf();
        g1.home();



        GrandFather g2 = new Father();
        g2.home();


        Father f2 = new Son();
        f2.home();
        // Father f3 = new GrandFather();

        // WebDriver driver = new ChromeDriver();






    }
}
