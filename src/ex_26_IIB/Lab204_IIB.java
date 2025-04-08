package ex_26_IIB;

public class Lab204_IIB {

    // ```
    //IIB
    //Instance initialization Block == IIB
    //I will be executed when Object is created.
    //```

    public static void main(String[] args) {
        new A1();
    }



}


class A1{
    A1(){
        System.out.println("DC");
    }

    {
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file

    }

    {
        System.out.println("Hi, I am IIB 2");
    }

    {
        System.out.println("Hi, I am IIB 3");
    }


}
