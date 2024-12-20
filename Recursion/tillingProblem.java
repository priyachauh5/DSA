//Given a 2 x n board and tiles of size 2 x 1, count the number of ways to tile the given board using the 2 x 1 tiles. A tile can either be placed horizontally i.e., as a 1 x 2 tile or vertically i.e., as 2 x 1 tile.

public class tillingProblem{
    public static int tilling(int n){ //2xn(floor size)
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1=tilling(n-1);
        //horizontal choice
        int fnm2=tilling(n-2);
        int totalWays=fnm1+fnm2;
        return totalWays;
    }
    public static void main(String args[]){
        int n=4;
        System.out.print(tilling(n));
    }
}