import java.util.Scanner;
public class eger {

    public static void main(String[] args) {
        int a1, a2, sec;

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        a1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        a2 = input.nextInt();

        System.out.println("1- Toplama \n 2- Çıkarma \n 3- Çarpma \n 4- Bölme");
        System.out.println("Seçim Yapınız: ");
        sec = input.nextInt();


        switch (sec) {
            case 1:
                System.out.println("Sonuç : " + (a1 + a2));
                break;
            case 2:
                System.out.println("Sonuç : " + (a1 - a2));
                break;
            case 3:
                System.out.println("Sonuç : " + (a1 * a2));
                break;
            case 4:
                switch (a2) {
                    case 0: System.out.println("Bir sayının 0'a bölümü belirsizliktir.");
                    break;
                    default: System.out.println("Sonuç : " + (a1 / a2));
                        break;
                }
                break;


            default : System.out.println("Hatalı giriş yaptınız. Tekrar deneyin.");
                break;
                }




        }


    }




