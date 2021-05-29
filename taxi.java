
import  java.util.Scanner;
 public class taxi {
    public static void main(String[] args) {

        double km,tutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilecek km: ");
        km = input.nextDouble();


        tutar = km<5 ? 20: 10 + km*2.20;



        System.out.println("Taksimetre tutarı:" + tutar + "Tl'dir ");






    }
}
