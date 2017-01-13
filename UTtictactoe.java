import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tearsyu on 12/01/17.
 */
public class UTtictactoe extends JFrame implements ActionListener{
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    private TicTacToe ticTacToe;
    private char player1, player2;

    public UTtictactoe(){
        super("TicTacToe Author:Yuxin");
        player1 = 'X';
        player2 = 'O';
        setSize(600,600);
        setLayout(new GridLayout(3,3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bt1 = new JButton("choisir");
        bt2 = new JButton("choisir");
        bt3 = new JButton("choisir");
        bt4 = new JButton("choisir");
        bt5 = new JButton("choisir");
        bt6 = new JButton("choisir");
        bt7 = new JButton("choisir");
        bt8 = new JButton("choisir");
        bt9 = new JButton("choisir");

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);

        getContentPane().add(bt1);
        getContentPane().add(bt2);
        getContentPane().add(bt3);
        getContentPane().add(bt4);
        getContentPane().add(bt5);
        getContentPane().add(bt6);
        getContentPane().add(bt7);
        getContentPane().add(bt8);
        getContentPane().add(bt9);

        ticTacToe = new TicTacToe(player1, player2);

    }

    public void popupMsg(String msg){
        if(msg.equals("Winner ")){
            JOptionPane.showMessageDialog(null, "Winner : " + ticTacToe.winner);
        } else if (msg.equals("Game Over")){
            JOptionPane.showMessageDialog(null, msg);
        }

    }

    public static void main(String[] args){
        UTtictactoe ui = new UTtictactoe();
        ui.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bt1){
            ticTacToe.playTurn(1);
            if(ticTacToe.curr == player1){
                bt1.setText("O");
            }else {
                bt1.setText("X");
            }
            popupMsg(ticTacToe.gameOver());
            ticTacToe.printBoard();
            bt1.removeActionListener(this);
        }

        if(e.getSource() == bt2){
            ticTacToe.playTurn(2);
            if(ticTacToe.curr == player1){
                bt2.setText("O");
            }else {
                bt2.setText("X");
            }
            popupMsg(ticTacToe.gameOver());
            ticTacToe.printBoard();
            bt2.removeActionListener(this);
        }

        if(e.getSource() == bt3){
            ticTacToe.playTurn(3);
            if(ticTacToe.curr == player1){
                bt3.setText("O");
            }else {
                bt3.setText("X");
            }
            popupMsg(ticTacToe.gameOver());
            ticTacToe.printBoard();
            bt3.removeActionListener(this);
        }

        if(e.getSource() == bt4){
            ticTacToe.playTurn(4);
            if(ticTacToe.curr == player1){
                bt4.setText("O");
            }else {
                bt4.setText("X");
            }
            popupMsg(ticTacToe.gameOver());
            ticTacToe.printBoard();
            bt4.removeActionListener(this);
        }

        if(e.getSource() == bt5){
            ticTacToe.playTurn(5);
            if(ticTacToe.curr == player1){
                bt5.setText("O");
            }else {
                bt5.setText("X");
            }
            popupMsg(ticTacToe.gameOver());
            ticTacToe.printBoard();
            bt5.removeActionListener(this);
        }

        if(e.getSource() == bt6){
            ticTacToe.playTurn(6);
            if(ticTacToe.curr == player1){
                bt6.setText("O");
            }else {
                bt6.setText("X");
            }
            popupMsg(ticTacToe.gameOver());
            ticTacToe.printBoard();
            bt6.removeActionListener(this);
        }

        if(e.getSource() == bt7){
            ticTacToe.playTurn(7);
            if(ticTacToe.curr == player1){
                bt7.setText("O");
            }else {
                bt7.setText("X");
            }
            popupMsg(ticTacToe.gameOver());
            ticTacToe.printBoard();
            bt7.removeActionListener(this);
        }

        if(e.getSource() == bt8){
            ticTacToe.playTurn(8);
            if(ticTacToe.curr == player1){
                bt8.setText("O");
            }else {
                bt8.setText("X");
            }
            popupMsg(ticTacToe.gameOver());
            ticTacToe.printBoard();
            bt8.removeActionListener(this);
        }

        if(e.getSource() == bt9){
            ticTacToe.playTurn(9);
            if(ticTacToe.curr == player1){
                bt9.setText("O");
            }else {
                bt9.setText("X");
            }
            popupMsg(ticTacToe.gameOver());
            ticTacToe.printBoard();
            bt9.removeActionListener(this);
        }
    }
}
