import java.util.Random;
import java.util.Scanner;
public class Zahlenraten {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int geheimeZahl = random.nextInt(100) + 1;
        int gerateneZahl = 0;

        System.out.println("Willkommen zum Zahlenraten!");
        System.out.println("Zahl raten zwischen 1 und 100:");

        while (gerateneZahl != geheimeZahl) {
            System.out.print("Versuchen Sie es erneut: ");
            gerateneZahl = scanner.nextInt();

            if (gerateneZahl < geheimeZahl) {
                System.out.println("Zu niedrig!");
            } else if (gerateneZahl > geheimeZahl) {
                System.out.println("Zu hoch!");
            } else {
                System.out.println("Herzlichen Glückwunsch! Sie haben die Zahl erraten.");
            }
        }
    }
}