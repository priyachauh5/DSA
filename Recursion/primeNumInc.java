//Print numbers from 1 to n(Increasing order)
//Time complexity: O(n)

public class primeNumInc{
    public static void primeInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        primeInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        int n=10;
        primeInc(n);
    }
}