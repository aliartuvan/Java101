package com.company;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        String userName, password;
        Scanner sc = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int quantity;

        while (right > 0) {

            System.out.println("Kullanıcı adı: ");
            userName = sc.next();
            System.out.println("Şifre: ");
            password = sc.next();
            if (userName.equals("patika") && password.equals("dev")) {
                do {
                    System.out.println("Hoşgeldiniz sayın " + userName);
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz ");
                    System.out.println("1- Para Yatırma \n 2- Para Çekme \n 3- Bakiye sorgulama\n 4- Çıkış yap");
                    select = sc.nextInt();
                    switch (select ) {
                        case 1:
                        System.out.println("Yatırılacak para miktarı: ");
                        quantity = sc.nextInt();
                        System.out.println("Yeni bakiyeniz: " + (balance + quantity));
                        break;
                        case 2:
                        System.out.println("Çekilecek para miktarı: ");
                        quantity = sc.nextInt();
                        if (quantity>balance) {
                            System.out.println("Yetersiz bakiye. Mevcut bakiyeniz: " + balance);
                        }
                        else {System.out.println("Kalan bakiyeniz: " + (balance - quantity));}
                        break;
                        case 3:
                         System.out.println("Mevut bakiyeniz: " + balance);
                    break;
                    }

                } while (select != 4);

                break;
            } else {
                right--;

                System.out.println("Hatalı kullanıcı adı veya şifre.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }
                System.out.println("Kalann hakkınız: " + right);
            }
        }
    }
}
