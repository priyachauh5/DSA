package DSA.DP;
import java.util.Arrays;
//time complexity: O(2^n)
// public class ClimbingStairs {
//     public static int countWays(int n){
//         if(n==0) return 1;
//         if(n<0) return 0;
//         return countWays(n-1)+countWays(n-2);
//     }
//     public static void main(String args[]){
//         int n=5; //no of stairs;
//         System.out.println(countWays(n));
//     }
// }

// //time complexity: O(n)
//memoization
// public class ClimbingStairs {
//     public static int countWays(int n){
//         int ways[]=new int[n+1];
//         Arrays.fill(ways, -1);
//         if(n==0) return 1;
//         if(n<0) return 0;
//         if(ways[n]!=-1){
//             return ways[n];
//         }
//         ways[n]= countWays(n-1)+countWays(n-2);
//         return ways[n];
//     }
//     public static void main(String args[]){
//         int n=5; //no of stairs;
//         System.out.println(countWays(n));
//     }
// }


//Time complexity: O(n)
//Tabulation

public class ClimbingStairs {
    public static int countWays(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        //tabulation loop
        for(int i=1; i<=n; i++){
            if(i==1){
                dp[i]=dp[i-1]+0;
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    } 
    public static void main(String args[]){
        int n=5;
        System.out.println(countWays(n));
    }
}
