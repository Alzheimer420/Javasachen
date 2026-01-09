public class Board {
    private char[] fields = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public void display() {
        System.out.println("\n " + fields[0] + " | " + fields[1] + " | " + fields[2]);
        System.out.println("---+---+---");
        System.out.println(" " + fields[3] + " | " + fields[4] + " | " + fields[5]);
        System.out.println("---+---+---");
        System.out.println(" " + fields[6] + " | " + fields[7] + " | " + fields[8] + "\n");
    }

    public boolean setField(int position, char symbol) {
        if (position >= 0 && position < 9 && fields[position] != 'X' && fields[position] != 'O') {
            fields[position] = symbol;
            return true;
        }
        return false;
    }

    
    public boolean checkWin(char s) {
        
        int[][] winCombos = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, 
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, 
            {0, 4, 8}, {2, 4, 6}             
        };

        for (int[] combo : winCombos) {
            if (fields[combo[0]] == s && fields[combo[1]] == s && fields[combo[2]] == s) {
                return true;
            }
        }
        return false;
    }
}
