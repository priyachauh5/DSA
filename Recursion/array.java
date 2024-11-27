//Check if a given array is sorted or not
//Time complexity: O(n)
//Space complexity: O(n)

public class array{
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,10,8,9};
        System.out.print(isSorted(arr,0));
    }
}