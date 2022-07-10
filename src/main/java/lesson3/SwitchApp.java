package lesson3;

public class SwitchApp {
    public static void main(String[] args) {


        String str = " string ";
        int  i = 5 ;
        System.out.println(i == 2 ? "OK" : i == 10 ? "ten" : "Not OK");


        switch(i) {
            case 1:
                System.out.println("one"); break ;
            case 2:
                System.out.println("two");  break ;
            default:
                System.out.println("def");

        }
    }
}