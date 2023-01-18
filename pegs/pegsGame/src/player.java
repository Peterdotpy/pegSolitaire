import java.util.Scanner;
public class player extends board{
    private boolean startGame;
    private int p1X;
    private int p1Y;
    private int p2X;
    private int p2Y;
   
    void start(){
        startGame = true;
        while (startGame){
            
            game();
            startGame = checkEnding();
        }
        if(!startGame){
            System.out.println("THANK YOU FOR PLAYING CS300 PEG SOLITAIRE!");
        }
    }
    void game (){
        
        player p1Player = new player();
        Scanner sc = new Scanner(System.in);
        System.out.println("up down left or right?: ");
        String direction = sc.next();
        System.out.println("Enter the original coordinate u wish to swap(row then col): ");
        int p1X = sc.nextInt();
        
        int p1Y = sc.nextInt();
        System.out.println("Enter the target coordinate u wish to swap(row then col): ");
        int p2X = sc.nextInt();
        int p2Y = sc.nextInt();
        p1Player.move(p1X, p1Y, p2X, p2Y, direction);
        
        

        
        
    }

   void move(int x, int y, int moveToX, int moveToY, String direction){
    
        p1X = x;
        p1Y = y;
       
        boardGame[moveToX][moveToY] = "@";
        boardGame[x][y] = "l";
        if(direction.equalsIgnoreCase("right")){
            boardGame[moveToX ][moveToY-1] = "l";
        }
        if(direction.equalsIgnoreCase("down")){
            boardGame[moveToX-1][moveToY] = "l";
        }
        if(direction.equalsIgnoreCase("left")){
            boardGame[moveToX][moveToY+1] = "l";
        }if(direction.equalsIgnoreCase("up")){
            boardGame[moveToX+1][moveToY] = "l";
        }
        
        
        
       
        
        displayBoardGame();
    }
}