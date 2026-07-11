import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nam = sc.nextInt();

        if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
            System.out.println("Nam nhuan");
        } else {
            System.out.println("Khong phai nam nhuan");
        }
    }
}
