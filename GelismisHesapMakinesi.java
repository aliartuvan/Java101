import java.util.Scanner;

public class GelismisHesapMakinesi {

    static void topla() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayı: ");
        int a = scan.nextInt();
        System.out.print("2.Sayı: ");
        int b = scan.nextInt();
        System.out.println("Toplama: " + (a + b));
    }

    static void cikar() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayı: ");
        int a = scan.nextInt();
        System.out.print("2.Sayı: ");
        int b = scan.nextInt();

        System.out.println("Çıkarma: " + (a - b));
    }

    static void carp() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayı: ");
        int a = scan.nextInt();
        System.out.print("2.Sayı: ");
        int b = scan.nextInt();

        System.out.println("Çarpma: " + (a * b));
    }

    static void bol() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayı: ");
        int a = scan.nextInt();
        System.out.print("2.Sayı: ");
        int b = scan.nextInt();

        System.out.println("Bölme: " + (a / b));
    }

    static void usAl() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban: ");
        int a = scan.nextInt();
        System.out.print("Üs: ");
        int b = scan.nextInt();

        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs alma: " + (result));
    }

    static void modAl() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayı: ");
        int a = scan.nextInt();
        System.out.print("2.Sayı: ");
        int b = scan.nextInt();

        System.out.println("Mod alma: " + (a % b));
    }

    static void dikdortgenHesapla() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kısa kenar: ");
        int a = scan.nextInt();
        System.out.print("Uzun kenar: ");
        int b = scan.nextInt();

        System.out.println("Alan: " + (a * b) + "\nÇevre: " + (2 * (a + b)));
    }

    static void faktoriyelAl() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı: ");
        int a = scan.nextInt();

        int result = a;
        for (int i = 0; i < a; i++, a--) {
            result *= a;
        }
        System.out.println(a + "! : " + result);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String status = "E";
        boolean h = true;
        while (h) {
            System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme\n5. Üs alma\n6. Faktöriyel hesaplama\n7. Mod alma\n8. Dikdörtgen alan ve çevre hesaplama\n0. Çıkış yap\n");
            System.out.print("İşlem: ");
            int islem = scan.nextInt();
            if (islem==0){
                break;
            }
            switch (islem) {
                case 1:
                    topla();
                    System.out.print("Başka işlem yapmak istiyor musunuz (E/H): ");
                    status = scan.next();
                    break;
                case 2:
                    cikar();
                    System.out.print("Başka işlem yapmak istiyor musunuz (E/H): ");
                    status = scan.next();
                    break;
                case 3:
                    carp();
                    System.out.print("Başka işlem yapmak istiyor musunuz (E/H): ");
                    status = scan.next();
                    break;
                case 4:
                    bol();
                    System.out.print("Başka işlem yapmak istiyor musunuz (E/H): ");
                    status = scan.next();
                    break;
                case 5:
                    usAl();
                    System.out.print("Başka işlem yapmak istiyor musunuz (E/H): ");
                    status = scan.next();
                    break;
                case 6:
                    faktoriyelAl();
                    System.out.print("Başka işlem yapmak istiyor musunuz (E/H): ");
                    status = scan.next();
                    break;
                case 7:
                    modAl();
                    System.out.print("Başka işlem yapmak istiyor musunuz (E/H): ");
                    status = scan.next();
                    break;
                case 8:
                    dikdortgenHesapla();
                    System.out.print("Başka işlem yapmak istiyor musunuz (E/H): ");
                    status = scan.next();
                    break;
                default:
                    break;


            }
            if (status.equals("H")){
                break;
            }

        }

        System.out.println("Görüşmek üzere...");

    }
}