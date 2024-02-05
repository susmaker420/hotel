import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BookningSuper {
    ArrayList<Bokning> bokningsArray = new ArrayList<>();
    Scanner imput = new Scanner(System.in);
    int index = 0;
    int im;

    public void avboka() {

        imput.nextLine();

        System.out.println("skriv in din boknings kod");
        int inP = imput.nextInt();
        for (int i = 0; i < bokningsArray.size(); i++) {
            if (bokningsArray.get(i).Kod == inP) {
                System.out.println("namn " + bokningsArray.get(i).bookningslager[0]);
                System.out.println("efternamn " + bokningsArray.get(i).bookningslager[1]);
                System.out.println("antal vuxna " + bokningsArray.get(i).bookningslager[2]);
                System.out.println("antal barn " + bokningsArray.get(i).bookningslager[3]);
                System.out.println("telefonummer " + bokningsArray.get(i).bookningslager[4]);
                System.out.println("är du säker att du vill avboka ?");
                System.out.println(" 1 för att avboka ");
                System.out.println(" 2 för att behålla bokningen ");
                int sw = imput.nextInt();
                switch (sw) {
                    case 1 -> {
                        System.out.println("du har avbokat ditt rum");
                        bokaVal();
                    }
                    case 2 -> {
                        System.out.println("tack att du är bokad hos oss");
                        bokaVal();
                    }
                    default -> avboka();

                }

            } else {
                System.out.println("koden du har anget matchar inte");
                System.out.println("eller så finns inget rum under denna bokningkoden");
                System.out.println("tryck 1 för att prova om");
                System.out.println("tryck 2 för att gå tillbacka till bokning");
                im = imput.nextInt();
                switch (im) {
                    case 1 -> {
                        avboka();
                    }
                    case 2 -> {
                        bokaVal();
                    }
                }
            }
        }
    }

    public void bokaVal() {
        System.out.println("1. för att boka ett rum");
        System.out.println("2. för att avboka rummet");


        im = imput.nextInt();

        switch (im) {
            case 1 -> {
                boka();
            }
            case 2 -> {
                avboka();
            }
            
            default -> bokaVal();
        }
    }

    public void boka() {
        bokningsArray.add(index, new Bokning());
        imput.nextLine();
        System.out.println("skriv in ditt förnamn");
        bokningsArray.get(index).bookningslager[0] = imput.nextLine();
        imput.nextLine();
        System.out.println("skriv in ditt efternamn");
        bokningsArray.get(index).bookningslager[1] = imput.nextLine();
        imput.nextLine();
        System.out.println("antal vuxna");
        bokningsArray.get(index).bookningslager[2] = imput.nextInt();
        imput.nextLine();
        System.out.println("antal barn");
        bokningsArray.get(index).bookningslager[3] = imput.nextInt();
        imput.nextLine();
        System.out.println("telefonnummer");
        bokningsArray.get(index).bookningslager[4] = imput.nextInt();
        imput.nextLine();
        System.out.println("din bokningsnummer är " + bokningsArray.get(index).Kod);
        System.out.println("tack för du har bokat ett rum hos oss");
        System.out.println("betalning sker på plats");
        index++;
        bokaVal();
    }

}

