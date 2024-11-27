//Write a function to find the last occurance of an element in an array
//Time complexity: O(n)

public class lastOccurance{
    public static int lastOccurance(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurance(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,8};
        System.out.print("Last Occurance is: "+lastOccurance(arr, 8, 0));
    }
}