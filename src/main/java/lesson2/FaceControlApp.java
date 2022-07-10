package lesson2;

import java.util.Scanner;

public class FaceControlApp {
    public static void main (String[] args ) {
        Scanner in = new Scanner (System.in) ;
        System.out.printf("%s", "What is your name?");
        String name = in.nextLine( );
        int age = in.nextInt();
        if (age >= 18 ) {
            System.out.printf("Hello %s! %d" , name , age);
            System.out.println("text" +  name + "/n");
        }

        else  {
            System.out.println("You are not adult");
        }
    }

}
