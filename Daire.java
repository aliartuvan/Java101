import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {

        double r,aci, alan, pi = 3.14;


        Scanner input = new Scanner(System.in);
        System.out.println("Yarı çapı giriniz: ");
        r = input.nextDouble();

        System.out.println("Merkez açı ölçüsünü giriniz: ");
        aci = input.nextDouble();


alan= (pi* (r*r) *aci)/360;

System.out.println("Dairenin alanı: " + alan + "dir.");



    }
}
