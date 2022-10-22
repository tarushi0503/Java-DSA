package Arrays;
import java.util.*;
public class MatrixMultiplication {
    public static void main(String args[]){
        int r1,c1,r2,c2;
        int [][]m1;
        int[][] m2;
        int [][] r;
        System.out.println("Enter row of matrix1: ");
        try (Scanner sc = new Scanner(System.in)) {
            r1=sc.nextInt();
            System.out.println("Enter column of matrix1: ");
            c1=sc.nextInt();
            System.out.println("Enter row of matrix2: ");
            r2=sc.nextInt();
            System.out.println("Enter column of matrix2: ");
            c2=sc.nextInt();
            m1=new int[r1][c1];
            m2=new int[r2][c2];
            r=new int[r1][c2];
            if(c1==r2){
                System.out.println("Enter elements of matrix1:");
                for(int i=0;i<r1;i++){
                    for(int j=0;j<c1;j++){
                        m1[i][j]=sc.nextInt();
                    }
                }
                System.out.println("Enter elements of matrix2:");
                for(int i=0;i<r2;i++){
                    for(int j=0;j<c2;j++){
                        m2[i][j]=sc.nextInt();
                    }
                }
                for(int k=0;k<c1;k++){
                    for(int i=0;i<r1;i++){
                        for(int j=0;j<c2;j++){
                            r[i][j]+=m1[i][k]*m2[k][j];
                        }
                    }
                }
                System.out.println("Resultant matrix is:");
                for(int i=0;i<r1;i++){
                    for(int j=0;j<c2;j++){
                        System.out.print(r[i][j]+"\t");
                    }
                    System.out.println();
                }
            }
            else{
                System.out.println("Multiplication not possible");
            }
        }
        }

    }
    


