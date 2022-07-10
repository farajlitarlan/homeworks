package lesson2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class CompareLogicApp {
    public static void main (String[] args ) {
        Scanner in = new Scanner (System.in) ;
        System.out.print("How old are you?");
        int age = in.nextInt( );
        System.out.println("How many brothers you have?");
        int numOfBrothers = in.nextInt();

        if (age >= 18 && numOfBrothers > 0 ) {
            System.out.printf("Age: %d , You have %d brothers" , age , numOfBrothers);
        } else {
            System.out.println("Hi");
        }
}
    }
