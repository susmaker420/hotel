import java.util.Random;

public class Bokning { // randoem 6 didgeds koden man får när man bokar eller bokningkod
    //Flyttas om person klass implimenteras
    Random rand = new Random();
    Object[] bookningslager = new Object[5];
    int Kod = rand.nextInt(100000, 999999);

    public Bokning() {

    }
}

