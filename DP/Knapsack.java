package DSA.DP;

// public class Knapsack {
//     public static int knapSack(int val[], int wt[], int W, int n){
//         if(W==0 || n==0){
//             return 0;
//         }
//         if(wt[n-1]<=W){
//             //include
//             int ans1=val[n-1]+knapSack(val, wt,  W-wt[n-1], n-1);
//             //exclude
//             int ans2=knapSack(val, wt, W, n-1);
//             return Math.max(ans1, ans2);
//         }else{ //invalid
//             return knapSack(val, wt, W,  n-1);
//         }
//     }
//     public static void main(String args[]){
//         int val[]={15, 14, 10, 45, 30};
//         int wt[]={2, 5, 1, 3 ,4};
//         int W=7;
//         System.out.println(knapSack(val, wt, W, val.length));
//     }
// }


//Momoization

// public class Knapsack {
//     public static int knapSack(int val[], int wt[], int W, int n, int dp[][]){
//         if(W==0 || n==0){
//             return 0;
//         }

//         if(dp[n][W]!=-1){
//             return dp[n][W];
//         }

//         if(wt[n-1]<=W){
//             //include
//             int ans1=val[n-1]+knapSack(val, wt,  W-wt[n-1], n-1, dp);
//             //exclude
//             int ans2=knapSack(val, wt, W, n-1, dp);
//             dp[n][W]= Math.max(ans1, ans2);
//             return dp[n][W];
//         }else{ //invalid
//             dp[n][W]=knapSack(val, wt, W,  n-1, dp);
//             return  dp[n][W];
//         }
//     }
//     public static void main(String args[]){
//         int val[]={15, 14, 10, 45, 30};
//         int wt[]={2, 5, 1, 3 ,4};
//         int W=7;
//         int dp[][]=new int[val.length+1][W+1];
//         for(int i=0; i<dp.length; i++){
//             for(int j=0; j<dp[0].length; j++){
//                 dp[i][j]=-1;
//             }
//         }

//         System.out.println(knapSack(val, wt, W, val.length, dp));
//     }
// }

//Tabulation
//Time complexity: O(n*W)
public class Knapsack {
    public static int knapSack(int val[], int wt[], int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1]; 
        for(int i=0; i<dp.length; i++){
            dp[i][0]=0;
        }
        for(int j=0; j<dp[0].length; j++){
            dp[0][j]=0;
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                int v=val[i-1];
                int w=wt[i-1];
                if(w<=j){
                    int incProfit=v+dp[i-1][j-w];
                    int excProfit=dp[i-1][j];
                    dp[i][j]=Math.max(incProfit, excProfit);
                }else{
                    int excProfit=dp[i-1][j];
                    dp[i][j]=excProfit;
                }
            }
        }
        print(dp);
        return dp[n][W];
    }

    public static void print(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        int val[]={15, 14, 10, 45, 30};
        int wt[]={2, 5, 1, 3 ,4};
        int W=7;

        System.out.println(knapSack(val, wt, W));
    }
}