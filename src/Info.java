import java.util.Scanner;

public class Info {

    public Info() {
    }

    public void info() {
        Scanner wmput = new Scanner(System.in);
        System.out.println("hotel moskva är stadens äldsta hotel.Hotelet groundatdes 1903 som ett rehabilitering center och sedan omvandlades till ett hotel vid 1918");
        System.out.println("Hotelet har haft berömda personer som Alber einstein,Leonid Brezhnev och Mikhail Gorbachev");
        System.out.println("tryck 1 för att gå tillbaka");
        int wm = wmput.nextInt();
        switch (wm) {
            case 1 -> {
                Meny meny = new Meny();
            }
            default -> info();
        }

    }
}

