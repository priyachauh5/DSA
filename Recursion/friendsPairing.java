//Given  n friends, each one can  remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be pared up

public class friendsPairing{
    public static int friendsPairing(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }
    public static void main(String args[]){
        System.out.print(friendsPairing(8));
    }
}