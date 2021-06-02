import java.util.Scanner;
public class siralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("1. Sayı: ");
        a = input.nextInt();

        System.out.println("2. Sayı: ");
        b = input.nextInt();

        System.out.println("3. Sayı: ");
        c = input.nextInt();





        if ((a<c) && (a<b)) {
            if (b<c) {
                System.out.println("a<b<c");
            }

            else {
                System.out.println("a<c<b");
            }
        }




        if ((b<c) && (b<a)) {
            if (a<c) {
                System.out.println("b<a<c");
            }

            else {
                System.out.println("b<c<a");
            }
        }




        if ((c<a) && (c<b)) {
            if (b<a) {
                System.out.println("c<b<a");
            }

            else {
                System.out.println("c<b<a");
            }
        }




    }
}
