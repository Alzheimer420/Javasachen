import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class ComputerPlayer {
    private char symbol;
    private char opponent;
    private Random random;

    private final int[][] WIN_COMBINATIONS = {
        {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
        {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
        {0, 4, 8}, {2, 4, 6}
    };

    public ComputerPlayer(char symbol) {
        this.symbol = symbol;
        this.opponent = (symbol == 'X') ? 'O' : 'X';
        this.random = new Random();
    }

    public int getMove(Board board) {
        char[] fields = board.getFields();
        List<int[]> possibleWins = new ArrayList<>();

        for (int[] combo : WIN_COMBINATIONS) {
            boolean blocked = false;
            for (int index : combo) {
                if (fields[index] == opponent) {
                    blocked = true;
                    break;
                }
            }
            if (!blocked) {
                possibleWins.add(combo);
            }
        }
        
        if (!possibleWins.isEmpty()) {
            int[] chosenCombo = possibleWins.get(random.nextInt(possibleWins.size()));
            List<Integer> freeFields = new ArrayList<>();
            for (int index : chosenCombo) {
                if (fields[index] != 'X' && fields[index] != 'O') {
                    freeFields.add(index);
                }
            }
            if (!freeFields.isEmpty()) {
                return freeFields.get(random.nextInt(freeFields.size()));
            }
        }

        List<Integer> fallbackFields = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            if (fields[i] != 'X' && fields[i] != 'O') {
                fallbackFields.add(i);
            }
        }
        return fallbackFields.get(random.nextInt(fallbackFields.size()));
    }
}
