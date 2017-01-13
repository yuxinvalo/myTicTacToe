/**
 * Created by tearsyu on 03/11/16.
 */
public class TicTacToe {
    protected static char[] board;
    protected char user;
    protected char ai;
    protected char winner;
    protected char curr;

    public TicTacToe(char playerToken, char ai){
        this.ai = ai;
        this.user = playerToken;
        this.winner = '-';
        this.board = setBoard();
        this.curr = user;
    }

    public char[] setBoard(){
        char [] board = new char[9];
        for (int i = 0; i < board.length; ++i){
            board[i] = '-';
        }
        return board;
    }

    public boolean playTurn (int spot){
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);
        if(isValid){
            board[spot - 1] = curr;
            curr = (curr == user) ? ai : user;
        }
        return  isValid;
    }

    public boolean withinRange(int nb) {
        return nb > 0 && nb <= board.length;
    }

    public  boolean isSpotTaken(int nb){
        return board[nb - 1] != '-';
    }


    public void printBoard(){
        System.out.println();
        for (int i = 0; i < board.length; i++){
            if(i % 3 == 0 && i != 0){
                System.out.println();
                System.out.println("--------------");
            }
            System.out.print(" | " + board[i]);
        }
        System.out.println();
    }

    public static void printIndexBoard(){
        System.out.println();
        for (int i = 0; i < board.length; i++){
            if(i % 3 == 0 && i != 0){
                System.out.println();
                System.out.println("--------------");
            }
            System.out.print(" | " + (i+1));
        }
        System.out.println();
    }

    public boolean isThereAWinner(){
        boolean diagognalsAndMiddles = (rightDiag() || leftDiag() || middleRow() || secondCol()) && board[4] != '-';
        boolean topAndFirst = (topRow() || firstCol()) && board[0] != '-';
        boolean bottemAndThird = (bottomRow() || thirdCol()) && board[8] != '-';
        if (diagognalsAndMiddles){
            this.winner = board[4];
        } else if (topAndFirst){
            this.winner = board[0];
        } else {
            this.winner = board[8];
        }
        return diagognalsAndMiddles || topAndFirst || bottemAndThird;
    }

    private boolean topRow(){
        return board[0] == board [1] && board[1] == board[2];
    }
    private boolean middleRow() {
        return board[3] == board [4] && board[5] == board[3];
    }
    private boolean bottomRow() {
        return board[6] == board [7] && board[6] == board[8];
    }


    private boolean firstCol() {
        return board[0] == board [3] && board[0] == board[6];
    }
    private boolean secondCol(){
            return board[1] == board[4] && board[1] == board[7];
    }
    private boolean thirdCol() {
        return board[2] == board [5] && board[5] == board[8];
    }


    private boolean leftDiag() {
        return board[0] == board [4] && board[4] == board[8];
    }
    private boolean rightDiag() {
        return board[2] == board [4] && board[4] == board[6];
    }


    public boolean isTheBoardFilled(){
        for (int i = 0; i < board.length; ++i){
            if(board[i] == '-'){
                return false;
            }
        }
        return true;
    }

    public String gameOver(){
        boolean didWin = isThereAWinner();
        if(didWin){
            return "Winner ";
        } else if(isTheBoardFilled()){
            return "Game Over";
        } else {
            return "N";
        }
    }

}
