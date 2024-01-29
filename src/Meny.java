import java.util.Scanner;

public class Meny {
    public Meny() {
        mine();
    }

    public void mine() {
        Info info = new Info();
        Scanner vmput = new Scanner(System.in);
        System.out.println("1. för att få mer info");
        System.out.println("2. för att boka");
        int vm = vmput.nextInt();
        switch (vm) {
            case 1 -> {
                info.info();
            }
            case 2 -> {
                Bookning bookning = new Bookning();
            }
            default -> mine();

        }

    }
}
