 import java.util.Scanner;
public class Combinasyon {
    public static void main(String[] args) {
        int n,r,x, total=1, total2=1, total3=1;
        Scanner input = new Scanner(System.in);
        System.out.println("--------KOMBİNASYON HESABI  C(n,r)--------");
        System.out.print("n: ");
        n = input.nextInt();
        System.out.print("r: ");
        r = input.nextInt();
        x = n-r;



        for (int i=1 ; i<=n; i++) {

            total = total * i;

        }
        for (int j=1 ; j<=r; j++) {

            total2 = total2 * j;

        }
        for (int k=1 ; k<=x; k++){
            total3 = total3* k;

        }

        System.out.println(total /(total2 *total3));







    }
}