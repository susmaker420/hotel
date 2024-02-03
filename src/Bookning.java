import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Bookning {
    //Flyttas om person klass implimenteras

    public Bookning() {
        bokning();
    }

    Scanner imput = new Scanner(System.in);
    Object[] bookningslager = new Object[6];

    public void bokning() {
        System.out.println("1. för att boka ett rum");
        System.out.println("2. för att avboka rummet");
        System.out.println("3 för att komma tillbacka till menyn");
        int im = imput.nextInt();
        switch (im) {
            case 1 -> {
                boka();
            }
            case 2 -> {
                avboka();
            }
            case 3 -> {
                Meny meny = new Meny();
            }
            default -> bokning();
        }
    }

    public void boka() {
        System.out.println("skriv in ditt förnamn");
        bookningslager[1] = imput.nextLine();
        imput.nextLine();
        System.out.println("skriv in ditt efternamn");
        bookningslager[2] = imput.nextLine();
        imput.nextLine();
        System.out.println("antal vuxna");
        bookningslager[3] = imput.nextInt();
        imput.nextLine();
        System.out.println("antal barn");
        bookningslager[4] = imput.nextInt();
        imput.nextLine();
        System.out.println("telefonnummer");
        bookningslager[5] = imput.nextInt();
        imput.nextLine();
        Random rand = new Random();
        bookningslager[0] = rand.nextInt(100000, 1000000);
        System.out.println("din bokningsnummer är " + bookningslager[0]);
        System.out.println("tack för du har bokat ett rum hos oss");
        System.out.println("betalning sker på plats");
        bokning();
    }

    public void avboka() {
        System.out.println("skriv in din boknings kod");
        imput.nextLine();
        if (imput == bookningslager[0]) {
            System.out.println("namen" + bookningslager[1]);
            System.out.println("efternamn" + bookningslager[2]);
            System.out.println("antal vuxna" + bookningslager[3]);
            System.out.println("antal barn" + bookningslager[4]);
            System.out.println("telefonummer" + bookningslager[5]);
            System.out.println("är du säker att du vill avboka ?");
            System.out.println(" 1 för att avboka ");
            System.out.println(" 2 för att behålla bokningen ");
            int sw = imput.nextInt();
            switch (sw) {
                case 1 -> {
                
                    System.out.println("du har avbokat ditt rum");
                    bokning();
                }
                case 2 -> {
                    System.out.println("tack att du är bokad hos oss");
                    bokning();
                }
                default -> avboka();

            }
        } else if (imput != bookningslager[0]) {
            System.out.println("koden du har anget matchar inte");
            avboka();
        }
    }

}