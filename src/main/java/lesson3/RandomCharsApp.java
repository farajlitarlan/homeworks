package lesson3;

 import java.util.Random ;
 import java.util.Scanner ;

public class RandomCharsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random() ;
        int num = in.nextInt() ;
        for(int i = 0 ; i < num ; i++) {
            char ch = (char) (rnd.nextInt('z'-'a'+ 1)+ 'a');
            System.out.print(ch);

        }

    }
}
