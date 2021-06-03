import java.util.Scanner;
public class ucusBilet {
    public static void main(String[] args) {

        int km, yas, tip;
        double fiyat,yeniFiyat,indirim;

        Scanner input = new Scanner(System.in);
        System.out.println("Uçulacak mesafe: ");
        km = input.nextInt();

        System.out.println("Yaşınız: ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş" );
        tip = input.nextInt();

        fiyat = km * 0.10;
        System.out.println("Bilet fiyatı: " + fiyat);


        if(km>0) { }
        else {
            System.out.print("Hatalı veri girdiniz.");
        }
        if (yas>0 && yas<122) {
            if (yas<12){
                indirim=fiyat/100*50;
                yeniFiyat = fiyat - indirim;
                System.out.println("İndirimli bilet fiyatı: " + yeniFiyat);
                if (tip==1) {
                    System.out.println("Ödenecek Tutar: " + yeniFiyat);
                }
                else if (tip==2) {
                    indirim = yeniFiyat/100*20;
                    yeniFiyat = (yeniFiyat - indirim)*2;
                    System.out.println("Ödenecek tutar Gidiş-Dönüş toplam: " + yeniFiyat);
                }
                else { System.out.println(" Hatalı veri girişi");}
            }
            else if (yas>=12 && yas<=24) {
                indirim=fiyat/100*10;
                yeniFiyat = fiyat - indirim;
                System.out.println("İndirimli bilet fiyatı: " + yeniFiyat);
                if (tip==1) {
                    System.out.println("Ödenecek Tutar: " + yeniFiyat);
                }
                else if (tip==2) {
                    indirim = yeniFiyat/100*20;
                    yeniFiyat = (yeniFiyat - indirim)*2;
                    System.out.println("Ödenecek tutar Gidiş-Dönüş toplam: " + yeniFiyat);
                }
                else { System.out.println(" Hatalı veri girişi");}
            }
            else {
                indirim=fiyat/100*30;
                yeniFiyat = fiyat - indirim;
                System.out.println("İndirimli bilet fiyatı: " + yeniFiyat);
                if (tip==1) {
                    System.out.println("Ödenecek Tutar: " + yeniFiyat);
                }
                else if (tip==2) {
                    indirim = yeniFiyat/100*20;
                    yeniFiyat = (yeniFiyat - indirim)*2;
                    System.out.println("Ödenecek tutar Gidiş-Dönüş toplam: " + yeniFiyat);
                }
                else { System.out.println(" Hatalı veri girişi");}
            }
        }

        else {
            System.out.println("Hatalı veri girdiniz.");
        }














    }
}
