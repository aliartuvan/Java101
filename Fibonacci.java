import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = scanner.nextInt();
        int i = 0;
        int a = 1, b = 0;
        int toplam;
        while (i < number) {
            toplam = a + b;
            System.out.println(b + " + " + a + " = " + toplam);
            b = a;
            a = toplam;
            i++;
        }
    }
}