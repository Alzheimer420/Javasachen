import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        ComputerPlayer bot = new ComputerPlayer('O'); // Unser Computer-Gegner
        
        char currentPlayer = 'X';
        int turns = 0;

        while (turns < 9) {
            board.display();
            int move;

            if (currentPlayer == 'X') {
                
                System.out.print("Dein Zug (1-9): ");
                move = scanner.nextInt() - 1;
            } else {
                
                System.out.println("Computer (O) überlegt...");
                move = bot.getMove();
            }

            
            if (board.setField(move, currentPlayer)) {
                if (board.checkWin(currentPlayer)) {
                    board.display();
                    System.out.println(currentPlayer + " hat gewonnen!");
                    return;
                }
                
                
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                turns++;
            } else if (currentPlayer == 'X') {
                
                System.out.println("Feld belegt! Versuch es nochmal.");
            }
            
        }
        System.out.println("Unentschieden!");
    }
}
