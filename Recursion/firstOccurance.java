//Write a function to find the first occurance of an element in an array
//Time complexity: O(n)
//Space complexity: O(n)

public class firstOccurance{
    public static int firstOccurance(int arr[],int key, int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,8};
        System.out.print("First occurance is at index: "+firstOccurance(arr,8,0));
    }
}