public class AsalSayi {

    public static void main(String[] args) {
        int sayac = 0;
        for (int sayi = 2; sayi <= 100; sayi++) {
            int x = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    x = 1;
                    break;
                }
            }

            if (x == 0) {
                System.out.print(sayi + " ");
                sayac++;
            }
        }

    }

}