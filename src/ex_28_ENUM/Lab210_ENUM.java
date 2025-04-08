package ex_28_ENUM;

public class Lab210_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);
        System.out.println(PROJECT_URLs.katalon);
//        A a = new A();
//        System.out.println(a.days[4]);
    }
}

//class A{
//    String[] days = {"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};
//}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum PROJECT_URLs{
    google, restassured, katalon, vwo
}