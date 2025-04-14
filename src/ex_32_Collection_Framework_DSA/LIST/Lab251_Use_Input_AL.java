package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Lab251_Use_Input_AL {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Multiple inputs from the user and store them in separate
        // names, ages - store them


        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();


        String continueInput = "Y"; // Control variable for input loop

        while (continueInput.equalsIgnoreCase("Y")){

            System.out.println("Enter the name");
            String name = scanner.next();
            names.add(name);

            System.out.println("Enter the age");
            Integer age = scanner.nextInt();
            ages.add(age);


            scanner.nextLine();
            System.out.print("Do you want to enter another record? (Y/N): ");
            continueInput = scanner.nextLine();




        }

        for (Object o1: names){
            System.out.println(o1);
        }

        for (Object o2: ages){
            System.out.println(o2);
        }


        scanner.close();




    }
}
