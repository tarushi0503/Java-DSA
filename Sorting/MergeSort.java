import java.util.*;
public class MergeSort{

    static void sort(int[] arr,int l, int h){
        if(l<h){
            int mid = (l+h)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }

    static void merge(int[] arr, int l, int mid, int h){
        int i = l;
        int j = mid+1;

        int[] mergedArr = new int[h-l+1];
        int k = 0;

        while(i<=mid && j<=h){
            if(arr[i]<=arr[j]){
                mergedArr[k++] = arr[i++];
            }else{
                mergedArr[k++] = arr[j++];
            }
        }

        while(i<=mid){
            mergedArr[k++] = arr[i++];
        }

        while(j<=h){
            mergedArr[k++] = arr[j++];
        }

        // Copying merged array to original array.
        for(i=0;i<mergedArr.length;i++){
            arr[l++] = mergedArr[i];
        }
    }

    static void mergeSort(int[] arr){
        sort(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1,0};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));       
    }
}

// Time Complexity = O(nlogn)
// Space Complexity = O(n)