package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class no1068 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] s1=in.readLine().split(" ");
		int column=Integer.parseInt(s1[0]);
		int row=Integer.parseInt(s1[1]);
		int TOL=Integer.parseInt(s1[2]);
		HashMap<Integer, Integer> list=new HashMap<Integer,Integer>();
		int X=-1;
		int Y=-1;
		int[][] dir= {{1,0},{-1,0},{0,-1},{0,1},{1,1},{1,-1},{-1,1},{-1,-1}};
		int[][] pixel=new int[row][column];
		for(int i=0;i<row;i++)
	    	{
			   String[] temp=in.readLine().split("\\s+");
			   for(int j=0;j<column;j++)
			   {	  pixel[i][j]=Integer.parseInt(temp[j]);
			   if(list.containsKey(pixel[i][j]))
			   list.put(pixel[i][j], list.get(pixel[i][j])+1);
			   else
				   list.put(pixel[i][j], 1);}
			
			}
		in.close();
		int count=0;
		for(int i=0;i<row;i++)
    	{
		   for(int j=0;j<column;j++)
		   {
			   int x;
		       int y;
			   int num=pixel[i][j];
			   int k=0;
			   for(k=0;k<8;k++)
			   {
	               x=i+dir[k][0];
				   y=j+dir[k][1];
				   if(x>=0&&x<row&&y>=0&&y<column&&Math.abs(pixel[x][y]-num)<=TOL)
				   break;
			   }
			   if(k==8&&list.get(num)==1)
			   {
				   count++;
				   X=i;
				   Y=j;
			   }
		   }
	  }
		if(count>1)
			System.out.print("Not Unique");
		else if(count==1)
			System.out.printf("(%d, %d): %d",Y+1,X+1,pixel[X][Y]);
		else 
			System.out.print("Not Exist");
			
	}
		
}
