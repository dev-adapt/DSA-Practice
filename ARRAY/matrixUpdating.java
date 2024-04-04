package ARRAYS;

import java.util.Scanner;
import java.lang.Math;
public class matrixUpdating {
   static int[][] updateMatrix(int[][] grid){
    int row=grid.length,col=grid[0].length,loop=row*col;
    int mat[][]=new int[row][col];
    while(loop>0){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){//grid[][]
                if(grid[i][j]==1){
                    int pos=1;
                    while(pos==1){
                        int num=1;
                        if(j-num!=-1&&grid[i][j-num]==0){
                            mat[i][j]=num;
                            break;
                        }
                        if(j+num!=col&&grid[i][j+num]==0){
                            mat[i][j]=num;
                            break;
                        }
                        if(i-num!=-1&&grid[i-num][j]==0){
                            mat[i][j]=num;
                            break;
                        }
                        if(i+num!=row&&grid[i+num][j]==0){
                             mat[i][j]=num;
                            break;
                        }else{
                            num++;
                        }loop--;
                    }
                }else{
                    mat[i][j]=0;
                    loop--;
                }
            }
        }
    }
    return mat;
   }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
       int row=sc.nextInt();
       int col=sc.nextInt();
       int check=(int)(Math.pow(10,4));
       if(row<=1 && row>=check &&col<=1 && col>=check&& row*col<=check){
        int grid[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for (int index = 0; index <col; index++) {
                grid[i][index]=sc.nextInt();
            }
        }
       int mat[][]=updateMatrix(grid);
        for(int i=0;i<row;i++){
            for (int index = 0; index <col; index++) {
                System.out.print(mat[i][index]);
            }
        }
    }
     sc.close();
}
}
