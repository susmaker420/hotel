import java.util.Random;

public class Bokning {
    //Flyttas om person klass implimenteras
    Random rand = new Random();
    Object[] bookningslager = new Object[5];
    int Kod = rand.nextInt(100000, 999999);

    public Bokning() {

    }
}

