import java.util.Scanner;

public class EBOB {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        int n1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int n2 = scan.nextInt();
        int a, b, i, ebob = 0;

        if (n1 > n2) {
            a = n2;
            b = n1;
        } else {
            a = n1;
            b = n2;
        }
        i=a-1;
        while (i > 0) {
            if (a % i == 0 && b % i==0){
                ebob=i;
                break;
            }i--;
        }System.out.println("EBOB: "+ebob);
        int ekok=(n1*n2)/ebob;
        System.out.println("EKOK: "+ekok);
    }
}