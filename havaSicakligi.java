import  java.util.Scanner;
public class havaSicakligi {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the temperature?: ");
        heat = input.nextInt();


        if (heat<5) {

            System.out.println("You can ski.");
        }

        else if ((heat>=5) && (heat<=25) ) {
            if ((heat>10) && (heat<15) ) {
                System.out.println("You can picnic or go to cinema");
            }

            else if((heat>=5) && (heat<=10)){

                System.out.println(" You can go to cinema");

            }

            else if((heat>=15) && (heat<=25)){

                System.out.println(" You can picnic");

            }



        }
        else if (heat>25)
        {
            System.out.println("You can go to swimming");
        }

    }
}
