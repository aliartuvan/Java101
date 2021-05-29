import  java.util.Scanner;
public class Manav {
    public static void main(String[] args) {

        double elma  ,armut,domates,patlican,muz,toplam;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç kilo elma aldınız: ");
        elma = inp.nextDouble();

        System.out.println("Kaç kilo armut aldınız: ");
        armut = inp.nextDouble();

        System.out.println("Kaç kilo domates aldınız: ");
        domates = inp.nextDouble();

        System.out.println("Kaç kilo patlican aldınız: ");
        patlican = inp.nextDouble();

        System.out.println("Kaç kilo muz aldınız: ");
        muz = inp.nextDouble();

        toplam = (elma * 3.67) +(armut * 2.14 ) + (domates * 1.11 )+ (muz * 0.95) +( patlican * 5);

        System.out.println("Toplam tutar: " + toplam);

    }
}
