package lesson5;

public class iteration {
    public static void main(String[] args) {
        int n = 1 ;

        while (n <= 10) {
            System.out.println(n);
            n++ ;
        }

        n = 1 ;
        while(true){
            if (n>5){
                System.out.println(n);
                n++ ;
            }
        }
    }
}
