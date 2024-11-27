//Print nth fibonacci number
//Time complexity: O(2^n)
//Space complexity: O(n)

public class fibonacci{
    public static int fibNum(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fibNum(n-1);
        int fnm2=fibNum(n-2);
        int fn=fibNum(n-1)+fibNum(n-2);
        return fn;
    }
    public static void main(String args[]){
        int n=6;
        System.out.print(fibNum(n));
    }
}