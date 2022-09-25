package Homeworks;

import java.util.Scanner ;
import java.util.Arrays ;

public class weekPlanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in) ;

      int a = 7 , b = 2;
        String[][] scedule = new String[a][b] ;
        scedule[0][0] = "Sunday" ;
        scedule[0][1] = "do home work" ;
        scedule[1][0] = "Monday" ;
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = " Tuesday " ;
        scedule[2][1] = " language course" ;
        scedule[3][0] = " Wednesday " ;
        scedule[3][1] = " do sport " ;
        scedule[4][0] = " Thursday " ;
        scedule[4][1] = "reading book" ;
        scedule[5][0] = "Friday " ;
        scedule[5][1] = " make a picnic ; do homework" ;
        scedule[6][0] = " Saturday " ;
        scedule[6][1] = " dancing course ; study " ;


        while( true ) {
            System.out.println(" Please, input the day of the week:  "  );
            String day = sc.nextLine() ;
            Scanner sc1 = new Scanner(System.in) ;

            switch ( day ) {
                case "Monday" :
                    System.out.print("Your tasks for " + scedule[1][0] + " : " + scedule[1][1]  );
                break ;
                    case "Tuesday" :
                    System.out.print("Your tasks for " + scedule[2][0] + " : "+ scedule[2][1]);
                        break ;
                case "Wednesday" :
                    System.out.print("Your tasks for " + scedule[3][0] + " : " + scedule[3][1] );
                    break ;
                case "Thursday" :
                    System.out.print("Your tasks for " + scedule[4][0] + " : " + scedule[4][1] );
                    break ;
                case "Friday" :
                    System.out.print("Your tasks for " + scedule[5][0] + " : " + scedule[5][1] );
                    break ;
                case "Saturday":
                    System.out.print("Your tasks for " + scedule[6][0] + " : " + scedule[6][1] );
                    break ;
                case "Sunday" :
                    System.out.print("Your tasks for " + scedule[0][0] + " : " + scedule[0][1] );
                   break ;
                case "exit" :
                      //  System.out.println("Please, input the day of the week: ");
                    break ;
                case "change Sunday" :

                    System.out.println("Please, input new tasks for " + scedule[0][0]);
                    String newtask = sc1.nextLine() ;
                     scedule[0][1] = newtask ;
                     break ;
                case "change Monday" :

                    System.out.println("Please, input new tasks for " + scedule[1][0]);
                     newtask = sc1.nextLine() ;
                    scedule[1][1] = newtask ;
                    break ;
                case "change Tuesday" :

                    System.out.println("Please, input new tasks for " + scedule[2][0]);
                    newtask = sc1.nextLine() ;
                    scedule[2][1] = newtask ;
                    break ;
                case "change Wednesday" :

                    System.out.println("Please, input new tasks for " + scedule[3][0]);
                    newtask = sc1.nextLine() ;
                    scedule[3][1] = newtask ;
                    break ;
                case "change Thursday" :

                    System.out.println("Please, input new tasks for " + scedule[4][0]);
                    newtask = sc1.nextLine() ;
                    scedule[4][1] = newtask ;
                    break ;
                case "change Friday" :

                    System.out.println("Please, input new tasks for " + scedule[5][0]);
                    newtask = sc1.nextLine() ;
                    scedule[5][1] = newtask ;
                    break ;
                case "change Saturday" :

                    System.out.println("Please, input new tasks for " + scedule[6][0]);
                    newtask = sc1.nextLine() ;
                    scedule[6][1] = newtask ;
                    break ;

                default :
                    System.out.println("Sorry, I don't understand you, please try again.;");
            }

        }
    }
}
