import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int daoNguoc = 0;

        while (temp != 0) {
            int chuSo = temp % 10;
            daoNguoc = daoNguoc * 10 + chuSo;
            temp /= 10;
        }

        System.out.println("So dao nguoc: " + daoNguoc);

        if (n == daoNguoc) {
            System.out.println("La so doi xung");
        } else {
            System.out.println("Khong phai so doi xung");
        }
    }
}
