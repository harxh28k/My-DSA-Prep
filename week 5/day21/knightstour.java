import java.util.Scanner;
public class knightstour{
    public static void main (String []args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // for sizr of chess board n*n
        int r = scn.nextInt(); // row 
        int c = scn.nextInt(); // column 

        int[][]chess = new int [n][n];
        pintKnightsTour(chess , r , c , 1);
    }

    public static void pintKnightsTour(int[][]chess , int r , int c , int move){
        if(r<0 || c<0 || r>=chess.length || c >= chess.length || chess [r][c] >0 ){
            return;
        }else if (move == chess.length * chess.length){ // this is done because for n = 5 there will be 25 places 
        // in chess board that can be filled but only 24 out of them can be filled because of our move value i.e which occupies one of 
        // our cell . so we print that print value at last . 
        
             chess[r][c]=move;
             display(chess);
             chess[r][c]=0;
             return;
        }


        chess[r][c]=move;
        // now we will call all 8 spots on which knight can travel 
         pintKnightsTour(chess, r -2 , c+1 ,move+1);
         pintKnightsTour(chess, r -1 , c+2 ,move+1);
         pintKnightsTour(chess, r +1 , c+2 ,move+1);
         pintKnightsTour(chess, r +2 , c+1 ,move+1);
         pintKnightsTour(chess, r +2 , c-1 ,move+1);
         pintKnightsTour(chess, r +1 , c-2 ,move+1);
         pintKnightsTour(chess, r -1 , c-2 ,move+1);
         pintKnightsTour(chess, r -2 , c-1 ,move+1);
        chess[r][c]=0; // we have to remove it bcoz of backtracking 

    }


    public static void display(int [][] chess){
        for(int i =0;i<chess.length;i++){
            for(int j =0;j<chess[0].length;j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}