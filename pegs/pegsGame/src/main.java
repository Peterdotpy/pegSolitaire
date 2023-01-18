import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("choose the size of the board(only square): " );
        int row = sc.nextInt();
        int col = sc.nextInt();
        board gameBoard = new board();
        gameBoard.setBoardGame(row,col);
        System.out.println("This is the board: " );
        gameBoard.displayBoardGame();

//------------------------player section---------------------------------------------------//
        
        // player p1Player = new player();
        // player p2Player = new player();
        // p1Player.game();
        // int p1X = sc.nextInt();
        // int p1Y = sc.nextInt();
        // p1Player.move(p1X, p1Y);
        player game = new player();
        game.start();
    }
}