import  java.util.Scanner;
public class user {
    public static void main(String[] args) {

        String username , password, newPassword, yes, no;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullacını adı: ");
        username = input.nextLine();

        System.out.println("Şifre: ");
        password = input.nextLine();

        if (username.equals("ali") && password.equals("123")) {

            System.out.println("Hoşgeldiniz");
        }




        else if (!username.equals("ali") && (password.equals("123"))) {

            System.out.println("Şifrenizi Sıfırlamak ister misiniz ? 'Evet' veya 'Hayır' yazınız. " );
            yes = input.nextLine();
            no = input.nextLine();


            if(yes.equals("Evet")) {

                System.out.println("Yeni şifreniz eski veya hatalı şifreniz ile aynı olmamalıdır. \n  Yeni şifre: ");
                newPassword = input.nextLine();

                if (newPassword.equals(password ) ) {

                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }

                else {
                    password = newPassword;
                    System.out.print("Şifre oluşturuldu. Yeni şifreniz: " + newPassword);
                }


            }




        }








        else {
            System.out.println("Bilgiler yanlış.");
        }















    }
}
