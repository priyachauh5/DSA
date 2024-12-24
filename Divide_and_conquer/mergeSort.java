//Merge Sort
// Time COmplexity: O(n log n)
//Space complexity: O(n);
// Depth first

public class mergeSort{
    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){ //base case
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid+1, ei); //right part
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //left part
        int j=mid+1; //right part
        int k=0; //idx for temp
        while(si<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //for left over element of 1st part
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //for leftover elemnet of 2nd sorted part
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //cpy temp to original arr
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}