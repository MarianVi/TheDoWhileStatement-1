
import java.util.Scanner;

public class Main {
    public static String OUTSIDE_INTERVAL_STRING =
            "Atentie! Numarul magic se afla in intervalul [0, 10]";
    public static String GO_SMALLER_STRING = "Esti aproape! Dar numarul magic este mai mic.";
    public static String GO_BIGGER_STRING = "Esti aproape! Dar numarul magic este mai mare.";
    public static String YOU_GUESSED_STRING = "Ai ghicit, bravo!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO:

        int numarMagic = scanner.nextInt();
        boolean corect = false;

        do {
            int incercare = scanner.nextInt();
            if (incercare < 0 || incercare > 10) {
                System.out.println(OUTSIDE_INTERVAL_STRING);
            } else if (incercare > numarMagic) {
                System.out.println(GO_SMALLER_STRING);
            } else if (incercare < numarMagic) {
                System.out.println(GO_BIGGER_STRING);
            } else {
                System.out.println(YOU_GUESSED_STRING);
                corect = true;
            }
        } while (!corect);

        scanner.close();
    }
}