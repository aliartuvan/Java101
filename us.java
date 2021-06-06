import java.util.Scanner;
public class us {
    public static void main(String[] args) {
        int x,n;
        Scanner input = new Scanner(System.in);

        System.out.println("Taban sayısını giriniz: ");
        x =input.nextInt();
        System.out.println("Üs sayısını giriniz: ");
        n = input.nextInt();
        int total=1;

        for(int i=1; i<=n ; i++ ) {

            total = total *x; }

        System.out.println(total);




    }


}
