public class Board {
    // Ein Array für die Felder 1-9
    private char[] fields = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    // Methode, um das Feld auf der Konsole zu zeichnen
    public void display() {
        System.out.println("\n " + fields[0] + " | " + fields[1] + " | " + fields[2]);
        System.out.println("---+---+---");
        System.out.println(" " + fields[3] + " | " + fields[4] + " | " + fields[5]);
        System.out.println("---+---+---");
        System.out.println(" " + fields[6] + " | " + fields[7] + " | " + fields[8] + "\n");
    }
}