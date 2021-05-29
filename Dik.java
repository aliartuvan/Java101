import  java.util.Scanner;
 public class Dik {
    public static void main(String[] args) {

        double a,b,c, cevre, alan, u;

        Scanner input = new Scanner(System.in);



        System.out.println("Birinci kenar: ");
        a = input.nextDouble();
        System.out.println("İkinci kenar: ");
        b = input.nextDouble();
        System.out.println("Üçüncü Kenar: ");
        c= input.nextDouble();

        cevre = a+b+c;
        u = cevre/2;

        alan  = Math.sqrt(u * (u-a) * (u-b) * (u-c));







        System.out.println("üçgenin Alanı:" + alan );






    }
}
