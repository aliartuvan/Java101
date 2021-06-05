import java.util.Scanner;

public class donguler1 {

    public static void main(String[] args) {

        int top=0,x=0,sayi;
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = in.nextInt();

        for (int i =1; i<=sayi; i++){
            if (i%4==0 && i%3==0){
                top=top+i;
                x++;
            }
        }
        System.out.println(top/x);

    }
}



