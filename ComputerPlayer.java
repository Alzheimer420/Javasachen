import java.util.Random;

public class ComputerPlayer {
    private char symbol;
    private Random random;

    public ComputerPlayer(char symbol) {
        this.symbol = symbol;
        this.random = new Random();
    }

    public char getSymbol() {
        return symbol;
    }

    
    public int getMove() {
        return random.nextInt(9); 
    }
}
