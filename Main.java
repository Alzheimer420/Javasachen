import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        
        board.display();
        
        System.out.print("Spieler X, wähle ein Feld (1-9): ");
        int input = scanner.nextInt();
        
       
        if (board.setField(input - 1, 'X')) {
            System.out.println("Zug erfolgreich!");
        } else {
            System.out.println("Ungültiger Zug!");
        }
        
        board.display();
    }
}
