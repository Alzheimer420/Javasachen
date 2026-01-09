import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        
        char currentPlayer = 'X';
        int turns = 0;          

        System.out.println("Das Spiel beginnt!");

        
        while (turns < 9) {
            board.display();
            System.out.print("Spieler " + currentPlayer + ", wähle ein Feld (1-9): ");
            
            
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt() - 1;

                
                if (board.setField(input, currentPlayer)) {
                    turns++;
                    
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                } else {
                    System.out.println("Zug ungültig! Das Feld ist belegt oder existiert nicht.");
                }
            } else {
                System.out.println("Bitte gib eine Zahl ein!");
                scanner.next();
            }
        }

        board.display();
        System.out.println("Spiel beendet. Unentschieden (oder jemand hat gewonnen, aber wir prüfen es noch nicht)!");
    }
}
