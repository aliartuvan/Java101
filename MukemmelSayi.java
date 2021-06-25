import java.util.Scanner;
public class MukemmelSayi {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 0;

        System.out.print("Bir sayi giriniz: ");
        int number = inp.nextInt();

        for(int i = 1; i < number; i++)
        {
            if(number % i == 0) {
                total =total + i;
            }
        }
        if(number == total) {
            System.out.println(number + " Mükemmel sayidir.");
        } else {
            System.out.println(number + " Mükemmel sayi degildir.");
        }
    }
}