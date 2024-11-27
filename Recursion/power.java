//Power x^n     O(n)

public class power{
    public static int power(int x,int n){
        // return (int)Math.pow(x,n);
        if(n==0){
            return 1;
        }
        // int xnm1=power(x,n-1);
        // inrt xn=x*xnm1;
        // return xn;
        return x*power(x,n-1);
    }
    public static void main(String args[]){
        System.out.print(power(2,10));
    }
}