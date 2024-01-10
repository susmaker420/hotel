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
                this.boka();
            }
            case 2 -> {
                this.avboka();
            }
            default -> bokning();
        }
    }

    public void boka() {
        System.out.println("skriv in ditt förnamn");
        this.namn = imput.nextLine();
        System.out.println("skriv in ditt efternamn");
        this.efternamn = imput.nextLine();
        System.out.println("antal vuxna");
        //Metod1
        this.antal_personervuxen = imput.nextInt();
        imput.nextLine();
        ///metod 2
        System.out.println("antal barn");
        this.antal_personerbarn = imput.nextInt();
        imput.nextLine();
        System.out.println("telefonnummer");
        this.telenummer = imput.nextInt();
        imput.nextLine();
        Random rand = new Random();
        int random_int = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
        System.out.println("din bokningsnummer är" + random_int);
        /*
        if(this.bookningslager[2].equals("\D+")) {
            ;
        }
         */
    }

    public void avboka() {

    }

}