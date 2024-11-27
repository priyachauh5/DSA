//Print sum of firat n natural number
//Time complexity: O(n)
//Space complexity: O(n)

public class sum{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int fnm1=sum(n-1);
        int sum=n+sum(n-1);
        return sum;
    }
    public static void main(String args[]){
        int n=10;
        System.out.print(sum(10));
    }
}