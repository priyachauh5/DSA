//Print numbers from n to 1(Increasing order)
//Time complexity: O(n)

public class primeNumDec{
    public static void primeDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        primeDec(n-1);
    }
    public static void main(String args[]){
        int n=10;
        primeDec(n);
    }
}