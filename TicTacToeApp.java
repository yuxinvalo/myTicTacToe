import java.util.Scanner;

/**
 * Created by tearsyu on 03/11/16.
 */
public class TicTacToeApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean doYouWantToPlan = true;
        while(doYouWantToPlan){
            System.out.println("Welcome! pick your character.");
            System.out.println();
            System.out.println("Enter a singer character");
            char playToken = sc.next().charAt(0);
            System.out.println();
            System.out.println("Choose a single character for ai.");
            char opponentToken = sc.next().charAt(0);
            TicTacToe ttt = new TicTacToe(playToken, opponentToken);
            AI ai = new AI();

            //Play
            System.out.println();
            System.out.println("enter the number and your token shall be puts.\n");
            TicTacToe.printIndexBoard();
            //String s = ttt.gameOver();
            while (ttt.gameOver().equals("N")){
                System.out.println("LOOP");
                if(ttt.curr == ttt.user){
                    System.out.println("Its your turn.");
                    int spot = sc.nextInt();
                    while(!ttt.playTurn(spot)){
                        System.out.println("Invalid input. Try again.");
                        spot = sc.nextInt();
                    }
                    System.out.println("You picked " + spot );
                } else {
                    System.out.println("Its AI turn.");
                    int aiSpot = ai.pickSpot(ttt);
                    ttt.playTurn(aiSpot);
                }
                System.out.println();
                ttt.printBoard();
            }
            System.out.println(ttt.gameOver());
            doYouWantToPlan = false;
        }
    }
}
