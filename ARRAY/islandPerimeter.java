package ARRAYS;

import java.util.Scanner;

public class islandPerimeter {
    static int landPerimeter(int[][] grid) {
        int row=grid.length,col=grid[0].length,loop=row*col,peri=0;
        while(loop>0){
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){//grid[][]
                    if(grid[i][j]==1){
                        peri+=4;
                        if(j-1!=-1&&grid[i][j-1]==1) peri-=1;
                        if(j+1!=col&&grid[i][j+1]==1) peri-=1;
                        if(i-1!=-1&&grid[i-1][j]==1)peri-=1;
                        if(i+1!=row&&grid[i+1][j]==1)peri-=1;
                    }
                    loop--;
                }
            }
        }
        return peri;
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
       int row=sc.nextInt();
       int col=sc.nextInt();
       if(row<=1 && row>=100 &&col<=1 && col>=100){
        int grid[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for (int index = 0; index <col; index++) {
                grid[i][index]=sc.nextInt();
            }
        }
        System.out.println(landPerimeter(grid));
       }
       sc.close();
    }
}
