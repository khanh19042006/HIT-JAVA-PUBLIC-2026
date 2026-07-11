import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        // Bảng cưu chương
        int[] bang = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] lan = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : bang) {
            System.out.println("Bang cuu chuong " + i);

            for (int j : lan) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println();
        }


        // Tam giác
        int[] dong = {1, 2, 3, 4, 5};

        for (int i : dong) {
            String sao = "";

            for (int j : dong) {
                if (j <= i) {
                    sao += "* ";
                }
            }

            System.out.println(sao);
        }
    }
}
