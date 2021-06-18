import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        int[] wrong = new int[5];
        int test = 0;
        System.out.println("***** SAYI TAHMİN OYUNU *****");

        while (test < 5) {
            System.out.println("Bir sayı tahmin edin: ");
            int a = input.nextInt();
            wrong[test++] = a;

            if (a == number) {
                System.out.println("Tebrikler doğru tahmin ettiniz.");
                break;
            } else if (a < 0 || a > 99) {
                System.out.println("Lütfen 1-99 sayıları arası bir tahminde bulunun.");
                continue;
            } else if (a < number) {
                System.out.println("Sayı tahmin edilenden büyük");

            } else if (a > number) {
                System.out.println("Sayı tahmin edilenden küçük");

            } else {
                System.out.println("Hatalı giriş yaptınız");
                continue;
            }

            System.out.println("Kalan hakkınız: " + (5 - test));
        }
        System.out.println("Tahmin etmeye çalıştığınız sayı: " + number);
        System.out.println("Tahmin ettiğiniz sayılar: " + Arrays.toString(wrong));
    }
}
