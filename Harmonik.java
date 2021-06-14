import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        int n= inp.nextInt();
        double sonuc=0;
        for(double i =1; i<=n;i++) {
            sonuc += (1/i);
        }
        System.out.print(sonuc);

    }
}
