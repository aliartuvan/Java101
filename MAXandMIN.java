import java.util.Scanner;

public class MAXandMIN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int number = in.nextInt();

        int max, min, i=2;
        System.out.print("1. sayıyı giriniz: ");
        int a = in.nextInt();
        max =a;
        min =a;
        while (i<=number){
            System.out.print(i+". sayıyı giriniz: ");
            int b = in.nextInt();
            if (b>max){
                max = b;
            } else if (b<min){
                min =b;
            }
            i++;
        }
        System.out.println("Maximum sayı : "+max);
        System.out.println("Minimum sayı : "+min);
    }
}