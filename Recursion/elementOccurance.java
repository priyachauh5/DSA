//For a given integer array of sizeN. You have to find all the occurrences(indices)ofagivenelement(Key)andprintthem.Use a recursive function to solve this problem.
//Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key=1
//Sample Output: 1 5 7 8

public class elementOccurance{
    public static int elementOccurance(int arr[], int key, int i){
        //base case
        if(i==arr.length-1){
            return -1;
        }
        elementOccurance(arr,key,i+1);
        return i;
    }
    public static void main(String args[]){
        int arr[]={3,2,4,5,6,2,7,2,2};
        System.out.print(elementOccurance(arr, 2, 0));
    }
}