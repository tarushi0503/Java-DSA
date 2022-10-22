package Searching;
import java.util.*;
class LinearSearch{
    public static void main(String args[]){
        int n,k,flag=0,pos=0;        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of elements:");
            n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key element to be found:");
        k=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                flag=1;
                pos=i;
                break;
            }
        }
        }
            if(flag==1){
            System.out.println("Search element found at position "+(pos+1));
        }
        else{
            System.out.println("Search element not found");
        }


    }
}
