package lesson6;

public class PizzaUseCase {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Quattroformaggi", 30) ;
        Pizza p2 = new Pizza("Margarita" , 60) ;

        System.out.println(p1==p2);
        Pizza p3=p2 ;
        System.out.println(p3==p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(1));
       // System.out.println(p1.equals(new PizzaApp()));

    }
}
