import java.util.Scanner;
import java.util.Random;

public class Bookning {
    //Flyttas om person klass implimenteras
    String namn;
    String efternamn;
    int telenummer;
    ///
    int bokningsnummer;
    int antal_personervuxen;
    int antal_personerbarn;

    Scanner imput = new Scanner(System.in);
    Object[] bookningslager = new Object[6];

    public void bokning() {
        System.out.println("1. för att boka ett rum");
        System.out.println("2. för att avboka rummet");
        int im = imput.nextInt();
        switch (im) {
            case 1 -> {
                boka();
            }
            case 2 -> {
                avboka();
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
        System.out.println("din bokningsnummer är" + bookningslager[0]);
        System.out.println("tack för du har bokat ett rum hos oss");
        System.out.println("betalning sker på plats");
    }

    public void avboka() {

    }

}