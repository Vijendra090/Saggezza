package hackerrank;

public class QueenAttack2 {

    public static boolean isObstacle(int i, int j, int numOfObs, int[][] obstacles){
        for(int k=0;k<numOfObs;k++){
            if(i==obstacles[k][0] && j==obstacles[k][1])
                return true;
        }
        return false;
    }

    public static int queenAttack(int n, int numOfObs, int row_q, int col_q, int[][] obstacles){

        int i=row_q,j=col_q;
        int attackCount=0;
        while(--i>=1 && --j>=1) {   //top left diagonal
            if(isObstacle(i,j,numOfObs,obstacles))
                break;
            attackCount++;
        }
        i=row_q; j=col_q;
        while(--i>=1 && ++j<=n) {   //top right diagonal
            if(isObstacle(i,j,numOfObs,obstacles))
                break;
            attackCount++;
        }
        i=row_q; j=col_q;
        while(++i<=n && --j>=1) {   //bottom left diagonal
            if(isObstacle(i,j,numOfObs,obstacles))
                break;
            attackCount++;
        }
        i=row_q; j=col_q;
        while(++i<=n && ++j<=n) {   //bottom right diagonal
            if(isObstacle(i,j,numOfObs,obstacles))
                break;
            attackCount++;
        }
        i=row_q; j=col_q;
        while(--i>=1) {   // up
            if(isObstacle(i,j,numOfObs,obstacles))
                break;
            attackCount++;
        }
        i=row_q;
        while(++i<=n) {   //down
            if(isObstacle(i,j,numOfObs,obstacles))
                break;
            attackCount++;
        }
        i=row_q; j=col_q;
        while(--j>=1) {   //left
            if(isObstacle(i,j,numOfObs,obstacles))
                break;
            attackCount++;
        }
        j=col_q;
        while(++j<=n) {   //right
            if(isObstacle(i,j,numOfObs,obstacles))
                break;
            attackCount++;
        }
        return attackCount;
    }

    public static void main(String[] args){
        int n= 5;   //number of rows and column in chessboard
        int k= 3;    //number of obstacles in chessboard
        int r_q=4;    // row number of queen
        int c_q=3;    // col number of queen
        int[][] obstacles = {{5,5},{4,2},{2,3}};

        System.out.println("No. of square the queen can attack is: "+ queenAttack(n,k,r_q,c_q,obstacles));
    }
}
