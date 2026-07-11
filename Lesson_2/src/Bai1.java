import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng
        double dai = sc.nextDouble();
        double rong = sc.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;

        // Xuất kết quả
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
    }
}
