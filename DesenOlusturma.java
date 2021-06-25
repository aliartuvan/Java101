import java.util.Scanner;
public class DesenOlusturma {




    static int desenAzaltma(int a, int b) {
        if (a > 0) {
            System.out.print(a + " ");
            return desenAzaltma(a - 5, b);
        } else {
            return desenArtirma(a,b);
        }

    }
    static int desenArtirma ( int x, int y){
        System.out.print(x + " ");
        if (x == y) {
            return x;
        } else {
            return desenArtirma(x + 5, y);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı: ");
        int num = scan.nextInt();
        desenAzaltma(num, num);
    }
}