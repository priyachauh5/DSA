package DSA.DP;

// Time complexity: O(2^n)
//Recusion

// public class fibonacciRecursion {
//     public static int fib(int n){
//         if(n==1 || n==0){
//             return n;
//         }
//         return fib(n-1)+fib(n-2);
//     }
//     public static void main(String args[]){
//         int n=6;
//         System.out.println(fib(n));
//     }
// }

//Advance recursion 
//Time Complexity: O(n)
//Memoization

// public class fibonacciRecursion {
//     public static int fib(int n, int f[]){
//         if(n==1 || n==0){
//             return n;
//         }
//         if(f[n]!=0){
//             return f[n];
//         }
//         f[n]=fib(n-1, f)+fib(n-2, f);
//         return f[n];
//     }
//     public static void main(String args[]){
//         int n=6;
//         int f[]=new int[n+1];
//         System.out.println(fib(n,f));
//     }
// }

//Tabulation
//O(n)
public class fibonacciRecursion {
    public static int fibTabulation(int n){
       int dp[]=new int[n+1];
       dp[0]=0;
       dp[1]=1;
       for(int i=2; i<=n; i++){
        dp[i]=dp[i-1]+dp[i-2];
       }
       return dp[n];
    }
    
    public static void main(String args[]){
        int n=6;
        System.out.println(fibTabulation(n));
    }
}
