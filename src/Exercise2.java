import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bill = 0;
        int soDien;

        System.out.println("Nhập số điện = ");
        soDien = scanner.nextInt();

        if (soDien > 0 && soDien < 25) {
            bill = soDien * 1000;
        }
        else if (soDien > 25 && soDien < 75) {
            bill = 25 * 1000 + (soDien - 25) * 1250;
        }
        else if (soDien > 75 && soDien < 150) {
            bill = 25 * 1000 + 50 * 1250 + (soDien - 75) * 1800;
        }
        else if (soDien > 150) {
            bill = 25 * 1000 + 50 * 1250 + 75 * 1800 + (soDien - 150) * 2500;
        }
        else {
            System.out.println("Không tính được số điện");
        }

        System.out.println("Số điện phải trả trong 1 tháng là: " + bill);
    }
}
