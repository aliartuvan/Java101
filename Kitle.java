import  java.util.Scanner;
public class Kitle {
    public static void main(String[] args) {
    int kilo;
    double boy, index;
     Scanner input = new Scanner(System.in);

     System.out.print("Boyunuzu giriniz ( metre cinsinden) : ");
     boy = input.nextDouble();

     System.out.print("Kilonuzu giriniz (kg cinsinden) : ");
     kilo = input.nextInt();

     index =  kilo / (boy * boy);

     System.out.println("Vücut Kitle İndeksiniz: " + index + "dir.");




    }
}
