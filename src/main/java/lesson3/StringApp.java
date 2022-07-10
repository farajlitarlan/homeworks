package lesson3;

public class StringApp {
    public static void main(String[] args) {
        //char[] chars = { 'S' , 't' , 'r'} ;


        String str1 = "Ibatech" ;
        String str2 = "Ibatech" ;
        String str3 = new String("Ibatech");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str3);
    }
}
