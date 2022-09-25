package lesson8;

import java.util.ArrayList ;
import java.util.List ;


public class arrayLIST {
    public static List<Integer> filterNegative(List<Integer> data) {
        List<Integer> result = new ArrayList<>() ;
        for (int x : data) {
            if(x<0) result.add(x);
        }
        return result ;
    }

    public static List<Integer> filterPositive(List<Integer> data) {
        List<Integer> result = new ArrayList<>() ;
        for (int i = 0; i < data.size(); i++) {
            int x = data.get(i) ;
            if(x>0) result.add(x);
        }
        return result ;
    }


    public static void main(String[] args) {

        //List<Integer> data  = Arrays.asList<>();



    }
}
