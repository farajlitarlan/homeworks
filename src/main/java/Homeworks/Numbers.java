package Homeworks;
 import com.sun.jdi.IntegerType;
 import jdk.swing.interop.SwingInterOpUtils;

 import java.util.Random ;
 import java.util.Arrays ;
 import java.util.Scanner ;

import java.lang.StringBuffer ;

public class Numbers {
    public static void main(String[] args) {


        System.out.println("Let the game begin!!!");
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = user.nextLine();
        System.out.println("Name is " + name);


        Random rnd = new Random();


        int number = (int) (rnd.nextInt(100) + 1);
        int[] yourNumbers = new int[100];

        //  int number = 1 + (int) (100 * Math.random()) ;

        for (int i = 0; i < yourNumbers.length; i++) {
            System.out.println("Guess the number :");
            int guess = user.nextInt();
            yourNumbers[i] = guess;

            if (guess < number) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > number) {
                System.out.println("Your number is too big. Please, try again..");
            } else if (guess == number) {
                System.out.printf("Congratulations,%s!.", name);
                break;
            }




        }



        System.out.println(Arrays.toString(yourNumbers));
        for (int i = 0; i < yourNumbers.length; i++) ;

    }

       /* int sum = 0;
        int myArr[] = new int[100];
        for (int j = 0; j < myArr.length; j++) {
            myArr[j] = user.nextInt();
            sum = sum + myArr[j];

        }

        for (int j : myArr) {
            System.out.println(j);
        } */

}