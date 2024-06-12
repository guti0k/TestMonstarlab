import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        // Phương trình ax2 + bx + c = 0
        double a, b, c, delta;
        double x1, x2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a: ");
        a = scanner.nextDouble();

        System.out.println("Nhập b: ");
        b = scanner.nextDouble();

        System.out.println("Nhập c: ");
        c = scanner.nextDouble();

        delta = (b * b) - (4 * a * c);

        if (delta > 0) {
            x1 = ((-1) * b + Math.sqrt(delta)) / (2 * a);
            x2 = ((-1) * b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Phương trình có 2 nghiệm phân biệt x1 = " + x1 + ", x2 = " + x2);
        }
        else if (delta == 0) {
            x1 = (-1) * b / (2 * a);
            x2 = x1;

            System.out.println("Phương trình có 1 nghiệm kép x1 = x2 = " + x1);
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
