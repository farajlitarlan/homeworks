package lesson4;

public class envelope {
    public static void main(String[] args) {
        int width = 20;
        int height = 10;
        int firstcolumn = 0;
        int lastcol = width - 1;
        int firstrow = 0;
        int lastrow = height - 1;
        int secondrow = firstrow + 1;
        int secondcol = lastcol - 1;
        double k = (double) width / height;
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row == firstrow || row == firstrow + 1 ||
                        col == firstcolumn || row == lastrow ||
                        col == firstcolumn + 1 || col == lastcol - 1 ||
                        col == width - 1 || col == lastcol ||
                        row == height - 1 || row == lastrow - 1 ||
                        col == secondcol || row == secondrow ||
                        col == Math.round(row * k) ||
                        col == width - 1 - Math.round(row * k))

                    System.out.print("*");


                else System.out.print(" ");

            }
            System.out.println();
        }
    }
}
