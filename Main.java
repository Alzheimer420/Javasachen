import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        int turns = 0;

        while (turns < 9) {
            board.display();
            System.out.print("Spieler " + currentPlayer + ", Feld (1-9): ");
            
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt() - 1;

                if (board.setField(input, currentPlayer)) {
                    
                    if (board.checkWin(currentPlayer)) {
                        board.display();
                        System.out.println("Glückwunsch! Spieler " + currentPlayer + " hat gewonnen!");
                        return; 
                    }
                    
                    turns++;
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                } else {
                    System.out.println("Ungültiger Zug!");
                }
            } else {
                System.out.println("Bitte eine Zahl eingeben!");
                scanner.next();
            }
        }

        board.display();
        System.out.println("Unentschieden! Das Feld ist voll.");
    }
}
