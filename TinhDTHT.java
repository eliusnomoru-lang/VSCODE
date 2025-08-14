import java.util.Scanner;

public class TinhDTHT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        double r = scanner.nextDouble();
        double area = Math.PI * r * r;
        System.out.printf("Diện tích hình tròn là: %.2f\n", area);
        scanner.close();
    }
}