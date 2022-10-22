package Sorting;
import java.util.*;
class BubbleSort{
    public static void main (String args[]){
        int n;
        int[] arr;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array:");
            n=sc.nextInt();
            arr=new int[n];
            System.out.println("Enter array elements:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
