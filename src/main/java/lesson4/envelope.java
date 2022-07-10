package lesson4;

public class envelope {
    public static void main(String[] args) {
       int width = 22 ;
       int height = 8 ;
       double k = (double) width / height ;
       for (int row = 0 ; row < height ; row++) {
           for(int col = 0 ; col < width ; col++) {
               if (row==0 ||
                       col == 0 ||
                       col == width - 1 ||
                       row==height-1 ||
                      col ==  Math.round (row * k) ||
                // Math.round(row *k) + col ==  width + 1 - Math.round(k)
               col == width -1 - Math.round (row * k ) )
               System.out.print("*");
               else System.out.print(" ");



           }
           System.out.println();
       }
    }
}
