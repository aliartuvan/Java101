import java.util.Scanner;
public class TersUcgen {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Bir Sayı Giriniz");
        a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * a - 1; k >= (2 * i + 1); k--) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }
}