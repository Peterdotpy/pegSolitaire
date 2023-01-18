import java.util.Scanner;
public class board{
    public static String[][] boardGame;
    void setBoardGame(int row, int col){
        boardGame = new String[row][col];
        for(int i = 1; i < row; i ++){
            for (int j = 1; j <col; j ++){
                boardGame[i][j] = "@";
            }
        }
        boardGame[1][1] = "l";
        boardGame[1][2] = "l";
        boardGame[1][3] = "l";
        boardGame[1][4] = "l";
        boardGame[1][5] = "l";
        boardGame[2][1] = "l";
        boardGame[3][1] = "l";
        boardGame[4][1] = "l";
        boardGame[5][1] = "l";
        boardGame[2][5] = "l";
        boardGame[3][5] = "l";
        boardGame[4][5] = "l";
        boardGame[3][2] = "l";
        boardGame[4][2] = "l";
        boardGame[5][2] = "l";
        boardGame[3][4] = "l";
        boardGame[4][4] = "l";
        boardGame[5][4] = "l";
        boardGame[5][5] = "l";
        boardGame[5][3] = "l";
        
    }
    void displayBoardGame (){
        for (int i = 1; i < boardGame[0].length; i++){
            for (int j = 1; j < boardGame[i].length; j++){
            System.out.print(boardGame[i][j] + " ");
            
        }
        System.out.println();
    }

    }
    int countPegsRemaining (){
        int pegs=0;
        for (int i = 0; i < boardGame[0].length; i++){
            for (int j = 0; j < boardGame[i].length; j++){
            if (boardGame[i][j].equals("l")){
                pegs++;
            }
        }
    }
        return pegs;
    }
    boolean checkEnding (){
        int star = 0;
        for (int i = 1; i < boardGame[0].length; i++){
            for (int j = 1; j < boardGame[i].length; j++){
            System.out.print(boardGame[i][j] + " ");
            if(boardGame[i][j].equals("@")){
                star++;
            }
        }
        if(star > 1){
            return true;

    }
   
    }

    return false;
    
}
}