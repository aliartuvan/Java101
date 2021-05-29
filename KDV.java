import  java.util.Scanner;
public class KDV {
    public static void main(String[] args) {

        double tutar,kdv, toplam;

        Scanner input = new Scanner(System.in);



        System.out.println("Tutarı giriniz: ");
        tutar = input.nextDouble();
        kdv =  tutar<=100 ? tutar/100*18 : tutar/100*8;
        toplam = tutar + kdv;



        System.out.println("KDV tutarı : "+kdv+ "TL");
        System.out.println("KDV dahil : " + toplam + "TL'dir" );

    }
}
