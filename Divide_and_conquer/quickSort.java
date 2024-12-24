//worst case= when pivot is smallest or largest element then worst case takes place O(n^2)
// n+(n-1)+(n-2)....3+2+1  ----AP
// n(n+1)/2
// n^2+n/2
// O(n^2)

public class quickSort{
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx=partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); //left
        quickSort(arr, pIdx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot=arr[ei];
        int i=si-1; //to make place for elemnet smaller than pivot
        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
         i++;
        //swap
        int temp=pivot;
        arr[ei]=arr[i]; 
        arr[i]=temp;
        return i;
}
    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}