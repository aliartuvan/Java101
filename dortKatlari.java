import java.util.Scanner;
    public class dortKatlari {
    public static void main(String[] args) {
        int a, total=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Sayı giriniz:");
            a = input.nextInt();
            if (a%4==0 && a%2==0) {   // Bu satırda yalnızca if(a%4==0) yazılırsa aynı sonuç alınır.
                total +=a;

            }

        }while(a%2==0);

        System.out.print(" 4 ve katları toplamı: "+ total);


    }
}
