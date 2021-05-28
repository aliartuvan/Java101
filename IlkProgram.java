
package Giris;
import java.util.Scanner;


public class IlkProgram {
    public static void main(String[] args) {

        double matematik,fizik,kimya,turkce,tarih,muzik, ort;


        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        matematik = input.nextDouble();

        System.out.println("Fizik notunuz:");
        fizik = input.nextDouble();

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextDouble();

        System.out.println("Türkçe notunuz: ");
        turkce = input.nextDouble();


        System.out.println("Tarih Notunuz: ");
        tarih = input.nextDouble();

        System.out.println("Müzik notunuz: ");
        muzik= input.nextDouble();

        ort = (matematik+fizik+kimya+turkce+tarih+muzik)/6;



        System.out.println("Ortalamanız: " + ort  + "dır.");

        String durum = ort>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);




















    }

    }

