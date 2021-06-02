import java.util.Scanner;
public class sinifGecme {
    public static void main(String[] args) {


        int mat, fiz, kim, muz, tur, ort, newOrt, sifir=0;

        Scanner input = new Scanner(System.in);


        System.out.print("Matematik notunuz:  ");
        mat = input.nextInt();

        if ((mat<0) || (mat>100)) {
            System.out.println("Varsayılan değer dışında giriş yaptınız!");
            mat = 0;

        }


        System.out.print("Fizik notunuz:  ");
        fiz = input.nextInt();
        if ((fiz<0) || (fiz>100)) {
            System.out.println("Varsayılan değer dışında giriş yaptınız!");
            fiz = 0;

        }
        System.out.print("Kimya notunuz:  ");
        kim = input.nextInt();
        if ((kim<0) || (kim>100)) {
            System.out.println("Varsayılan değer dışında giriş yaptınız!");
            kim = 0;

        }
        System.out.print("Müzik notunuz:  ");
        muz = input.nextInt();
        if ((muz<0) || (muz>100)) {
            System.out.println("Varsayılan değer dışında giriş yaptınız!");
            muz = 0;

        }
        System.out.print("Türkçe notunuz:  ");
        tur = input.nextInt();
        if ((tur<0) || (tur>100)) {
            System.out.println("Varsayılan değer dışında giriş yaptınız!");
            tur = 0;

        }



        ort = ( mat + fiz + kim + muz + tur) / 5 ; // Ödevi kontrol ediyorsanız sıfır alan değer olduğunda 5'e değil de nasıl 4'e bölüm yapılacak ?








        if (ort<=55) {
            System.out.println( "Ortalama: " + ort + "\nSınıfta Kaldınız");
        }




        else {
            System.out.println("Tebrikler sınıfı geçtiniz. \nOrtalamanız:  " + ort);
        }





    }
}
