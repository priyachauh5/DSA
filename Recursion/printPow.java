//Print x^n in O(logn)

public class printPow{
    public static int Power(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower=Power(x,n/2);
        int halfPowerSq=halfPower*halfPower;
        if(n%2!=0){ //if odd
            halfPowerSq=x*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String args[]){
        System.out.print(Power(2,10));
    }
}